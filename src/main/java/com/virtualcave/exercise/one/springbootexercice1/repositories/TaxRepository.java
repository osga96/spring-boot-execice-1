package com.virtualcave.exercise.one.springbootexercice1.repositories;

import com.virtualcave.exercise.one.springbootexercice1.entities.Tax;
import org.springframework.data.repository.CrudRepository;

public interface TaxRepository extends CrudRepository<Tax, Integer> {

}