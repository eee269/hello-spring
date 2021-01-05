package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    /*
    DI: 의존성 주입, 3가지 방법이 있음
    1. 생성자 주입
        : 아래와 같이 생성자 만들어서 Autowired 걸어주기
    2. 필드 주입
        : 필드에다가
        @Autowired private MemberService memberService;
        이렇게 주입할 수도 있는데 잘 안씀
    3. setter 주입
        : setter 만들어서 Autowired 걸어주기
        : public 으로 열려있어서 중간에 바뀔수도 있기때문에 문제가 될수도 있음
     */
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
