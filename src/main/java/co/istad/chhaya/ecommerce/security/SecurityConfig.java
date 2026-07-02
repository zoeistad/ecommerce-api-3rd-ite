package co.istad.chhaya.ecommerce.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain configureApiSecurity(HttpSecurity http) {
        // TODO
        // 1. CSRF Token -> Disable
        http.csrf(AbstractHttpConfigurer::disable);

        // 2. Disable form login
        http.formLogin(AbstractHttpConfigurer::disable);

        // 3. Security Mechanism - HTTP Basic Authentication
         http.httpBasic(Customizer.withDefaults());

        // 4. Set REST API to Stateless
        http.sessionManagement(session -> session.sessionCreationPolicy(
                SessionCreationPolicy.STATELESS
        ));

        // 5. Configure endpoints
        // Anonymouse, Authenticated, Authorization
        http.authorizeHttpRequests(endpoints -> endpoints
                .requestMatchers("/api/v1/files/**").permitAll()
                .anyRequest().authenticated()
        );


        return http.build();
    }

}
