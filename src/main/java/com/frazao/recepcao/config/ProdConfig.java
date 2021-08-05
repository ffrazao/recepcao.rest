package com.frazao.recepcao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.frazao.recepcao.util.email.EmailService;
import com.frazao.recepcao.util.email.SmtpEmailService;

@Configuration
@Profile("heroku.prod")
public class ProdConfig {

	@Bean
	public EmailService instantiateEmailService() {
		return new SmtpEmailService();
	}

}
