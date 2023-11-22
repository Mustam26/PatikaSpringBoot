package com.mehmet.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
	
	

}
