package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.VisitaBO;
import com.frazao.recepcao.modelo.dto.recepcao.VisitaFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Visita;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "visita")
public class VisitaCRUDREST extends CRUDREST<Visita, java.lang.Integer, VisitaFiltroDTO, VisitaBO> {

	public VisitaCRUDREST(@Autowired VisitaBO bo) {
		super(bo);
	}

	public VisitaBO getBO() {
		return super.getBO();
	}

	@Override
	public Visita prepararForm(Visita modelo, Principal usuario) throws Exception {
		return modelo == null ? new Visita() : modelo;
	}

}
