package SpringFirst.config;

import SpringFirst.entity.User;
import SpringFirst.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration //Spring in bunun configuration sinifi oldugunu anlamasi icin
public class AppConfig {


    @Bean //Bunu yazarak context e atmasini saglariz
    public UserService userService(){

        UserService userService= new UserService();//Bir kere new yap ve kenara koy
        //Bidaha bidaha yapma-->Context-Bean

        List<User> userList=new ArrayList<>();

        userList.add(new User("Mustafa"));
        userList.add(new User("Nihan"));

        userService.setUserList(userList);

        return userService;


    }
}
