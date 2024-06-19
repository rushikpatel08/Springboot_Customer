package com.student.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.student.entity.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}
