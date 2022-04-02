package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        // 모두 이걸로 시작한다.
        // 이게 스프링 컨테이너이다.
        // 모든것을 관리해준다.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); // annotation 기반의 config 이니깐
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class); // 꺼내오기 | 이름(기본적으로 메서드 이름으로 등록된다.)과 타입을 알려줘야함
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("newMember = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
