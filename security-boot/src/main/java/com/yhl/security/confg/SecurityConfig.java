package com.yhl.security.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Szhtxx
 */
//@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("123456");
        auth.inMemoryAuthentication().withUser("yhl").password(password).roles("admin");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        System.out.println("1111111111");
        System.out.println("2222222222");
        System.out.println("3333333333");
        System.out.println("test-1");
        System.out.println("master-1");
        System.out.println("master-push1");
        return new BCryptPasswordEncoder();
    }
}
