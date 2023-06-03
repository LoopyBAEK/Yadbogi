package me.yadbogi.yadbogi.member.controller;

import me.yadbogi.yadbogi.member.model.dto.MemberDTO;
import me.yadbogi.yadbogi.member.model.dto.MemberIdCheck;
import me.yadbogi.yadbogi.member.model.dto.MemoryAuthManager;
import me.yadbogi.yadbogi.member.model.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 아이디 중복 확인
    @PostMapping("/idValidCheck")
    public ResponseEntity<Void> idCheck(@RequestBody MemberIdCheck memberId){
        return memberService.idCheck(memberId)?
                new ResponseEntity<>(HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    // 회원가입
    @PostMapping("/registMember")
    public ResponseEntity<Void> registMember(@RequestBody MemberDTO memberDTO){
        return memberService.registMember(memberDTO)?
                new ResponseEntity<>(HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    // 로그인
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody MemberDTO member){
        // 로그인한 회원의 정보
        MemberDTO loginUser = memberService.login(member);

        MemoryAuthManager.setLoginUser(loginUser.getMemberId());

        return new ResponseEntity<>(loginUser, HttpStatus.OK);
    }

    // 로그아웃
    @PostMapping("/logout")
    public ResponseEntity<Void> logout(){
        MemoryAuthManager.removeLoginMember();

        return new ResponseEntity<>(HttpStatus.OK);
    }

    // 회원탈퇴
    @PostMapping("/quit")
    public ResponseEntity<Void> quit(HttpServletRequest request){
        String memberId = MemoryAuthManager.getLoginUser();
        System.out.println(memberId);

        memberService.quit(memberId);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
