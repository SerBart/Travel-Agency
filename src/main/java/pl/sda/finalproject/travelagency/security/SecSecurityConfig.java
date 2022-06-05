package pl.sda.finalproject.travelagency.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

                http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/user/**", "/trip").hasRole("USER")
                .antMatchers("/admin/**", "/trip").hasRole("ADMIN")
                .antMatchers("/anonymous*").anonymous()
                .antMatchers("/login", "/index.html").permitAll()
                        .antMatchers("/templates/**","/static/**", "/registration/**").permitAll()

                .anyRequest().authenticated()
                .and()
                .logout()
                .deleteCookies("JSESSIONID");
        http.formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/index.html",true)
                .failureUrl("/login?error=true");


    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user1").password(passwordEncoder().encode("user1Pass")).roles("USER")
                .and()
                .withUser("user2").password(passwordEncoder().encode("user2Pass")).roles("USER")
                .and()
                .withUser("admin").password(passwordEncoder().encode("123")).roles("ADMIN");
    }

    public SecSecurityConfig() {
        super();
    }
}






