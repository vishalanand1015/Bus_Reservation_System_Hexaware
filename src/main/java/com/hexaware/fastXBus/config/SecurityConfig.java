package com.hexaware.fastXBus.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.hexaware.fastXBus.filter.JwtAuthFilter;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	
	@Autowired
	JwtAuthFilter authFilter;

    @Bean
    //authentication
    public UserDetailsService userDetailsService() {      
        return new UserInfoUserDetailsService();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/api/v1/usercustomers/create","/api/v1/usercustomers/authenticate","/api/v1/admins/create","/api/v1/admins/authenticate","/api/v1/bookings/add","/api/v1/bookings/authenticate","/api/v1/buses","/api/v1/buses/authenticate","/api/v1/busoperators","/api/v1/busoperators/authenticate","/api/v1/paymenthistory","/api/v1/paymenthistory/authenticate","/api/v1/trips","/api/v1/trips/authenticate","/v3/api-docs/**", "/swagger-ui/**","/swagger-resources/**").permitAll()
                .and()
                .authorizeHttpRequests().requestMatchers("/api/v1/usercustomers/**","/api/v1/admins/**","/api/v1/bookings/**","/api/v1/buses/**","/api/v1/busoperators/**","/api/v1/paymenthistory/**","/api/v1/trips/**")
                .authenticated().and() //.formLogin().and().build();
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authenticationProvider(authenticationProvider())
                .addFilterBefore(authFilter,UsernamePasswordAuthenticationFilter.class)
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }
    
    
    
    
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
    	
    	return config.getAuthenticationManager();
    	
    }
    
    
    

}
