package SpringSecond.c_repository;

import SpringSecond.model.Employee;
import SpringSecond.model.UpdateEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

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

    public Employee saveEmployee(Employee employee){

        employeeList.add(employee);
        return employee;
    }



    public boolean deleteEmployee(String id){

        for (Employee employee : employeeList){
            if (employee.getId().equals(id)){
                employeeList.remove(employee);

            }
        }

        return true;
    }

    private Employee findEmployeeById(String id){

        Employee findEmployee =null;

        for(Employee employee : employeeList){
            if(employee.getId().equals(id)){
                findEmployee = employee;
                break;
            }
        }

        return findEmployee;
    }

    public Employee putEmployee(String id, UpdateEmployee request) {

        Employee findEmployee = findEmployeeById(id);

        if (findEmployee != null) {

            deleteEmployee(id);

            Employee updatedEmployee = new Employee();

            updatedEmployee.setId(id);
            updatedEmployee.setFirstName(request.getFirstName());
            updatedEmployee.setLastName(request.getLastName());

            employeeList.add(updatedEmployee);

            return updatedEmployee;
        }

        return null;

    }


}
