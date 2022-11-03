package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    //필드 주입
//    @Autowired private MemberService memberService;

    //생성자 주입 (추천)
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }



    //setter 주입
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//
//    }
}
