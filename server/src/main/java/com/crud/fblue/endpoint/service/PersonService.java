package com.crud.fblue.endpoint.service;

import com.crud.fblue.model.Person;
import com.crud.fblue.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Iterable<Person> list (Pageable pageable){
        return personRepository.findAll(pageable);
    }
}
