package faheem.microservices.one.to.one.relation;

import faheem.microservices.one.to.one.relation.entity.Insurance;
import faheem.microservices.one.to.one.relation.entity.Person;
import faheem.microservices.one.to.one.relation.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class PersonTest {

    @Autowired
    PersonService personService;

    @Test
    public void addPersonWithInsurance(){
        Insurance insurance = new Insurance();
        insurance.setInsuranceName("American-insurance");

        Person person = new Person();
        person.setPersonName("francesco");
        person.setInsurance(insurance);

        personService.savePerson(person);

    }
}
