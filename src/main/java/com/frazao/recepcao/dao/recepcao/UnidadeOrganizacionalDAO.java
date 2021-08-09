package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.UnidadeOrganizacional;

@Repository
public interface UnidadeOrganizacionalDAO
		extends JpaRepository<UnidadeOrganizacional, java.lang.Integer>, UnidadeOrganizacionalDAOFiltro {

}
