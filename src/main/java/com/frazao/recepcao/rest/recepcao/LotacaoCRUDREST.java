package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.LotacaoBO;
import com.frazao.recepcao.modelo.dto.recepcao.LotacaoFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Lotacao;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "lotacao")
public class LotacaoCRUDREST extends CRUDREST<Lotacao, java.lang.Integer, LotacaoFiltroDTO, LotacaoBO> {

	public LotacaoCRUDREST(@Autowired LotacaoBO bo) {
		super(bo);
	}

	public LotacaoBO getBO() {
		return super.getBO();
	}

	@Override
	public Lotacao prepararForm(Lotacao modelo, Principal usuario) throws Exception {
		return modelo == null ? new Lotacao() : modelo;
	}

}
