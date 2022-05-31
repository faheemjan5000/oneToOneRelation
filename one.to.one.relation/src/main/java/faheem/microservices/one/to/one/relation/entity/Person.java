package faheem.microservices.one.to.one.relation.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person{

    @Id
    private Integer personId;
    private String personName;

    //a person has one insurance
    @OneToOne(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "insurance_id",
            referencedColumnName = "insuranceId"
    )
    private Insurance insurance;
}
