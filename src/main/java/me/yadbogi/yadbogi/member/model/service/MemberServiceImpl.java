package me.yadbogi.yadbogi.member.model.service;

import me.yadbogi.yadbogi.member.model.dao.MemberDAO;
import me.yadbogi.yadbogi.member.model.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

    private final MemberDAO memberDAO;

    @Autowired
    public MemberServiceImpl(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public boolean registMember(MemberDTO member) {
        return memberDAO.registMember(member) > 0;
    }

    @Override
    public int idCheck(String memberId) {
        return memberDAO.idCheck(memberId);
    }

    @Override
    public MemberDTO login(MemberDTO member) {
        return memberDAO.login(member);
    }

}
