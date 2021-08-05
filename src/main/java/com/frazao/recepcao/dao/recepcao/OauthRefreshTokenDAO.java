package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.OauthRefreshToken;

@Repository
public interface OauthRefreshTokenDAO extends JpaRepository<OauthRefreshToken, Integer>, OauthRefreshTokenDAOFiltro {

}
