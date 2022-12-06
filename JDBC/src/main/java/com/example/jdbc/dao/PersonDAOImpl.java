package com.example.jdbc.dao;

import com.example.jdbc.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class PersonDAOImpl implements PersonDAO {
    @Autowired
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(Person person) {
        String query = "insert into Person (last_name, first_name, address, city) values (?,?,?,?)";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = dataSource.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);

            ps.setString(1, person.getLastName());
            ps.setString(2, person.getFirstName());
            ps.setString(3, person.getAddress());
            ps.setString(4, person.getCity());

            int out = ps.executeUpdate();

            if (out != 0) {
                con.commit();
                log.info("Person saved");
            } else {
                con.rollback();
                log.error("Person save failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Person getById(int id) {
        String query = "select * from Person where id = ?";
        Person person = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            ps = con.prepareStatement(query);

            ps.setLong(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                person = new Person(id, rs.getString("last_name"), rs.getString("first_name"),
                        rs.getString("address"), rs.getString("city"));
                log.info("Person Found::" + person);
            } else {
                log.warn("No Person found with id=" + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return person;
    }

    @Override
    public void update(Person person) {
        String query = "update Person set address=? where id=?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = dataSource.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);

            ps.setString(1, "updatedAddress");
            ps.setLong(2, person.getId());

            int out = ps.executeUpdate();

            if (out != 0) {
                con.commit();
                log.info("Person updated with id=" + person.getId());
            } else {
                log.warn("No person found with id=" + person.getId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteById(int id) {
        String query = "delete from Person where id=?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = dataSource.getConnection();
            ps = con.prepareStatement(query);

            ps.setLong(1, id);

            int out = ps.executeUpdate();

            if (out != 0) {
                con.commit();
                log.info("Person deleted with id=" + id);
            } else {
                log.warn("No person found with id=" + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Person> getAll() {
        String query = "select * from Person";
        List<Person> personList = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Person person = new Person();

                person.setId(rs.getLong("id"));
                person.setLastName(rs.getString("last_name"));
                person.setFirstName(rs.getString("first_name"));
                person.setAddress(rs.getString("address"));
                person.setCity(rs.getString("city"));

                personList.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return personList;
    }
}
