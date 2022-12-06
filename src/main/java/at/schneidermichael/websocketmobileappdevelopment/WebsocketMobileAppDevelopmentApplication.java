package at.schneidermichael.websocketmobileappdevelopment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WebsocketMobileAppDevelopmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketMobileAppDevelopmentApplication.class, args);
    }

}
