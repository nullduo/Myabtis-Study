package com.duo.free.mybootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @SpringBootApplication注解表示主程序是一个SpringBoot应用
 */
@SpringBootApplication
public class MybootDemoApplication {
	//psvm是IDEA的main的快捷键
	public static void main(String[] args) {
		//spring当前程序启动起来,run方法传入的类必须是@SpringBootApplication注解的类才可以
		SpringApplication.run(MybootDemoApplication.class, args);

	}

}
