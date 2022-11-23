package com.example.jdbc.runner;

import com.example.jdbc.jdbctemplate.PersonRowMapper;
import com.example.jdbc.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JDBCTemplateRunner implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) {
//        String query = "SELECT * FROM person WHERE ID = ?";
//        Person person = jdbcTemplate.queryForObject(
//                query, new Object[]{args[0]}, new PersonRowMapper());
//        if (person != null) {
//            log.info("Person with id {} is {}", args[0], person.getFirstName());
//        } else {
//            log.info("Could not find person with id {}", args[0]);
//        }
    }
}
