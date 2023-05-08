package com.example.demo.config;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.web.*;

@Configuration
public class MyConfig2 {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) 
			throws Exception {
		http.formLogin()
			.loginPage("/sub33/mylogin")
			.defaultSuccessUrl("/list", true);
		
		http.logout();
		
		http.authorizeHttpRequests().requestMatchers("/abc").authenticated();
		http.authorizeHttpRequests().anyRequest().permitAll();
		
		return http.build();
	}
}






