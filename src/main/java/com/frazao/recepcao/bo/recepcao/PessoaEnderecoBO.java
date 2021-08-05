package com.frazao.recepcao.bo.recepcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.PessoaEnderecoDAO;
import com.frazao.recepcao.modelo.dto.recepcao.PessoaEnderecoFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.PessoaEndereco;

@Service
public class PessoaEnderecoBO extends CRUDBO<PessoaEndereco, java.lang.Integer, PessoaEnderecoFiltroDTO, PessoaEnderecoDAO> {

   public PessoaEnderecoBO(@Autowired PessoaEnderecoDAO dao) {
      super(PessoaEndereco.class, dao);
   }

}

