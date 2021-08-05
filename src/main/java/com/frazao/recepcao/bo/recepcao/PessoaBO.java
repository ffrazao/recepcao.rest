package com.frazao.recepcao.bo.recepcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.PessoaDAO;
import com.frazao.recepcao.modelo.dto.recepcao.PessoaFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Pessoa;

@Service
public class PessoaBO extends CRUDBO<Pessoa, java.lang.Integer, PessoaFiltroDTO, PessoaDAO> {

   public PessoaBO(@Autowired PessoaDAO dao) {
      super(Pessoa.class, dao);
   }

}

