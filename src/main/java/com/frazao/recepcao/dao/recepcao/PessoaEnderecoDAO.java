package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.PessoaEndereco;

@Repository
public interface PessoaEnderecoDAO extends JpaRepository<PessoaEndereco, java.lang.Integer>, PessoaEnderecoDAOFiltro {

}
