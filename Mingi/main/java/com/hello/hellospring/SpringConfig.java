package com.hello.hellospring;

import com.hello.hellospring.repository.MemberRepo;
import com.hello.hellospring.repository.MemberRepoMemo;
import com.hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 이 부분에 의해 스프링 빈으로 등록하라로 인식
public class SpringConfig {

    @Bean
    public MemberService memberService(){ // 컨테이너에서 Service 인지 + 등록
        return new MemberService(memberRepo());// Repository를 Service에 넣어준다
    }

    @Bean
    public MemberRepo memberRepo(){
        return new MemberRepoMemo();
    }
}
