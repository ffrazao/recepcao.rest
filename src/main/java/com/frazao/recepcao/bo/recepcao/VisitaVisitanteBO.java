package com.frazao.recepcao.bo.recepcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.VisitaVisitanteDAO;
import com.frazao.recepcao.modelo.dto.recepcao.VisitaVisitanteFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.VisitaVisitante;

@Service
public class VisitaVisitanteBO
		extends CRUDBO<VisitaVisitante, java.lang.Integer, VisitaVisitanteFiltroDTO, VisitaVisitanteDAO> {

	public VisitaVisitanteBO(@Autowired VisitaVisitanteDAO dao) {
		super(VisitaVisitante.class, dao);
	}

	public VisitaVisitanteDAO getDAO() {
		return (VisitaVisitanteDAO) super.getDAO();
	}

}
