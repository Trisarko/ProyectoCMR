package models;

import java.util.List;

public class UserTransform {
    private List<User> userList;
    private User user;

    public UserTransform(List<User> userList) {
        this.userList = userList;
    }

    private User transformData(){
        userList.forEach(data -> user = data);
        return user;
    }

    public static User withThe(List<User> userList){
        return new UserTransform(userList).transformData();
    }
}

