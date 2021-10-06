package com.frazao.recepcao.rest;

import java.security.Principal;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.bo.recepcao.UsuarioBO;
import com.frazao.recepcao.modelo.dto.FiltroDTO;
import com.frazao.recepcao.modelo.entidade.EntidadeBaseTemId;
import com.frazao.recepcao.modelo.entidade.recepcao.Usuario;

@RestController
public abstract class CRUDREST<E extends EntidadeBaseTemId<Id>, Id, F extends FiltroDTO, BO extends CRUDBO<E, Id, F, ?>> {

	private final BO bo;
	
	@Autowired
	private UsuarioBO usuarioBO;

	public CRUDREST(final BO bo) {
		this.bo = bo;
	}
	
	public Usuario getUsuario(Principal principal) {
		Usuario result = this.usuarioBO.findByLogin(principal.getName());
		return result;
	}
	
	public Usuario getUsuarioSomenteId(Principal principal) {
		Usuario result = new Usuario(this.getUsuario(principal).getId());
		return result;
	}
	
	public Usuario getUsuarioSomenteIdLogin(Principal principal) {
		Usuario result = this.getUsuario(principal);
		return new Usuario(result.getId(), result.getLogin());
	}

	@PostMapping
	public Id create(@RequestBody final E t, Principal usuario) throws Exception {
		final Id result = this.getBO().create(t, usuario);
		return result;
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") final Id id, Principal usuario) throws Exception {
		this.getBO().delete(id, usuario);
	}

	@GetMapping
	public Collection<E> filter(final F filtro, Principal usuario) throws Exception {
		final Collection<E> result = this.getBO().filter(filtro, usuario);
		return result;
	}

	public BO getBO() {
		BO result = this.bo;
		return result;
	}

	@PostMapping("preparar-form")
	public E prepararForm(@RequestBody(required = false) final E modelo, Principal usuario) throws Exception {
		final E result = this.getBO().prepararForm(modelo, usuario);
		return result;
	}

	@GetMapping("{id}")
	public E restore(@PathVariable("id") final Id id, Principal usuario) throws Exception {
		final E result = this.getBO().restore(id, usuario);
		return result;
	}

	@PutMapping("{id}")
	public void update(@PathVariable("id") final Id id, @RequestBody final E t, Principal usuario) throws Exception {
		this.getBO().update(id, t, usuario);
	}

}
