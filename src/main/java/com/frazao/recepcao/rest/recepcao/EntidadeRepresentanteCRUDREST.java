package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.EntidadeRepresentanteBO;
import com.frazao.recepcao.modelo.dto.recepcao.EntidadeRepresentanteFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.EntidadeRepresentante;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "entidade-representante")
public class EntidadeRepresentanteCRUDREST extends
		CRUDREST<EntidadeRepresentante, java.lang.Integer, EntidadeRepresentanteFiltroDTO, EntidadeRepresentanteBO> {

	public EntidadeRepresentanteCRUDREST(@Autowired EntidadeRepresentanteBO bo) {
		super(bo);
	}

	public EntidadeRepresentanteBO getBO() {
		return super.getBO();
	}

	@Override
	public EntidadeRepresentante prepararForm(EntidadeRepresentante modelo, Principal usuario) throws Exception {
		return modelo == null ? new EntidadeRepresentante() : modelo;
	}

}
