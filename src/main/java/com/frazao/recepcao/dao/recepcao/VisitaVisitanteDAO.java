package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.frazao.recepcao.modelo.entidade.recepcao.Usuario;
import com.frazao.recepcao.modelo.entidade.recepcao.VisitaVisitante;

@Repository
public interface VisitaVisitanteDAO
		extends JpaRepository<VisitaVisitante, java.lang.Integer>, VisitaVisitanteDAOFiltro {
	
	@Modifying
	@Query("update VisitaVisitante u set u.saida = now(), u.saidaUsuario = ?2 where u.id = ?1")
	void registrarSaida(Integer id, Usuario usuario);

}
