package your.package.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests(authorizeRequests ->
                authorizeRequests
                    .antMatchers("/h2-console/**").permitAll()  // Allow access to H2 console
                    .anyRequest().authenticated()
            )
            .csrf(csrf -> csrf.disable())  // Disable CSRF protection for H2 console
            .headers(headers -> headers.frameOptions().disable());  // Disable X-Frame-Options for H2 console
    }
}
