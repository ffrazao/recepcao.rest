package com.frazao.recepcao.util.email;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

	void sendMail(SimpleMailMessage msg);

	void sendRecuperarToken(MensagemEmail msg);

}