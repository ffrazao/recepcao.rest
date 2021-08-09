package com.frazao.recepcao.bo.recepcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.UnidadeOrganizacionalDAO;
import com.frazao.recepcao.modelo.dto.recepcao.UnidadeOrganizacionalFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.UnidadeOrganizacional;

@Service
public class UnidadeOrganizacionalBO extends
		CRUDBO<UnidadeOrganizacional, java.lang.Integer, UnidadeOrganizacionalFiltroDTO, UnidadeOrganizacionalDAO> {

	public UnidadeOrganizacionalBO(@Autowired UnidadeOrganizacionalDAO dao) {
		super(UnidadeOrganizacional.class, dao);
	}

	public UnidadeOrganizacionalDAO getDAO() {
		return (UnidadeOrganizacionalDAO) super.getDAO();
	}

}
