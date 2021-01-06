package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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


    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }
}
