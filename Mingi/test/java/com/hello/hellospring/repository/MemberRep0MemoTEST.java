package com.hello.hellospring.repository;


import com.hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemberRep0MemoTEST { // 전체 메소드 검사 가능(실행 순서는 무작위라 조심)
    MemberRepoMemo repository = new MemberRepoMemo();

    // 메소드가 실행할 때마다 저장되기 때문에 데이터를 제거할 필요 있음
    // 제거하지 않으면 무작위 호출로 인해 데이터가 저장되어 에러 발생이 가능
    @AfterEach // 메소드가 실행할 때마다 호출된다
    public void afterEach(){
        repository.clearStore();
    }

    // 정상 작동(Error 발생 X)하는지 알아보자
    @Test
    public void save(){
        Member member = new Member();
        member.setName("love");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        //Assertions.assertThat(member).isEqualTo(result);
        assertThat(result).isEqualTo(member);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("like");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("you");
        repository.save(member2);

        Member result = repository.findByName("like").get();
        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("like");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("you");
        repository.save(member2);

        List<Member> result = repository.findAll();
        assertThat(result.size()).isEqualTo(2);
    }



}
