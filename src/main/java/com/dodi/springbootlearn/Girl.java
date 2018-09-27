package com.dodi.springbootlearn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;

    private String cupSise;

    private Integer age;

}
