package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.Lotacao;

@Repository
public interface LotacaoDAO extends JpaRepository<Lotacao, java.lang.Integer>, LotacaoDAOFiltro {

}
