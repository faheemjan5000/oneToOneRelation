package faheem.microservices.one.to.one.relation.service;

import faheem.microservices.one.to.one.relation.entity.Person;
import faheem.microservices.one.to.one.relation.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    public Person getPersonById(int personId){
        if(personRepository.findById(personId).isPresent()) {
            log.info("person found");
            return personRepository.findById(personId).get();
        }
        else
        {
            log.error("person not found!");
            return null;
        }
    }
}
