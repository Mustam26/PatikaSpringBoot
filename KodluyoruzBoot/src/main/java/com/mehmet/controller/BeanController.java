package com.mehmet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mehmet.bean.BeanConfig;

@Controller
@ComponentScan("com.mehmet.bean")
public class BeanController {

	@Autowired // İnject'in Springdeki karşılığı
	BeanConfig beanConfig;
	// http:localhost:8080/bean/beanDto
	@ResponseBody // herhangi bir xhtml veya html gibi yapı olmadan direk veriyi ekranda göstermye yarar
	@GetMapping("/bean/beanDto")
	public String getBeanDto() {
		return beanConfig.beanDto()+" ";
		
	}
}
