package SpringFirst.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoginService {

    public void login(){

        ApplicationContext context=new AnnotationConfigApplicationContext();

        UserService userService = context.getBean(UserService.class);




    }
}
