package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.Pessoa;
import com.frazao.recepcao.modelo.entidade.recepcao.Visitante;

@Repository
public interface VisitanteDAO extends JpaRepository<Visitante, Pessoa>, VisitanteDAOFiltro {

}
