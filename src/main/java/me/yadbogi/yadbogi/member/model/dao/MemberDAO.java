package me.yadbogi.yadbogi.member.model.dao;

import me.yadbogi.yadbogi.member.model.dto.MemberDTO;

public interface MemberDAO {

    int registMember(MemberDTO member);

    int idCheck(String memberId);

    MemberDTO login(MemberDTO member);
}
