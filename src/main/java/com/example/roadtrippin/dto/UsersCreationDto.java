package com.example.roadtrippin.dto;

import com.example.roadtrippin.dao.UserDao;
import com.example.roadtrippin.domain.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UsersCreationDto {

    private List<User> users;

    public UsersCreationDto() {
        this.users = new ArrayList<>();
    }

    public UsersCreationDto(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

}
