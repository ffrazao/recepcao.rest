package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.Pessoa;

@Repository
public interface PessoaDAO extends JpaRepository<Pessoa, java.lang.Integer>, PessoaDAOFiltro {

}
