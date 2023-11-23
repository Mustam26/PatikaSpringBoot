package com.mehmet.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // konfigrasyon datası olduğunu gösterir
public class BeanConfig {

	@Bean // Bu methodun bir bean olduğunu gösterir
	public BeanDto beanDto() {
		
		return BeanDto.builder()
				.beanName("bean Adi").beanData("bean Data").id(0L)
				.build();
	}
}
