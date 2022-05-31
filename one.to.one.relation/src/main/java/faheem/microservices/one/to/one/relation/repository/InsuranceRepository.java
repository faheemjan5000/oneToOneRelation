package faheem.microservices.one.to.one.relation.repository;

import faheem.microservices.one.to.one.relation.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Integer> {
}
