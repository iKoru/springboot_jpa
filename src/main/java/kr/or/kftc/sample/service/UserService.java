package kr.or.kftc.sample.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.kftc.sample.dto.User;
import kr.or.kftc.sample.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // private List<User> userList = new ArrayList<User>();
    // private int id = 0;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public void addUser(User user) {
        // user.setId(id++);
        // userList.add(user);
        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
        // userList = userList.stream().filter(u -> {
        // return u.getId() != user.getId();
        // }).collect(Collectors.toList());
        // return userList;
    }

    public User getUser(long id2) {
        return userRepository.findById(id2).get();
    }
}