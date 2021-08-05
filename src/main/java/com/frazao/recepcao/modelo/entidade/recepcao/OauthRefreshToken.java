package com.frazao.recepcao.modelo.entidade.recepcao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.frazao.recepcao.modelo.entidade.EntidadeBase;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "OauthRefreshToken")
@Table(name = "oauth_refresh_token")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class OauthRefreshToken extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Column(name = "authentication")
	@Lob
	private byte[] authentication;

	@Column(name = "token")
	@Lob
	private byte[] token;

	@Id
	@Column(name = "token_id")
	private String tokenId;

}
