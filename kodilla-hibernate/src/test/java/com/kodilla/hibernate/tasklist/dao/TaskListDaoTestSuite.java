package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //g
        TaskList taskList = new TaskList("List to do", "list of tasks that are supposed to be done");
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //w
        List<TaskList> read = taskListDao.findByListName(listName);
        //t
        Assertions.assertEquals(1, read.size());
        //cleanUp
        int id = read.get(0).getId();
        taskListDao.deleteById(id);
    }
}
