package com.example.roadtrippin.service;

import com.example.roadtrippin.domain.User;

import java.util.List;

public interface CrudService<T, ID> {

    List<T> list();

    T create(T dto);

    T get(ID id);

    T update(T dto);

    void delete(ID id);

}
