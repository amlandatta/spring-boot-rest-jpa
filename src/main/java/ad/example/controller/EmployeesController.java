package ad.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ad.example.model.Employee;
import ad.example.repository.EmployeeJpaRespository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private EmployeeJpaRespository employeeJpaRespository;

	/**
	 * Used to fetch all the Employees from DB
	 * 
	 * @return list of {@link Employee}
	 */
    @GetMapping(value = "/")
    public List<Employee> getAllEmployees() {
        return employeeJpaRespository.findAll();
    }


    /**
	 * Used to create a Employee in the DB
	 * 
	 * @param users refers to the Employee needs to be saved
	 * @return the {@link Employee} created
	 */
    @PostMapping(value = "/create")
    public Employee createEmployee(@RequestBody final Employee employee) {
    	Employee newEmployee = employeeJpaRespository.save(employee);
        return newEmployee;
    }
    
    @GetMapping(value = "/{id}")
    public Optional<Employee> getEmployee(@PathVariable("id") Long employeeId) {
        return employeeJpaRespository.findById(employeeId);
    }
}
