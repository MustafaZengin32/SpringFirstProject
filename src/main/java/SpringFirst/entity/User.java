package SpringFirst.entity;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String firstName;


    /*Normalde Lombok dan once elemanin getter setterlarini generate deyip olustururduk

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

     */
}
