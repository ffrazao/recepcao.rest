package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.OauthClientToken;

@Repository
public interface OauthClientTokenDAO
		extends JpaRepository<OauthClientToken, java.lang.Integer>, OauthClientTokenDAOFiltro {

}
