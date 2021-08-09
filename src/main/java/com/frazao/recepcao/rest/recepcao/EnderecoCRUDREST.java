package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.EnderecoBO;
import com.frazao.recepcao.modelo.dto.recepcao.EnderecoFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Endereco;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "endereco")
public class EnderecoCRUDREST extends CRUDREST<Endereco, java.lang.Integer, EnderecoFiltroDTO, EnderecoBO> {

	public EnderecoCRUDREST(@Autowired EnderecoBO bo) {
		super(bo);
	}

	public EnderecoBO getBO() {
		return super.getBO();
	}

	@Override
	public Endereco prepararForm(Endereco modelo, Principal usuario) throws Exception {
		return modelo == null ? new Endereco() : modelo;
	}

}
