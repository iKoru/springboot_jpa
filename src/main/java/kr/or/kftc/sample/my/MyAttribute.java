package kr.or.kftc.sample.my;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "my")
public class MyAttribute {
    private String name;
    private String[] servers;
    private Computer computer;
}