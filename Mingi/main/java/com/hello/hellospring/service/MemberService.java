package com.hello.hellospring.service;

import com.hello.hellospring.domain.Member;
import com.hello.hellospring.repository.MemberRepo;
import com.hello.hellospring.repository.MemberRepoMemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
public class MemberService {

    // 기존 회원 서비스가 직접 생성하게 함
    // private final MemberRepo memberRepo = new MemberRepoMemo();

    private final MemberRepo memberRepo;

    //@Autowired // Repository와 연결
    public MemberService(MemberRepo memberRepo) {

        this.memberRepo = memberRepo;
    }

    // 회원 가입
    public Long join(Member member){
        validateDuplicateMember(member);
        memberRepo.save(member);
        return member.getId();
    }

    // 중복 확인 메소드
    private void validateDuplicateMember(Member member){
        memberRepo.findByName(member.getName()).ifPresent(m -> {
            throw new IllegalStateException("이미 존재합니다");
        });
        /*

         */

    }

    // 전체 회원 조회
    public List<Member> findMembers(){
        return memberRepo.findAll();
    }

    // 회원 한 명만 조회
    public Optional<Member> findOne(Long memberId){
        return memberRepo.findById(memberId);
    }
}
