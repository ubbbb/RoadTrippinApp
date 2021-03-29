package com.example.roadtrippin.service.impl;

import com.example.roadtrippin.dao.UserDao;
import com.example.roadtrippin.dto.UserDto;
import com.example.roadtrippin.mapper.UserMapper;
import com.example.roadtrippin.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao dao;
    private UserMapper mapper;

    public UserServiceImpl(UserDao dao, UserMapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }

    @Override
    public List<UserDto> list() {
        return mapper.toDTO(dao.findAll());
    }

    @Override
    public UserDto get(Integer id) {
        return mapper.toUserDto(dao.findById(id));
    }

    @Override
    public UserDto create(UserDto dto) {
        return mapper.toUserDto(dao.save(mapper.toUser(dto)));
    }

    @Override
    public UserDto update(UserDto dto) {
        return null;
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

}
