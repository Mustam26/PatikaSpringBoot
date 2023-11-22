package com.mehmet.bean;

public class BeanConfig {

	public BeanDto beanDto() {
		
		return BeanDto.builder().beanName("bean Adi").beanData("bean Data").beanId(0L).build();
	}
}
