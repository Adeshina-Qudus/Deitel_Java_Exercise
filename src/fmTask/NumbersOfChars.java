package fmTask;

import java.util.ArrayList;
import java.util.List;

public class NumbersOfChars {
    public static int numberOfChars(List<String> stringList) {
        return stringList.stream().mapToInt(String::length).sum();
    }
    public static List<User> mapToUser(List<String> stringList) {
        User user = new User();
        List<User> userList = new ArrayList<>();
        stringList.forEach(element -> {
            user.setName(element.chars().toString());
            user.setAge(element.length());
            userList.add(user);
        });
        return userList;
    }
}
