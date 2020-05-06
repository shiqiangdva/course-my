package com.course.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(EurekaApplication.class, args);
//	}

	private static final Logger LOG = LoggerFactory.getLogger(GatewayApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(GatewayApplication.class);
		ConfigurableEnvironment env = app.run(args).getEnvironment();
		LOG.info("启动成功!");
		LOG.info("Gateway地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
