package com.frazao.recepcao.bo.recepcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.VisitaDAO;
import com.frazao.recepcao.modelo.dto.recepcao.VisitaFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Visita;

@Service
public class VisitaBO extends CRUDBO<Visita, java.lang.Integer, VisitaFiltroDTO, VisitaDAO> {

	public VisitaBO(@Autowired VisitaDAO dao) {
		super(Visita.class, dao);
	}

	public VisitaDAO getDAO() {
		return (VisitaDAO) super.getDAO();
	}

}
