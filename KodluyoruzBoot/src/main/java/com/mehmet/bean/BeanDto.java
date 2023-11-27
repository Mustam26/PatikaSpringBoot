package com.mehmet.bean;

import org.springframework.security.access.event.PublicInvocationEvent;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.extern.log4j.Log4j2;
import lombok.*;

import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor //parametresiz constructor oluşturur
@AllArgsConstructor // paramtetreli constructor oluşturur
@Log4j2 // log fieldlarınmı oluşturur
@Builder
public class BeanDto {
	
	private Long id;
	private String beanName;
	private String beanData;
	
	// başlangıç methodu
	private void initialBeanMethod() {
		log.info("Bean başlamdan önce ben varım");
		System.out.println("Bean başlamdan önce çalışacak method");

	}
	// bitiş methodu
	public void destroyBeanMethod() {
		log.info("Bean sonlandırıldıktan sonra ben varım");
		System.out.println("Bean sonladırıldıktan sonra çalışacak method");
	}

}
