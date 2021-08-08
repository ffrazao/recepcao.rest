package com.frazao.recepcao.config.seguranca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.frazao.recepcao.bo.recepcao.UsuarioBO;
import com.frazao.recepcao.modelo.dominio.Confirmacao;
import com.frazao.recepcao.modelo.entidade.recepcao.Usuario;

/**
 * Created by Frazão
 */
public class JdbcUserDetails implements UserDetailsService {

	public static void main(final String[] args) {
		final BCryptPasswordEncoder e = new BCryptPasswordEncoder(4);
		System.out.println(e.encode(new String("recepcao_web")));
		System.out.println(e.encode(new String("a")));
	}

	@Autowired
	private UsuarioBO bo;

	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		final Usuario usuario = this.bo.findByLogin(username);

		if (usuario == null) {
			throw new UsernameNotFoundException("Usuário " + username + " não encontrado");
		}

		final List<GrantedAuthority> perfilList = new ArrayList<>();
		// perfilList.add(new SimpleGrantedAuthority(""));
		if (usuario.getPerfil() != null) {
			perfilList.addAll(Arrays.asList(usuario.getPerfil().split(",")).stream()
					.map(p -> new SimpleGrantedAuthority(p.trim().toUpperCase())).collect(Collectors.toList()));
		}

		final User user = new User(username, usuario.getSenha(), Confirmacao.S.equals(usuario.getAtivo()), true, true,
				true, perfilList);
		return user;
	}

}
