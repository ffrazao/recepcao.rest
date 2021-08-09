package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.UnidadeMedidaBO;
import com.frazao.recepcao.modelo.dto.recepcao.UnidadeMedidaFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.UnidadeMedida;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "unidade-medida")
public class UnidadeMedidaCRUDREST
		extends CRUDREST<UnidadeMedida, java.lang.Integer, UnidadeMedidaFiltroDTO, UnidadeMedidaBO> {

	public UnidadeMedidaCRUDREST(@Autowired UnidadeMedidaBO bo) {
		super(bo);
	}

	public UnidadeMedidaBO getBO() {
		return super.getBO();
	}

	@Override
	public UnidadeMedida prepararForm(UnidadeMedida modelo, Principal usuario) throws Exception {
		return modelo == null ? new UnidadeMedida() : modelo;
	}

}
