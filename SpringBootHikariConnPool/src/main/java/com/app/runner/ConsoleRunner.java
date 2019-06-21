package com.app.runner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.EmployeeRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
@Autowired
private EmployeeRepository repo;
@Autowired
private DataSource ds;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(ds.getClass().getName());
repo.findAll().forEach(System.out::println);
	}

}
