package pl.sda.finalproject.travelagency.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("/login.html")
                .defaultSuccessUrl("/index.html",true)
                .failureUrl("/login.html?error=true");
                http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/user/**", "/index.html", "/trip").hasRole("USER")
                .antMatchers("/admin/**", "/index.html", "/trip").hasRole("ADMIN")
                .antMatchers("/anonymous*").anonymous()
                .antMatchers("/login").permitAll()
                .anyRequest().authenticated();




    }


    public SecSecurityConfig() {
        super();
    }
}






