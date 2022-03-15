package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
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

    @Test
    void testWhenPostsAmountIs0() {
        //Given
        when(statistics.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(0, forumStatistics.getPostsAmount());
    }

    @Test
    void testWhenPostsAmountIs1000() {
        //Given
        when(statistics.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(1000, forumStatistics.getPostsAmount());
    }

    @Test
    void testWhenCommentsAmountIs0() {
        //Given
        when(statistics.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(0, forumStatistics.getCommentsAmount());
    }

    @Test
    void testWhenCommentsAmountLessThanPostsAmount() {
        //Given
        when(statistics.commentsCount()).thenReturn(40);
        when(statistics.postsCount()).thenReturn(60);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(40, forumStatistics.getCommentsAmount());
        Assertions.assertEquals(60, forumStatistics.getPostsAmount());
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
    }

    @Test
    void testWhenUsersAmountIs1000() {
        List<String> listOfThousandUsers = new ArrayList<>();
        for (int i=0; i<1000; i++) {
            listOfThousandUsers.add("User" + i);
        }
        when(statistics.usersNames()).thenReturn(listOfThousandUsers);
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(1000, forumStatistics.getUsersAmount());
    }
}
