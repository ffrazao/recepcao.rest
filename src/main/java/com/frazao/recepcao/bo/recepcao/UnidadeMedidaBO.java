package com.frazao.recepcao.bo.recepcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.UnidadeMedidaDAO;
import com.frazao.recepcao.modelo.dto.recepcao.UnidadeMedidaFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.UnidadeMedida;

@Service
public class UnidadeMedidaBO extends CRUDBO<UnidadeMedida, java.lang.Integer, UnidadeMedidaFiltroDTO, UnidadeMedidaDAO> {

   public UnidadeMedidaBO(@Autowired UnidadeMedidaDAO dao) {
      super(UnidadeMedida.class, dao);
   }

}

