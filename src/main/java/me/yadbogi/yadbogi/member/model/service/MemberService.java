package me.yadbogi.yadbogi.member.model.service;

import me.yadbogi.yadbogi.member.model.dto.MemberDTO;
import me.yadbogi.yadbogi.member.model.dto.MemberIdCheck;

public interface MemberService {

    boolean registMember(MemberDTO member);

    boolean idCheck(MemberIdCheck memberId);

    MemberDTO login(MemberDTO member);

    void quit(String memberId);
}
