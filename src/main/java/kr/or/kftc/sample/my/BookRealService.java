package kr.or.kftc.sample.my;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("real")
public class BookRealService implements BookInterface {

    private String name;

    @Override
    public String say() {
        return name;
    }

    public BookRealService() {
        this.name = "real book!!!";
    }

}