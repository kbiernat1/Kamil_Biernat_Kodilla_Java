package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersAmount;
    private int postsAmount;
    private int commentsAmount;
    private double avPostsToUser;
    private double avCommentsToUser;
    private double avCommentsToPost;

    public int getUsersAmount() {
        return usersAmount;
    }

    public int getPostsAmount() {
        return postsAmount;
    }

    public int getCommentsAmount() {
        return commentsAmount;
    }

    public double getAvPostsToUser() {
        return avPostsToUser;
    }

    public double getAvCommentsToUser() {
        return avCommentsToUser;
    }

    public double getAvCommentsToPost() {
        return avCommentsToPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersAmount = statistics.usersNames().size();
        postsAmount = statistics.postsCount();
        commentsAmount = statistics.commentsCount();
        avPostsToUser = calculateAveragePostsToUser();
        avCommentsToPost = calculateAverageCommentsToPost();
        avCommentsToUser = calculateAverageCommentsToUser();
    }

    public double calculateAveragePostsToUser() {
        if (usersAmount > 0) {
            return (double) getPostsAmount()/getUsersAmount();
        } else {
            return 0;
        }
    }

    public double calculateAverageCommentsToUser() {
        if (usersAmount > 0) {
            return (double) getCommentsAmount() / getUsersAmount();
        } else {
            return 0;
        }
    }

    public double calculateAverageCommentsToPost() {
        if (postsAmount > 0) {
            return (double) getCommentsAmount() / getPostsAmount();
        } else {
            return 0;
        }
    }

    public void showStatistics() {
        System.out.println(usersAmount);
        System.out.println(postsAmount);
        System.out.println(commentsAmount);
        System.out.println(avPostsToUser);
        System.out.println(avCommentsToPost);
        System.out.println(avCommentsToUser);
    }
}
