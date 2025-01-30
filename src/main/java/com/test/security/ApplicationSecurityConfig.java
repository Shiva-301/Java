package com.test.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//@EnableWebSecurity
public class ApplicationSecurityConfig {

	private PasswordEncoder encoder;

	public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
		encoder = passwordEncoder;
	}

	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
				.csrf().disable()
				.authorizeRequests()
				.requestMatchers("/").permitAll()
				.requestMatchers("api/**").hasRole("user")
				.anyRequest()
				.authenticated()
				.and()
				.httpBasic();
		return http.build();
	}

//	@Bean
//	protected WebSecurityCustomizer webSecurityCustomizer() throws Exception {
//		return (web) -> web.ignoring().requestMatchers("/");
//	}

	@Bean
	protected InMemoryUserDetailsManager userDetailManager() {
		UserDetails user = User.builder()
				.username("ram")				
				.password(encoder.encode("dhuru"))
				.roles("user")
				.build();
		UserDetails user1 = User.builder()
				.username("user")
				.password(encoder.encode("user"))
				.roles("admin")
				.build();
		return new InMemoryUserDetailsManager(user, user1);
	}

}
