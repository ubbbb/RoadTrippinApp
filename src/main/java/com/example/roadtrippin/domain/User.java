package com.example.roadtrippin.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    private long id;
    private String name;
    @OneToMany(mappedBy = "user")
    private List<Expense> expenses;


}
