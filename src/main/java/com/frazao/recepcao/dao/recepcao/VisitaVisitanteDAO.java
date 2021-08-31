package com.frazao.recepcao.dao.recepcao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.Visita;
import com.frazao.recepcao.modelo.entidade.recepcao.VisitaVisitante;

@Repository
public interface VisitaVisitanteDAO
		extends JpaRepository<VisitaVisitante, java.lang.Integer>, VisitaVisitanteDAOFiltro {

	List<VisitaVisitante> findByVisita(Visita visita);

}
