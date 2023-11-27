package com.mehmet.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // konfigrasyon datası olduğunu gösterir
public class BeanConfig {

	@Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod") // Bu methodun bir bean olduğunu gösterir
	@Scope("singleton")
	//@Scope("request")
	//@Scope("session")
	public BeanDto beanDto() {
		
		return BeanDto.builder()
				.beanName("bean Adi").beanData("bean Data").id(0L)
				.build();
	}
}
