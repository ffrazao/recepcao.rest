package com.frazao.recepcao.bo.recepcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.FuncionarioDAO;
import com.frazao.recepcao.modelo.dto.recepcao.FuncionarioFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Funcionario;
import com.frazao.recepcao.modelo.entidade.recepcao.Pessoa;

@Service
public class FuncionarioBO extends CRUDBO<Funcionario, Pessoa, FuncionarioFiltroDTO, FuncionarioDAO> {

	public FuncionarioBO(@Autowired FuncionarioDAO dao) {
		super(Funcionario.class, dao);
	}

	public FuncionarioDAO getDAO() {
		return (FuncionarioDAO) super.getDAO();
	}

}
