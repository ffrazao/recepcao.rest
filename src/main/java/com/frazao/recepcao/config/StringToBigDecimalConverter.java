package com.frazao.recepcao.config;

import static com.frazao.recepcao.util.Ferramenta.converterStringParaBigDecimal;

import java.math.BigDecimal;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToBigDecimalConverter implements Converter<String, BigDecimal> {

	@Override
	public BigDecimal convert(String str) {
		BigDecimal result = converterStringParaBigDecimal(str);
		return result;
	}

}
