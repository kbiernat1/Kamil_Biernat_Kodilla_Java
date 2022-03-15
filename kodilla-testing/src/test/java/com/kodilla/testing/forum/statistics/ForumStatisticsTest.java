package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class ForumStatisticsTest {

    @Mock
    private Statistics statistics;
    private final ForumStatistics forumStatistics = new ForumStatistics();

    @BeforeEach
    public void beforeEachTest() {
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersList.add("User" + i);
        }
        when(statistics.usersNames()).thenReturn(usersList);
        when(statistics.postsCount()).thenReturn(50);
        when(statistics.commentsCount()).thenReturn(30);
    }

    @Test
    void testWhenPostsAmountIs0() {
        //Given
        when(statistics.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(0, forumStatistics.getPostsAmount());
        Assertions.assertEquals(0, forumStatistics.calculateAveragePostsToUser());
        Assertions.assertEquals(0, forumStatistics.calculateAverageCommentsToPost());
    }

    @Test
    void testWhenPostsAmountIs1000() {
        //Given
        when(statistics.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(1000, forumStatistics.getPostsAmount());
        Assertions.assertEquals(100, forumStatistics.calculateAveragePostsToUser());
        Assertions.assertEquals(0.03, forumStatistics.calculateAverageCommentsToPost());
    }

    @Test
    void testWhenCommentsAmountIs0() {
        //Given
        when(statistics.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(0, forumStatistics.getCommentsAmount());
        Assertions.assertEquals(0, forumStatistics.calculateAverageCommentsToPost());
        Assertions.assertEquals(0, forumStatistics.calculateAverageCommentsToUser());
    }

    @Test
    void testWhenCommentsAmountLessThanPostsAmount() {
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(30, forumStatistics.getCommentsAmount());
        Assertions.assertEquals(50, forumStatistics.getPostsAmount());
        Assertions.assertEquals(0.6, forumStatistics.calculateAverageCommentsToPost());
    }

    @Test
    void testWhenCommentsAmountMoreThanPostsAmount() {
        //Given
        when(statistics.commentsCount()).thenReturn(60);
        when(statistics.postsCount()).thenReturn(40);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(60, forumStatistics.getCommentsAmount());
        Assertions.assertEquals(40, forumStatistics.getPostsAmount());
        Assertions.assertEquals(1.5, forumStatistics.calculateAverageCommentsToPost());
    }

    @Test
    void testWhenUsersAmountIs0() {
        //Given
        List<String> emptyList = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(emptyList);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(0, forumStatistics.getUsersAmount());
        Assertions.assertEquals(0, forumStatistics.calculateAveragePostsToUser());
        Assertions.assertEquals(0, forumStatistics.calculateAverageCommentsToUser());
    }

    @Test
    void testWhenUsersAmountIs1000() {
        List<String> listOfThousandUsers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            listOfThousandUsers.add("User" + i);
        }
        when(statistics.usersNames()).thenReturn(listOfThousandUsers);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(1000, forumStatistics.getUsersAmount());
        Assertions.assertEquals(0.05, forumStatistics.calculateAveragePostsToUser());
        Assertions.assertEquals(0.03, forumStatistics.calculateAverageCommentsToUser());
    }
}
