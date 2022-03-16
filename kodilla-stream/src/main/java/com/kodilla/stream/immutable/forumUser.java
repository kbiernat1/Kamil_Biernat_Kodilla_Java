package com.kodilla.stream.immutable;

public final class forumUser {
    private String username, realName;

    public forumUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
