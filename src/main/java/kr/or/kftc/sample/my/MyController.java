package kr.or.kftc.sample.my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    private MyService myService;

    public String control(){
        return myService.service();
    }
}
