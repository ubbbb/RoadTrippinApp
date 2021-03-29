package com.example.roadtrippin.dao;

import com.example.roadtrippin.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    List<User> findAll();
    User findById(long id);
    void deleteById(long id);

}
