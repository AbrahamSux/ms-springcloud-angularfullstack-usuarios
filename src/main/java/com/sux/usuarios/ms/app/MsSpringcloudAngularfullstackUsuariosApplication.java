package com.sux.usuarios.ms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsSpringcloudAngularfullstackUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSpringcloudAngularfullstackUsuariosApplication.class, args);
	}

}
