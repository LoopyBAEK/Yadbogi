package me.yadbogi.yadbogi.member.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {

    private String memberId;
    private String memberPwd;
    private String memberName;
    private String memberEmail;
    private char memberStatus;
}
