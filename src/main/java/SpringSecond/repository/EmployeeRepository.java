package SpringSecond.repository;

import SpringSecond.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;//bunu da en son Db den alir boylece

    public List<Employee> getAllEmployeeList(){

        return employeeList;

    }
}
