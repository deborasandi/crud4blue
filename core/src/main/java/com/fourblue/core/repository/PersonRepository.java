package com.fourblue.core.repository;


import com.fourblue.core.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}
