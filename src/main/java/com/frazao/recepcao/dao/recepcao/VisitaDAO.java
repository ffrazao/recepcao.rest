package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.Visita;

@Repository
public interface VisitaDAO extends JpaRepository<Visita, java.lang.Integer>, VisitaDAOFiltro {

}
