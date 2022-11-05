package com.hello.hellospring.controller;

import com.hello.hellospring.domain.Member;
import com.hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller // 스프링이 관리하기 때문에 Autowired로 Controller를 한다
public class MemberController {
    private final MemberService memberService;

    @Autowired // 다른 것과 연결해줌(여기서는 Service와 의존관계 형성)
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(value="/members/new")
    public String createForm(){
        return "members/createForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form){ //회원 생성
        Member member = new Member();
        member.setName(form.getName());

        System.out.println("member= "+member.getName());
        memberService.join(member);
        return "redirect:/";
    }

    @GetMapping(value="/members")
    public String list(Model model){
        List<Member> members = memberService.findMembers();
        model.addAttribute("members",members);
        return "members/memberList";
    }
}
