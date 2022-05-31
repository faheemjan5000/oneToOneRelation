package faheem.microservices.one.to.one.relation.repository;

import faheem.microservices.one.to.one.relation.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance,Integer> {
}
