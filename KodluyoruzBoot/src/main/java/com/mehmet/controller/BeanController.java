package com.mehmet.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mehmet.bean.BeanConfig;

import jakarta.annotation.PostConstruct;

@Controller
@ComponentScan("com.mehmet.bean")
public class BeanController {

	@Autowired // İnject'in Springdeki karşılığı
	BeanConfig beanConfig;
	
	@Autowired
	Logger log;
	
	
	/**
	 * @param beanConfig
	 * @param log
	 */
	public void deneme() {
		log.info("Log info çağrıldı");
	
	}

//	@PostConstruct
//	public void init() {
//		log.info("Log info çağırıldı");
//		System.out.println("init çalıştı");
//	}
	public static void main(String[] args) {
		BeanController beanController=new BeanController();
		System.out.println(beanController);
		//beanController.log.info("Post construct işe yaramış");
		
	}
	// http:localhost:8080/bean/beanDto
	@ResponseBody // herhangi bir xhtml veya html gibi yapı olmadan direk veriyi ekranda göstermye yarar
	@GetMapping("/bean/beanDto")
	public String getBeanDto() {
		return beanConfig.beanDto()+" ";
		
	}
}
