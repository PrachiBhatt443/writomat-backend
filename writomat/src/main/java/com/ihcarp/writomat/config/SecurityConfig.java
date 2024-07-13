@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/h2-console/**").permitAll()
                                .requestMatchers("/api/users/**").permitAll()
                                .requestMatchers("/api/analytics/**").permitAll()
                                .anyRequest().authenticated()
                )
                .csrf(csrf -> csrf.disable())
                .headers(headers -> headers
                        .frameOptions(frameOptions -> frameOptions.sameOrigin())
                )
                .cors(cors -> cors
                        .configurationSource(corsConfigurationSource())
                );

        return http.build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList(
            "https://social-media-analytics-dashboard-self.vercel.app",
            "http://localhost:3000",
            "https://writomat-backend.onrender.com"  // Add this origin
        ));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        configuration.setAllowedHeaders(Arrays.asList("Authorization", "Content-Type"));
        configuration.setAllowCredentials(true); // Allow credentials
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
