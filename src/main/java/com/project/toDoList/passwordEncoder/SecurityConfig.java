package com.project.toDoList.passwordEncoder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/* Configurazione della sicurezza per disabilitare CSRF e permettere l'accesso a tutte le API
 * Questa configurazione è utile per test locali e sviluppo, ma non è consigliata in produzione.
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable) // Disattiva CSRF per test locali
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Permette l’accesso a tutte le API
                );

        return http.build();
    }
}
