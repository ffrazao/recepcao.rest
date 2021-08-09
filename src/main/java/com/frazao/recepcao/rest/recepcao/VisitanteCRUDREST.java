package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.VisitanteBO;
import com.frazao.recepcao.modelo.dto.recepcao.VisitanteFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Pessoa;
import com.frazao.recepcao.modelo.entidade.recepcao.Visitante;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "visitante")
public class VisitanteCRUDREST extends CRUDREST<Visitante, Pessoa, VisitanteFiltroDTO, VisitanteBO> {

	public VisitanteCRUDREST(@Autowired VisitanteBO bo) {
		super(bo);
	}

	public VisitanteBO getBO() {
		return super.getBO();
	}

	@Override
	public Visitante prepararForm(Visitante modelo, Principal usuario) throws Exception {
		return modelo == null ? new Visitante() : modelo;
	}

}
