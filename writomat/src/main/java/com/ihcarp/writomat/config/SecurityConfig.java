package your.package.config;  // Replace with your actual package name

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.servlet.config.annotation.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests(authorizeRequests ->
                authorizeRequests
                    .antMatchers("/h2-console/**").permitAll()  // Allow access to H2 console
                    .antMatchers("/api/users/**").permitAll()  // Allow access to your API endpoints
                    .anyRequest().authenticated()  // Require authentication for all other requests
            )
            .csrf(csrf -> csrf.disable())  // Disable CSRF protection for H2 console
            .headers(headers -> headers.frameOptions().disable())  // Disable X-Frame-Options for H2 console
            .cors(withDefaults());  // Enable CORS configuration
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("https://social-media-analytics-dashboard-315ftrnp3.vercel.app/"));  // Allow this origin
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));  // Allowed HTTP methods
        configuration.setAllowedHeaders(Arrays.asList("Authorization", "Content-Type"));  // Allowed headers
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
