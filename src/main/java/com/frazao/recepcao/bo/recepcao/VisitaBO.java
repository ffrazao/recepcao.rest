package com.frazao.recepcao.bo.recepcao;

import java.security.Principal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.BOException;
import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.UsuarioDAO;
import com.frazao.recepcao.dao.recepcao.VisitaDAO;
import com.frazao.recepcao.dao.recepcao.VisitaVisitanteDAO;
import com.frazao.recepcao.modelo.dto.recepcao.VisitaFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Usuario;
import com.frazao.recepcao.modelo.entidade.recepcao.Visita;
import com.frazao.recepcao.modelo.entidade.recepcao.VisitaVisitante;

@Service
public class VisitaBO extends CRUDBO<Visita, java.lang.Integer, VisitaFiltroDTO, VisitaDAO> {

	@Autowired
	private VisitaVisitanteDAO visitaVisitanteDAO;

	@Autowired
	private UsuarioDAO usuarioDAO;

	public VisitaBO(@Autowired VisitaDAO dao) {
		super(Visita.class, dao);
	}

	@Override
	public VisitaDAO getDAO() {
		return super.getDAO();
	}

	@Override
	public Collection<Visita> filter(@Valid final VisitaFiltroDTO filtro, Principal usuario) throws BOException {
		Collection<Visita> result = super.filter(filtro, usuario);
		if (!result.isEmpty()) {
			for (Visita v : result) {
				v.setVisitaVisitanteList(this.visitaVisitanteDAO.findByVisita(v));
				v.getVisitaVisitanteList().forEach(vv -> vv.setVisita(null));
			}
		}
		return result;
	}

	@Transactional
	public Map<String, Object> registrarSaida(Integer id, Principal principal) {
		Usuario saidaUsuario = usuarioDAO.findByLogin(principal.getName());
		visitaVisitanteDAO.registrarSaida(id, saidaUsuario);
		Optional<VisitaVisitante> saida = visitaVisitanteDAO.findById(id);
		Map<String, Object> result = new HashMap<>();
		result.put("saidaUsuario", saidaUsuario);
		result.put("saida", saida.orElse(null).getSaida());
		return result;
	}

	@Override
	public Visita entrando(@Valid Visita t, @Valid Visita anterior, String acao) throws BOException {
		t.getVisitaVisitanteList().forEach(vv -> {
			if (vv.getSaidaUsuario() != null && vv.getSaidaUsuario().getId() == null) {
				vv.setSaidaUsuario(this.getUsuario(vv.getSaidaUsuario().getLogin()));
			}
		});
		return super.entrando(t, anterior, acao);
	}

}
