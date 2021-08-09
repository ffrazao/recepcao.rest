package com.frazao.recepcao.bo.recepcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.EntidadeRepresentanteDAO;
import com.frazao.recepcao.modelo.dto.recepcao.EntidadeRepresentanteFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.EntidadeRepresentante;

@Service
public class EntidadeRepresentanteBO extends
		CRUDBO<EntidadeRepresentante, java.lang.Integer, EntidadeRepresentanteFiltroDTO, EntidadeRepresentanteDAO> {

	public EntidadeRepresentanteBO(@Autowired EntidadeRepresentanteDAO dao) {
		super(EntidadeRepresentante.class, dao);
	}

	public EntidadeRepresentanteDAO getDAO() {
		return (EntidadeRepresentanteDAO) super.getDAO();
	}

}
