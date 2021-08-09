package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.Local;

@Repository
public interface LocalDAO extends JpaRepository<Local, java.lang.Integer>, LocalDAOFiltro {

}
