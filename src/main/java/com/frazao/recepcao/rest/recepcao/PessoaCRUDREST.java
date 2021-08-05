package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.PessoaBO;
import com.frazao.recepcao.modelo.dto.recepcao.PessoaFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Pessoa;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "pessoa")
public class PessoaCRUDREST extends CRUDREST<Pessoa, java.lang.Integer, PessoaFiltroDTO, PessoaBO> {

   public PessoaCRUDREST(@Autowired PessoaBO bo) {
      super(bo);
   }

   public PessoaBO getBO() {
	  return super.getBO();
   }

	@Override
	public Pessoa prepararForm(Pessoa modelo, Principal usuario) throws Exception {
		return modelo == null ? new Pessoa() : modelo;
	}

}
