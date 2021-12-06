package com.springDataBase.JPA.springData;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springDataBase.JPA.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
