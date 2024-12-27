package SpringSecond.b_services;

import SpringSecond.model.Employee;
import SpringSecond.c_repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList() {

        return employeeRepository.getAllEmployeeList();


    }

    public Employee getEmployeeById(String id) {

        return employeeRepository.getEmployeeById(id);

    }

    public List<Employee> getEmployeeWithParams(String firstName, String lastName){

        return employeeRepository.getEmployeeWithParams(firstName, lastName);
    }

    public Employee saveEmployee(Employee employee){

        return employeeRepository.saveEmployee(employee);

    }

    public boolean deleteEmployee(String id){

        return employeeRepository.deleteEmployee(id);

    }



}

