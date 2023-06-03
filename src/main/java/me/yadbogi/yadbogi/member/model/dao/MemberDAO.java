package me.yadbogi.yadbogi.member.model.dao;

import me.yadbogi.yadbogi.member.model.dto.MemberDTO;
import me.yadbogi.yadbogi.member.model.dto.MemberIdCheck;

public interface MemberDAO {

    int registMember(MemberDTO member);

    int idCheck(MemberIdCheck memberId);

    MemberDTO login(MemberDTO member);

    void quit(String memberId);
}
