package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.UnidadeMedida;

@Repository
public interface UnidadeMedidaDAO extends JpaRepository<UnidadeMedida, java.lang.Integer>, UnidadeMedidaDAOFiltro {

}
