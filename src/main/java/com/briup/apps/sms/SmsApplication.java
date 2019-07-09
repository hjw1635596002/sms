package com.briup.apps.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.briup.apps.sms.web.controller.HanjwController;
/**
 * 用户控制
 * @author 韩京韦
 *
 */
@SpringBootApplication
public class SmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
		HanjwController hjw = new HanjwController();
		
	}

}
