package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.PessoaEnderecoBO;
import com.frazao.recepcao.modelo.dto.recepcao.PessoaEnderecoFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.PessoaEndereco;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "pessoa-endereco")
public class PessoaEnderecoCRUDREST
		extends CRUDREST<PessoaEndereco, java.lang.Integer, PessoaEnderecoFiltroDTO, PessoaEnderecoBO> {

	public PessoaEnderecoCRUDREST(@Autowired PessoaEnderecoBO bo) {
		super(bo);
	}

	public PessoaEnderecoBO getBO() {
		return super.getBO();
	}

	@Override
	public PessoaEndereco prepararForm(PessoaEndereco modelo, Principal usuario) throws Exception {
		return modelo == null ? new PessoaEndereco() : modelo;
	}

}
