package kr.or.kftc.sample.my;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("local")
public class BookLocalService implements BookInterface {

    private String name;

    @Override
    public String say() {
        return name;
    }

    public BookLocalService() {
        this.name = "local book!!!";
    }

}