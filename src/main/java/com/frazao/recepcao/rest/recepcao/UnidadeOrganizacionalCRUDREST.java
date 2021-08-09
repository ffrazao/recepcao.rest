package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.UnidadeOrganizacionalBO;
import com.frazao.recepcao.modelo.dto.recepcao.UnidadeOrganizacionalFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.UnidadeOrganizacional;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "unidade-organizacional")
public class UnidadeOrganizacionalCRUDREST extends
		CRUDREST<UnidadeOrganizacional, java.lang.Integer, UnidadeOrganizacionalFiltroDTO, UnidadeOrganizacionalBO> {

	public UnidadeOrganizacionalCRUDREST(@Autowired UnidadeOrganizacionalBO bo) {
		super(bo);
	}

	public UnidadeOrganizacionalBO getBO() {
		return super.getBO();
	}

	@Override
	public UnidadeOrganizacional prepararForm(UnidadeOrganizacional modelo, Principal usuario) throws Exception {
		return modelo == null ? new UnidadeOrganizacional() : modelo;
	}

}
