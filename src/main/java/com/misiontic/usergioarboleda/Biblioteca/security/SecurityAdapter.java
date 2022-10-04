package com.misiontic.usergioarboleda.Biblioteca.security;

import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityAdapter extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http){
        a -> a.antMatches(
            "/", "/error", "/webjars/**", "/editorial/**", "/author/**", "/book/**"
        ).permitAll().anyRequest().authenticated())
        .exceptHandling(
                e -> e.authenticatedEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
        ).oauth2Login();
        http.cors().and().csrf().disable();
    }
}
