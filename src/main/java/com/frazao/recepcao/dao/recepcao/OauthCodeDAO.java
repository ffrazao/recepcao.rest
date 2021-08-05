package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.OauthCode;

@Repository
public interface OauthCodeDAO extends JpaRepository<OauthCode, Integer>, OauthCodeDAOFiltro {

}
