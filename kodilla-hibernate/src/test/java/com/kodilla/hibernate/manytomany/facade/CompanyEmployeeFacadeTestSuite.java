package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CompanyEmployeeFacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private List<Employee> employees = new ArrayList<>();
    private List<Company> companies = new ArrayList<>();

    @BeforeAll
    private void inputData () {
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        employees.add(johnSmith);
        employees.add(stephanieClarckson);
        employees.add(lindaKovalsky);

        companies.add(softwareMachine);
        companies.add(dataMaesters);
        companies.add(greyMatter);
    }

    @AfterAll
    private void outputData() {
        employeeDao.deleteAll();
        companyDao.deleteAll();
    }

    @Test
    void employeeFacadeTest() {
        //Given
        inputData();
        //When
        List<Employee> employee = employeeDao.retrieveEmployeesByAnyLettersSet("arc");
        //Then
        Assertions.assertEquals(1, employee.size());
        outputData();
    }

    @Test
    void companyFacadeTest() {
        //Given
        inputData();
        //When
        List<Company> companies = companyDao.retrieveFromCompanyNameByAnyLettersSet("ftw");
        //Then
        Assertions.assertEquals(1, companies.size());
        outputData();
    }
}
