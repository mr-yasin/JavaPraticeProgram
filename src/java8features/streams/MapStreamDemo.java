package java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class UserDto{
    private int id;
    private String userName;

    private String email;

    public UserDto(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
class User{
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class MapStreamDemo {
    public static void main(String[] args) {
        List<User> user = new ArrayList<User>();

        user.add(new User(1,"yasin","dggrgafb","gnfcgcf@gmail.com"));



        user.add(new User(2,"ayyappa","fgarhadfah","ggaegre@gmail.com"));
        user.add(new User(3,"sai ram","gabsfvas","gnagrvcd@gmail.com"));
        user.add(new User(4,"vamsi","fbaernefserh","gnagervhf@gmail.com"));
        user.add(new User(5,"mohan","dbbsntnae","harasbbba@gmail.com"));
        user.add(new User(6,"bhaskar","sdsgawgea","ahaervdvrbc@gmail.com"));

        List<UserDto>userDto=new ArrayList<UserDto>();

        for(User users:user){
         userDto.add(new UserDto(users.getId(), users.getUserName(), users.getEmail()));
        }
        userDto.forEach(System.out::println);
        //stream map
        System.out.println("***********");
        user.stream().map(new Function<User, UserDto>() {
            @Override
            public UserDto apply(User user) {
                return new UserDto(user.getId(),user.getUserName(),user.getEmail());
            }
        }).forEach(System.out::println);

        System.out.println("***********");
        user.stream()
                .map((User user2)->new UserDto(user2.getId(),user2.getUserName(),user2.getEmail()))
                .forEach(System.out::println);

        System.out.println("***********");
        List<UserDto>dto=user.stream()
                .map((User user1)->new UserDto(user1.getId(),user1.getUserName(),user1.getEmail()))
                .collect(Collectors.toList());
        dto.forEach(System.out::println);






    }
}
