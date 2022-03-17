package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(0001, "john12", 'M', 2000, 12, 5, 54));
        userList.add(new ForumUser(0002, "johnjohnson", 'M', 1992, 4, 15, 4));
        userList.add(new ForumUser(0003, "janedoe", 'F', 1993, 9, 23, 82));
        userList.add(new ForumUser(0004, "winebaron", 'M', 1990, 12, 12, 12));
        userList.add(new ForumUser(0005, "ms.awesome", 'F', 1997, 7, 14, 45));
        userList.add(new ForumUser(0006, "lucy666", 'F', 2003, 8, 1, 90));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
