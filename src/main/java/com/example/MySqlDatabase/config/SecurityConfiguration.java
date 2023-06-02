package com.example.MySqlDatabase.config;

import com.example.MySqlDatabase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AndRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
//    @Autowired
//    private UserService userService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//
//    public DaoAuthenticationProvider authenticationProvider(){
//        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
//        auth.setUserDetailsService(userService);
//        auth.setPasswordEncoder(passwordEncoder());
//        return auth;
//    }
    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
       // http.authorizeHttpRequests().requestMatchers("/register**").permitAll()
                //.anyRequest().authenticated()
            //    .and()
               // .formLogin().loginPage("/login")
              //  .defaultSuccessUrl("/book")
              //  .permitAll()
              //  .and()
            //    .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            //    .logoutSuccessUrl("/index")
              //  .permitAll();

//      http.authorizeHttpRequests()
//               .requestMatchers("/login").permitAll()
//               .requestMatchers("/register").permitAll()
//              .requestMatchers("/").permitAll();
//             //   .anyRequest().authenticated();

        return http.build();
    }

}
