package ad.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Employee {

	@Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private String department;
   // private String notes;
  
}
