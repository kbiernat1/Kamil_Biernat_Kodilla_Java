package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private int id;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int postsQty;

    public ForumUser(int id, String userName, char sex, int year, int month, int day, int postsQty) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.postsQty = postsQty;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQty() {
        return postsQty;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsQty=" + postsQty +
                '}';
    }
}
