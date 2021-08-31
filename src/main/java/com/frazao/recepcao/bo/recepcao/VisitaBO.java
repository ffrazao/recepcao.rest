package com.frazao.recepcao.bo.recepcao;

import java.security.Principal;
import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.BOException;
import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.VisitaDAO;
import com.frazao.recepcao.dao.recepcao.VisitaVisitanteDAO;
import com.frazao.recepcao.modelo.dto.recepcao.VisitaFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Visita;

@Service
public class VisitaBO extends CRUDBO<Visita, java.lang.Integer, VisitaFiltroDTO, VisitaDAO> {

	@Autowired
	private VisitaVisitanteDAO visitaVisitanteDAO;

	public VisitaBO(@Autowired VisitaDAO dao) {
		super(Visita.class, dao);
	}

	@Override
	public VisitaDAO getDAO() {
		return super.getDAO();
	}

	@Override
	public Collection<Visita> filter(@Valid final VisitaFiltroDTO filtro, Principal usuario) throws BOException {
		Collection<Visita> result = super.filter(filtro, usuario);
		if (!result.isEmpty()) {
			for (Visita v : result) {
				v.setVisitaVisitanteList(this.visitaVisitanteDAO.findByVisita(v));
				v.getVisitaVisitanteList().forEach(vv -> vv.setVisita(null));
			}
		}
		return result;
	}

}
