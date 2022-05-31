package faheem.microservices.one.to.one.relation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Insurance {

    @Id
    private Integer insuranceId;
    private String insuranceName;
}
