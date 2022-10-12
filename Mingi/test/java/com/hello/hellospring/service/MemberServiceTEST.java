package com.hello.hellospring.service;

import com.hello.hellospring.domain.Member;
import com.hello.hellospring.repository.MemberRepoMemo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTEST {

    MemberService memberService;
    MemberRepoMemo memberRepoMemo;

    @BeforeEach // DI로 넣는 것!
    public void beforeEach(){
        memberRepoMemo = new MemberRepoMemo();
        memberService = new MemberService(memberRepoMemo);
    }
    @AfterEach
    public void afterEach(){
        memberRepoMemo.clearStore();
    }

    @Test
    void join(){
        // given - 실행 데이터
        Member member = new Member();
        member.setName("like");
        // when - 진행 중
        Long saveId = memberService.join(member);
        // then - 결과
        Member find = memberService.findOne(saveId).get();
        Assertions.assertThat(member.getName()).isEqualTo(find.getName());
    }

    // 중복 회원 확인 메소드
    @Test
    public void validateDuplicateMember(){
        // given
        Member member1 = new Member();
        Member member2 = new Member();
        member1.setName("like"); member2.setName("love");
        // when
        memberService.join(member1);
        try{
            memberService.join(member2);
        } catch (IllegalStateException e) {
            Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재");
        }

    }
    @Test
    void findMembers(){

    }

    @Test
    void findOne(){

    }
}
