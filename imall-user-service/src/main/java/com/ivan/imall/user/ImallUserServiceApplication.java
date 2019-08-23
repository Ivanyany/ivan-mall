package com.ivan.imall.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDubbo
@MapperScan(basePackages = "com.ivan.imall.user.mapper")
public class ImallUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImallUserServiceApplication.class, args);
	}

}
