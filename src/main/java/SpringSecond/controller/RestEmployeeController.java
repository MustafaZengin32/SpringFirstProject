package SpringSecond.controller;


import SpringSecond.model.Employee;
import SpringSecond.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
