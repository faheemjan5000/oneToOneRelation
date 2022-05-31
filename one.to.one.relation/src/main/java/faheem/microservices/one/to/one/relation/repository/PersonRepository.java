package faheem.microservices.one.to.one.relation.repository;

import faheem.microservices.one.to.one.relation.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
}
