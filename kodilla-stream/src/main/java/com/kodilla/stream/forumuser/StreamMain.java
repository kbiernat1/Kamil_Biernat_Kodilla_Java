package com.kodilla.stream.forumuser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> usersMap = forum.getUserList().stream()
                .filter(user -> user.getSex() != 'F')
                .filter(user -> user.getDateOfBirth().getYear() <= 2002)
                .filter(user -> user.getPostsQty() > 1)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        System.out.println("elements: " + usersMap.size());

        usersMap.entrySet().stream()
                .map(entry -> entry.getKey() + ", " + entry.getValue())
                .forEach(System.out::println);
    }
}
