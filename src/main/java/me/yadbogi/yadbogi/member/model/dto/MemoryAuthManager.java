package me.yadbogi.yadbogi.member.model.dto;

public class MemoryAuthManager {

    private static String loginUser = "";

    public MemoryAuthManager() {}

    public static String getLoginUser() {
        return loginUser;
    }

    public static void setLoginUser(String memberName) {
        loginUser = memberName;
    }

    // 로그아웃
    public static void removeLoginMember(){
        loginUser = "";
    }
}
