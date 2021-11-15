package com.frazao.recepcao.dao.recepcao.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.lang3.StringUtils;

import com.frazao.recepcao.dao.recepcao.VisitanteDAOFiltro;
import com.frazao.recepcao.modelo.dto.recepcao.VisitanteFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Visitante;

public class VisitanteDAOFiltroImpl implements VisitanteDAOFiltro {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Visitante> filtrar(VisitanteFiltroDTO f) {

		StringBuilder sql = new StringBuilder();
		sql.append("SELECT em.*").append("\n");
		sql.append("FROM   recepcao.visitante as em").append("\n");
		sql.append("JOIN   recepcao.pessoa as pes").append("\n");
		sql.append("ON     pes.id = em.id").append("\n");
		StringBuilder arg = new StringBuilder();
		if (StringUtils.isNotBlank(f.getNome())) {
			arg.append(adWhere(arg)).append("em.nome like :nome").append("\n");
		}
		if (StringUtils.isNotBlank(f.getCpfCnpj())) {
			arg.append(adWhere(arg)).append("pes.cpf_cnpj = :cpfCnpj").append("\n");
		}
		sql.append(arg);
		sql.append("ORDER BY 1").append("\n");
		Query query = entityManager.createNativeQuery(sql.toString(), Visitante.class);
		if (StringUtils.isNotBlank(f.getNome())) {
			query.setParameter("nome", like(f.getNome()));
		}
		if (StringUtils.isNotBlank(f.getCpfCnpj())) {
			query.setParameter("cpfCnpj", f.getCpfCnpj());
		}

		return query.getResultList();

	}

}
