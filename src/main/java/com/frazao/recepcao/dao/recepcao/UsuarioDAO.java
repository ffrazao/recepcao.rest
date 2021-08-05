package com.frazao.recepcao.dao.recepcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.frazao.recepcao.modelo.entidade.recepcao.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer>, UsuarioDAOFiltro {

	Usuario findByEmail(String email);

	Usuario findByEmailAndRecuperarSenhaToken(String email, String token);

	Usuario findByLogin(String valor);

	Usuario findByPessoaId(Integer valor);

	@Modifying
	@Query("update Usuario u set u.senha = ?2, u.recuperarSenhaToken = null, u.recuperarSenhaExpira = null where u.id = ?1")
	void updateSenhaAndRecuperarSenhaTokenAndRecuperarSenhaExpiraById(Integer id, String senha);

}
