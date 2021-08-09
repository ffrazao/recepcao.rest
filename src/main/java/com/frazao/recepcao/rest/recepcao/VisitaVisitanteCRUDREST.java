package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.VisitaVisitanteBO;
import com.frazao.recepcao.modelo.dto.recepcao.VisitaVisitanteFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.VisitaVisitante;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "visita-visitante")
public class VisitaVisitanteCRUDREST
		extends CRUDREST<VisitaVisitante, java.lang.Integer, VisitaVisitanteFiltroDTO, VisitaVisitanteBO> {

	public VisitaVisitanteCRUDREST(@Autowired VisitaVisitanteBO bo) {
		super(bo);
	}

	public VisitaVisitanteBO getBO() {
		return super.getBO();
	}

	@Override
	public VisitaVisitante prepararForm(VisitaVisitante modelo, Principal usuario) throws Exception {
		return modelo == null ? new VisitaVisitante() : modelo;
	}

}
