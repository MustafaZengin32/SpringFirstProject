package SpringSecond.a_controller;


import SpringSecond.model.Employee;
import SpringSecond.b_services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api")       //API'nin ortak kokunu belirtmek icin
public class RestEmployeeController {

    @Autowired //Bu Controller dan Service e gidebilmek icin gerekli Annotation @Autowire dir
    private EmployeeService employeeService;
    //Sistemdeki iscileri getirme

    @GetMapping(path = "/employee-list")          //Get oldugunu belirtmek icin
    public List<Employee> getAllEmployeeList(){

       return employeeService.getAllEmployeeList();//buradan ust katman olan Service e ciktim

    }

    @GetMapping(path = "/employee-list/{id}")
    public Employee getEmployeeById(@PathVariable(name="id",required = true) String id){

        return employeeService.getEmployeeById(id);
    }

    @GetMapping(path="/employee-list-with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name="firstName") String firstName,
                                                          @RequestParam(name="lastName") String lastName){

        System.out.println(firstName+" "+lastName);
        return employeeService.getEmployeeWithParams(firstName, lastName);
    }



}
