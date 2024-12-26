package SpringSecond.config;

import SpringSecond.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

   @Bean
    public List<Employee> employeeList(){

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("1","Ali","Zengin"));
        employeeList.add(new Employee("2","Mustafa","Can"));
        employeeList.add(new Employee("3","Omer","Gok"));
        employeeList.add(new Employee("4","Murat","Akdogan"));
        employeeList.add(new Employee("5","Burhan","Dogukan"));

        return employeeList;


    }


}
