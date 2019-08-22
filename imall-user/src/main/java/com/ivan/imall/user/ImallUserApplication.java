package com.ivan.imall.user;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;//使用通用mapper：tk.mybatis

/**
 * @Auther: Ivan
 * @Date: 2019/8/22 21:44
 * @Description:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ivan.imall.user.mapper")
public class ImallUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImallUserApplication.class, args);
	}

}
