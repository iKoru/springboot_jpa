package kr.or.kftc.sample.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kftc.sample.dto.User;
import kr.or.kftc.sample.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping({ "", "/index" })
    public String index(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "index";
    }

    @PostMapping("/adduser")
    public String adduser(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }
        userService.addUser(user);
        return "redirect:/index";
    }

    @GetMapping("/signup")
    public ModelAndView signup() {
        ModelAndView mv = new ModelAndView("add-user");
        mv.addObject("user", new User());
        return mv;
    }

    @GetMapping("/edit/{id}")
    public String updateUserPage(@PathVariable long id, Model model) {
        model.addAttribute("user", userService.getUser(id));
        return "update-user";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }
        userService.updateUser(user);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        User user = new User(id, null, null, null);
        userService.deleteUser(user);
        return "redirect:/index";
    }
}