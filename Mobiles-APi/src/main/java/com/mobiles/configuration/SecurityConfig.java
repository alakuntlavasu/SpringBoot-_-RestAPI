package com.mobiles.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableAutoConfiguration
public class SecurityConfig {

	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception 
    {
    	return http.csrf().disable()
    	           .authorizeHttpRequests()
    	           .requestMatchers("/multipleMobiles").permitAll()
    	           .and()
    	           .authorizeHttpRequests().requestMatchers("/getmultiplemobiles").authenticated()
    	           .and().formLogin()
    	           .and().build();
    	           
    	          
		
    	
    }

}
