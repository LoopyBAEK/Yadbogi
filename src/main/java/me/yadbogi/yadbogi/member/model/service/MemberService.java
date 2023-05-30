package me.yadbogi.yadbogi.member.model.service;

import me.yadbogi.yadbogi.member.model.dto.MemberDTO;

public interface MemberService {

    boolean registMember(MemberDTO member);

    int idCheck(String memberId);

    MemberDTO login(MemberDTO member);
}
