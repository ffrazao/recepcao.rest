package com.frazao.recepcao.bo.recepcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.VisitanteDAO;
import com.frazao.recepcao.modelo.dto.recepcao.VisitanteFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Visitante;

@Service
public class VisitanteBO extends CRUDBO<Visitante, Integer, VisitanteFiltroDTO, VisitanteDAO> {

	public VisitanteBO(@Autowired VisitanteDAO dao) {
		super(Visitante.class, dao);
	}

	public VisitanteDAO getDAO() {
		return (VisitanteDAO) super.getDAO();
	}

}
