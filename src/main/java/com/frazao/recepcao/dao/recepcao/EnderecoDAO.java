package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.Endereco;

@Repository
public interface EnderecoDAO extends JpaRepository<Endereco, java.lang.Integer>, EnderecoDAOFiltro {

}
