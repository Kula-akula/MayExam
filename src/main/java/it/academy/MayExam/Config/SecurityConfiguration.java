package it.academy.MayExam.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .passwordEncoder(passwordEncoder())
                .withUser("admin").password(passwordEncoder().encode("12345")).roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers("/student").permitAll()
                .antMatchers("/student/add").hasRole("ADMIN")
                .antMatchers("/student/delete/**").hasRole("ADMIN")
                .antMatchers("/student").permitAll()
                .anyRequest().authenticated()
//                .antMatchers(HttpMethod.DELETE,"/items/delete/**").hasRole("SUPERVISOR")
//                .antMatchers(HttpMethod.POST,"/items").hasRole("SUPERVISOR")
//                .antMatchers(HttpMethod.GET, "/items").hasAnyRole("ADMIN","USER")
                .and().csrf().disable().headers().frameOptions().disable()
                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
    }


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
