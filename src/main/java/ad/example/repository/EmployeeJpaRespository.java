package ad.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import ad.example.model.Employee;

@Component
public interface EmployeeJpaRespository extends JpaRepository<Employee, Long>{

}
