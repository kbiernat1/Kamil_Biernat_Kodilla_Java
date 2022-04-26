package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();

        //when
        String sqlQuery = "select * from users";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " + rs.getString("FIRSTNAME")+ ", " + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();

        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();
        //when
        String sqlQuery = "select u.firstname, u.lastname\n" +
                "from users u join posts p on u.ID = p.USER_ID\n" +
                "group by USER_ID\n" +
                "having count(*) >= 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + " " + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();

        assertEquals(1, counter);
    }
}