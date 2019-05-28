package com.example.demo2;

import org.springframework.data.repository.CrudRepository;

public interface FindUser extends CrudRepository<Employee,Integer> {

    public Employee findById(int id);
}
