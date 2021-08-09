package com.frazao.recepcao.bo.recepcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frazao.recepcao.bo.CRUDBO;
import com.frazao.recepcao.dao.recepcao.LotacaoDAO;
import com.frazao.recepcao.modelo.dto.recepcao.LotacaoFiltroDTO;
import com.frazao.recepcao.modelo.entidade.recepcao.Lotacao;

@Service
public class LotacaoBO extends CRUDBO<Lotacao, java.lang.Integer, LotacaoFiltroDTO, LotacaoDAO> {

	public LotacaoBO(@Autowired LotacaoDAO dao) {
		super(Lotacao.class, dao);
	}

	public LotacaoDAO getDAO() {
		return (LotacaoDAO) super.getDAO();
	}

}
