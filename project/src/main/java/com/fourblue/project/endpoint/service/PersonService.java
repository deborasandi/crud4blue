package com.fourblue.project.endpoint.service;

import com.fourblue.core.model.Person;
import com.fourblue.core.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Slf4j
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> list (){
        return personRepository.findAll();
    }

    public ResponseEntity findById(Long id){
        return personRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    public Person create(Person person){
        return personRepository.save(person);
    }
}
