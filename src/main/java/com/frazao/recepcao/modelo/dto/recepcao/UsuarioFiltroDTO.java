package com.frazao.recepcao.modelo.dto.recepcao;

import java.util.Set;

import com.frazao.recepcao.modelo.dominio.Confirmacao;
import com.frazao.recepcao.modelo.dominio.recepcao.UsuarioPerfil;
import com.frazao.recepcao.modelo.dto.FiltroIdDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UsuarioFiltroDTO extends FiltroIdDTO {

	private static final long serialVersionUID = 1L;

	private Confirmacao ativo;

	private String email;

	private String login;

	private Set<UsuarioPerfil> perfil;

}
