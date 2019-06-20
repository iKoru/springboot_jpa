package kr.or.kftc.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.or.kftc.sample.dto.User;

@RestController
@RequestMapping("/users")
public class UserRestController {
    List<User> userList = new ArrayList<User>();

    public int index;

    public UserRestController() {
        User user1 = new User(1, "kkk", "aaa", "ddd");
        User user2 = new User(2, "kk2", "aaa", "ddd");
        User user3 = new User(3, "kk3", "aaa", "ddd");
        User user4 = new User(4, "kk4", "aaa", "ddd");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        index = 5;
    }

    @GetMapping
    public List<User> getUsers() {
        return userList;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userList.stream().filter(user -> user.getId() == id).findFirst().get();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        user.setId(index++);
        userList.add(user);
        return user;
    }
}