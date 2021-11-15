package com.frazao.recepcao.dao.recepcao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import com.frazao.recepcao.dao.recepcao.VisitaDAOFiltro;
import com.frazao.recepcao.modelo.dto.recepcao.VisitaFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Visita;

public class VisitaDAOFiltroImpl implements VisitaDAOFiltro {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Visita> filtrar(VisitaFiltroDTO f) {
		// preparar o código da consulta principal
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT distinct em.*").append("\n");
		sql.append("FROM   recepcao.visita as em").append("\n");
		// incluir tabelas auxiliares
		if (StringUtils.isNotBlank(f.getNome()) || StringUtils.isNotBlank(f.getCpf())) {
            sql.append("JOIN   recepcao.visita_visitante as vv").append("\n");
            sql.append("ON     vv.visita_id = em.id").append("\n");
            sql.append("JOIN   recepcao.visitante as vi").append("\n");
            sql.append("ON     vi.id = vv.visitante_id").append("\n");
            sql.append("JOIN   recepcao.pessoa as pe").append("\n");
            sql.append("ON     pe.id = vi.id").append("\n");
		}
		// incluir condicões da consulta
		StringBuilder arg = new StringBuilder();
		List<Object> params = new ArrayList<>();
		if (ObjectUtils.isNotEmpty(f.getEntradaInicio())) {
		 	arg.append(adWhere(arg)).append("em.entrada >= ?").append("\n");
		 	params.add(f.getEntradaInicio());
		}
		if (ObjectUtils.isNotEmpty(f.getEntradaFim())) {
		 	arg.append(adWhere(arg)).append("em.entrada <= ?").append("\n");
		 	params.add(f.getEntradaFim());
		}
		if (ObjectUtils.isNotEmpty(f.getAutorizadorList())) {
			arg.append(adWhere(arg)).append("em.autorizador_id in ").append(in(f.getAutorizadorList())).append("\n");
			Stream.of(f.getAutorizadorList()).forEach(v -> params.add(v));
		}
		if (ObjectUtils.isNotEmpty(f.getEntradaLocalList())) {
			arg.append(adWhere(arg)).append("em.entrada_local_id in ").append(in(f.getEntradaLocalList())).append("\n");
			Stream.of(f.getEntradaLocalList()).forEach(v -> params.add(v));

		}
		if (ObjectUtils.isNotEmpty(f.getDestinoLocalList())) {
			arg.append(adWhere(arg)).append("em.destino_local_id in ").append(in(f.getDestinoLocalList())).append("\n");
			Stream.of(f.getDestinoLocalList()).forEach(v -> params.add(v));
		}
		if (ObjectUtils.isNotEmpty(f.getIncluidoPorList())) {
			arg.append(adWhere(arg)).append("em.incluido_por_id in ").append(in(f.getIncluidoPorList())).append("\n");
			Stream.of(f.getIncluidoPorList()).forEach(v -> params.add(v));
		}
		if (StringUtils.isNotBlank(f.getCpf())) {
			StringBuilder tmp = new StringBuilder();
		 	Stream.of(f.getCpf().split(";")).forEach(v -> {
		 		tmp.append(adOr(tmp)).append("pe.cpf_cnpj = ?").append("\n");
			 	params.add(v);
		 	});
		 	tmp.insert(0, "(").append(")").append("\n");
		 	arg.append(adWhere(arg)).append(tmp).append("\n");
		}
		if (StringUtils.isNotEmpty(f.getNome())) {
			StringBuilder tmp = new StringBuilder();
		 	Stream.of(f.getNome().split(";")).forEach(v -> {
		 		tmp.append(adOr(tmp)).append("pe.nome like ?").append("\n");
			 	params.add(like(v));
		 	});
		 	tmp.insert(0, "(").append(")").append("\n");
		 	arg.append(adWhere(arg)).append(tmp).append("\n");
		}
		sql.append(arg);
		// preparar ordenamento da consulta
		sql.append("ORDER BY em.entrada DESC").append("\n");
		// construir objeto de consulta do banco de dados
		Query query = entityManager.createNativeQuery(sql.toString(), Visita.class);
		// informar os parâmetros da consulta
		AtomicInteger i = new AtomicInteger(0);
		params.forEach(p -> query.setParameter(i.incrementAndGet(), p));
		// configurar paginação
		query.setFirstResult(f.getPagina() - 1);
		query.setMaxResults(f.getTamanho());
		// executar a consulta
		return query.getResultList();
	}

}
