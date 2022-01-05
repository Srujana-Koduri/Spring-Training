package com.dbs.app;

import com.dbs.entities.Person;
import com.dbs.entities.PersonRowMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class App_01 {

    public static void main(String[] args) {

        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = ctxt.getBean(JdbcTemplate.class);

//        Person person = new Person(102,"Sowmya",5000);
//        String query = "insert into person values ("+person.getId()+",'"+person.getName()+"',"+person.getSalary()+")";
//        if(jdbcTemplate.update(query)==1)
//            System.out.println("Inserted Successfully");
//        else{
//            System.out.println("Insertion Failed");
//        }

//        String query = "select * from person where id = ?";
//        Person person = jdbcTemplate.queryForObject(query, new Object[] {101}, new PersonRowMapper());
//        System.out.println(person);

        String query= "select * from Person";
        List<Person> persons = jdbcTemplate.query(query, new PersonRowMapper());
        for(Person person : persons)
            System.out.println(person);

    }
}
