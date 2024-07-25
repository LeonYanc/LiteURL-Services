//package liteurl.service;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//
//import java.util.List;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean CorsConfigurationSource corsConfigurationSource() {        CorsConfiguration configuration = new CorsConfiguration();        configuration.applyPermitDefaultValues();        configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD"));        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();        source.registerCorsConfiguration("/**",configuration);        return source;    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        return http
////                .cors(cors -> cors.configurationSource(corsConfigurationSource()))
//                .authorizeHttpRequests((auth) -> auth.anyRequest().permitAll()).build();
//    }
//
//}