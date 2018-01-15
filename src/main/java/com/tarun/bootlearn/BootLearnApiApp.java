/**
 *
 */
package com.tarun.bootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.tarun.bootlearn.dao")
@SpringBootApplication
public class BootLearnApiApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(BootLearnApiApp.class, args);
    }

}
