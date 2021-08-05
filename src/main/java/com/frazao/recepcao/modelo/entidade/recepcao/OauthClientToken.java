package com.frazao.recepcao.modelo.entidade.recepcao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.frazao.recepcao.modelo.entidade.EntidadeBase;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "OauthClientToken")
@Table(name = "oauth_client_token")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class OauthClientToken extends EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "authentication_id")
	private String authenticationId;

	@Column(name = "client_id")
	private String clientId;

	@Column(name = "token")
	@Lob
	private byte[] token;

	@Column(name = "token_id")
	private String tokenId;

	@Column(name = "user_name")
	private String userName;

}
