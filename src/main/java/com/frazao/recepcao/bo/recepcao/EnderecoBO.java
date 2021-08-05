package com.frazao.recepcao.bo.recepcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.EnderecoDAO;
import com.frazao.recepcao.modelo.dto.recepcao.EnderecoFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Endereco;

@Service
public class EnderecoBO extends CRUDBO<Endereco, java.lang.Integer, EnderecoFiltroDTO, EnderecoDAO> {

   public EnderecoBO(@Autowired EnderecoDAO dao) {
      super(Endereco.class, dao);
   }

}

