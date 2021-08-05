package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.OauthClientDetails;

@Repository
public interface OauthClientDetailsDAO
		extends JpaRepository<OauthClientDetails, java.lang.Integer>, OauthClientDetailsDAOFiltro {

}
