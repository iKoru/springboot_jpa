package kr.or.kftc.sample.my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MyService {
    @Autowired
    private MyDao myDao;

    @Autowired
    private BookInterface book;

    @Autowired
    private MyAttribute myAttribute;

    public String service() {
        String a = "aaa";

        log.debug("service method called for debug");
        log.info("service method called for info");
        log.trace("service method called for trace");
        log.error("service method called for error");
        log.error("book service is : " + book.say());
        log.error("attribute is : " + myAttribute);
        return myDao.crud() + " , hello.!";
    }

}