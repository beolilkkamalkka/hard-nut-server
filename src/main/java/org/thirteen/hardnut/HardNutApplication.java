package org.thirteen.hardnut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HardNutApplication {

    public static void main(String[] args) {
        SpringApplication.run(HardNutApplication.class, args);
    }

}
