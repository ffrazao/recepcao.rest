package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.LocalBO;
import com.frazao.recepcao.modelo.dto.recepcao.LocalFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Local;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "local")
public class LocalCRUDREST extends CRUDREST<Local, java.lang.Integer, LocalFiltroDTO, LocalBO> {

	public LocalCRUDREST(@Autowired LocalBO bo) {
		super(bo);
	}

	public LocalBO getBO() {
		return super.getBO();
	}

	@Override
	public Local prepararForm(Local modelo, Principal usuario) throws Exception {
		return modelo == null ? new Local() : modelo;
	}

}
