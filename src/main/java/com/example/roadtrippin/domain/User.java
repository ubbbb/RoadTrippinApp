package com.example.roadtrippin.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
/*    private List<Row> rows = new ArrayList<Row>();*/
/*    @OneToMany(mappedBy = "user")
    private List<Expense> expenses;*/


}
