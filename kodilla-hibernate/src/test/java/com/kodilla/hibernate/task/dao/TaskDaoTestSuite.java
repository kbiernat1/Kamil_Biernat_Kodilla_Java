package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskDaoTestSuite {

    @Autowired
    private TaskDao taskDao;
    @Autowired
    private TaskListDao taskListDao;
    private final static String DESCRIPTION = "Test: Learn Hibernate";
    private final static String LISTNAME = "List of tasks";

    @Test
    void testTaskDaoSave() {
        //given
        Task task = new Task(DESCRIPTION, 7);
        //when
        taskDao.save(task);
        //then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        Assertions.assertTrue(readTask.isPresent());
        //cleanUp
        taskDao.deleteAll();
    }

    @Test
    void testTaskDaoFindByDuration() {
        //G
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();
        //W
        List<Task> readTasks = taskDao.findByDuration(duration);
        //T
        assertEquals(1, readTasks.size());
        //CleanUp
        int id = readTasks.get(0).getId();
        taskDao.deleteAll();
    }

    @Test
    void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

        //When
        taskDao.save(task);
        int id = task.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //taskDao.deleteById(id);
    }

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

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);

        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);

        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);

        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");

        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);

        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }
}

