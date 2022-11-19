package com.example.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //으로 인해 스프링 부트의 자동 설정, Bean 읽기와 생성을 모두 자동으로 설정
public class Spring2Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring2Application.class, args);
		//.run으로 인해 내장 Web Application Server를 실행
		// 항상 서버에 톰캣을 설치할 필요 없고, 스프링 부트로 만들어진 Jar 파일(실행가능한 Java 패키징 파일)로 실행하면 됨.
	}

}
