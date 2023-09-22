package com.salil.learnings;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Service;

@Service
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	
	
	
	 protected void configure(HttpSecurity http) throws Exception {
		 System.out.println("In the configure method");
		 http.csrf().disable();
	 }

}
