package com.frazao.recepcao.dao.recepcao.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.frazao.recepcao.dao.recepcao.VisitaVisitanteDAOFiltro;
import com.frazao.recepcao.modelo.dto.recepcao.VisitaVisitanteFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.VisitaVisitante;

public class VisitaVisitanteDAOFiltroImpl implements VisitaVisitanteDAOFiltro {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public Collection<VisitaVisitante> filtrar(VisitaVisitanteFiltroDTO f) {

		StringBuilder sql = new StringBuilder();
		sql.append("SELECT em.*").append("\n");
		sql.append("FROM   recepcao.visita_visitante as em").append("\n");
		StringBuilder arg = new StringBuilder();
		// if (StringUtils.isNotBlank(f.getCpfCnpj())) {
		// arg.append(adWhere(arg)).append("em.cpf_cnpj = :cpfCnpj").append("\n");
		// }
		// if (ObjectUtils.isNotEmpty(f.getTipo())) {
		// arg.append(adWhere(arg)).append("em.pessoa_tipo in :tipo").append("\n");
		// }
		sql.append(arg);
		sql.append("ORDER BY 1").append("\n");
		Query query = entityManager.createNativeQuery(sql.toString(), VisitaVisitante.class);
		// if (StringUtils.isNotBlank(f.getCpfCnpj())) {
		// query.setParameter("cpfCnpj", f.getCpfCnpj());
		// }
		// if (ObjectUtils.isNotEmpty(f.getTipo())) {
		// query.setParameter("tipo", f.getTipo().stream().map(v ->
		// v.name()).collect(Collectors.toSet()));
		// }
		return query.getResultList();

	}

}
