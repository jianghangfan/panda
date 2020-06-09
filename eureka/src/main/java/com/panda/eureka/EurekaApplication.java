package com.panda.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
//	55555555

	private static  final Logger logger = LoggerFactory.getLogger(EurekaApplication.class);
//	public static void main(String[] args) {
//		SpringApplication.run(EurekaApplication.class, args);
//	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EurekaApplication.class);
		Environment env = app.run(args).getEnvironment();
		logger.info("启动成功");
		logger.info("Eureka地址：\thttp：//127.0.0.1:{}",env.getProperty("server.port"));
	}


}
