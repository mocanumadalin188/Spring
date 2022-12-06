package com.example.jdbc.runner;

import com.example.jdbc.dao.PersonDAO;
import com.example.jdbc.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class PersonCRUDRunner implements CommandLineRunner {

    @Autowired
    private PersonDAO personDAO;

    @Override
    public void run(String... args) {
        Person person = new Person();
      //  person.setId(1);
        person.setAddress("Romania");
        person.setCity("city1");
        person.setLastName("");
        person.setFirstName("");
        personDAO.save(person);

        List<Person> personList = personDAO.getAll();
     List<Person> personListToBeSaved = personList
             .stream()
             .filter(person1 -> "city1".equals(person1.getCity()))
             .collect(Collectors.toList());
     personListToBeSaved.forEach(person1 -> log.info(person1.toString()));




    //   Person personToUpdate= personDAO.getById(1);
     //  personDAO.update(personToUpdate);



//        personDAO.getAll().forEach(a -> log.info(a.getFirstName()));
    }
}
