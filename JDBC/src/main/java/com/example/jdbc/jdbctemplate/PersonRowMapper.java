package com.example.jdbc.jdbctemplate;

import com.example.jdbc.pojo.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();

        person.setId(rs.getInt("id"));
        person.setFirstName(rs.getString("firstname"));
        person.setLastName(rs.getString("lastname"));
        person.setAddress(rs.getString("address"));
        person.setCity(rs.getString("city"));

        return person;
    }
}
