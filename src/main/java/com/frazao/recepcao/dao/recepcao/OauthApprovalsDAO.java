package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.OauthApprovals;

@Repository
public interface OauthApprovalsDAO extends JpaRepository<OauthApprovals, Integer>, OauthApprovalsDAOFiltro {

}
