package com.fourblue.project.endpoint.service;

import com.fourblue.core.model.Person;
import com.fourblue.core.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
