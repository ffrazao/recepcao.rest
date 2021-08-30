package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.FuncionarioBO;
import com.frazao.recepcao.modelo.dto.recepcao.FuncionarioFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Funcionario;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "funcionario")
public class FuncionarioCRUDREST extends CRUDREST<Funcionario, Integer, FuncionarioFiltroDTO, FuncionarioBO> {

	public FuncionarioCRUDREST(@Autowired FuncionarioBO bo) {
		super(bo);
	}

	public FuncionarioBO getBO() {
		return super.getBO();
	}

	@Override
	public Funcionario prepararForm(Funcionario modelo, Principal usuario) throws Exception {
		return modelo == null ? new Funcionario() : modelo;
	}

}
