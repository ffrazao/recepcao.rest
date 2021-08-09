package com.frazao.recepcao.bo.recepcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.LocalDAO;
import com.frazao.recepcao.modelo.dto.recepcao.LocalFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Local;

@Service
public class LocalBO extends CRUDBO<Local, java.lang.Integer, LocalFiltroDTO, LocalDAO> {

	public LocalBO(@Autowired LocalDAO dao) {
		super(Local.class, dao);
	}

	public LocalDAO getDAO() {
		return (LocalDAO) super.getDAO();
	}

}
