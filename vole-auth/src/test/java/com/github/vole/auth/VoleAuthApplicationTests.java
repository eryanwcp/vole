package com.github.vole.auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VoleAuthApplicationTests {

    @Bean
    PasswordEncoder passwordEncoder(){
        DelegatingPasswordEncoder delegatingPasswordEncoder =
                (DelegatingPasswordEncoder)  PasswordEncoderFactories.createDelegatingPasswordEncoder();
        return delegatingPasswordEncoder;


    }
    @Test
    public void contextLoads() {
        System.out.println(passwordEncoder().encode("1"));
        System.out.println(passwordEncoder().encode("1"));
    }

}
