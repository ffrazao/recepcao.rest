package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.EntidadeRepresentante;

@Repository
public interface EntidadeRepresentanteDAO
		extends JpaRepository<EntidadeRepresentante, java.lang.Integer>, EntidadeRepresentanteDAOFiltro {

}
