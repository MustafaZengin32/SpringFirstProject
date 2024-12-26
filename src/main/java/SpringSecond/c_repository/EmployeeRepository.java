package SpringSecond.c_repository;

import SpringSecond.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;//bunu da en son Db den alir boylece

    public List<Employee> getAllEmployeeList(){

        return employeeList;

    }

    public Employee getEmployeeById(String id){

        Employee findEmployee = null;

        for(Employee employee : employeeList){



            if(employee.getId().equals(id)){

                findEmployee = employee;

                break;
            }

        }

        return findEmployee;
    }

    public List<Employee> getEmployeeWithParams(String firstName, String lastName){

        List<Employee>employeewithparams=new ArrayList<Employee>();

        for(Employee employee :employeeList){

            if(employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)){

               employeewithparams.add(employee);

            }
        }

        return employeewithparams;
    }

}
