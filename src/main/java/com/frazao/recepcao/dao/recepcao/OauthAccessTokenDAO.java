package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.OauthAccessToken;

@Repository
public interface OauthAccessTokenDAO
		extends JpaRepository<OauthAccessToken, java.lang.Integer>, OauthAccessTokenDAOFiltro {

}
