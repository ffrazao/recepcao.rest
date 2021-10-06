package com.frazao.recepcao.rest.recepcao;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frazao.recepcao.bo.recepcao.VisitaBO;
import com.frazao.recepcao.modelo.dto.recepcao.VisitaFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Visita;
import com.frazao.recepcao.rest.CRUDREST;

@RestController
@RequestMapping(value = "visita")
public class VisitaCRUDREST extends CRUDREST<Visita, Integer, VisitaFiltroDTO, VisitaBO> {

	public VisitaCRUDREST(@Autowired VisitaBO bo) {
		super(bo);
	}

	@PostMapping
	public Integer create(@RequestBody final Visita entidade, Principal usuario) throws Exception {
		final Integer result = this.getBO().create(prepararForm(entidade, usuario), usuario);
		return result;
	}

	public VisitaBO getBO() {
		return super.getBO();
	}
	
	@Override
	public Visita prepararForm(Visita modelo, Principal usuario) throws Exception {
		modelo = super.prepararForm(modelo, usuario);
		modelo.setEntrada(LocalDateTime.now());
		modelo.setIncluidoPor(this.getUsuarioSomenteIdLogin(usuario));

		return modelo;
	}
	

	@PutMapping("/registrar-saida/{id}")
	public Map<String, Object> registrarSaida(@PathVariable Integer id, Principal usuario) {
		return getBO().registrarSaida(id, usuario);
	}

}
