package SpringFirst.main;


import SpringFirst.config.AppConfig;
import SpringFirst.entity.User;
import SpringFirst.services.LoginService;
import SpringFirst.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        for (User user : userService.getUserList()){
            System.out.println(user);
        }

        LoginService loginService = new LoginService();
        loginService.login();


    }
}
