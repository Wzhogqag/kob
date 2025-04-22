package com.kob.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("pwzq"));
        System.out.println(passwordEncoder.encode("pyxj"));
        System.out.println(passwordEncoder.matches("pwzq","$2a$10$l6Z.e53qJfzdCllM8HV3M.PIsfTNBZB.9cDND6UeVhkjpJBd2wGHi"));
    }

}
