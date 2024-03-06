//package com.LLC.ProductionProcess.config;
//
//import com.LLC.ProductionProcess.security.JwtAuthenticationEntryPoint;
//import com.LLC.ProductionProcess.security.JwtAuthenticationFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    private final JwtAuthenticationEntryPoint authenticationEntryPoint;
//    private UserDetailsService userDetailsService;
//    private JwtAuthenticationFilter jwtAuthenticationFilter;
//
//    @Autowired
//    public SecurityConfig(UserDetailsService userDetailsService,
//                          JwtAuthenticationEntryPoint authenticationEntryPoint,
//                          JwtAuthenticationFilter jwtAuthenticationFilter) {
//        this.userDetailsService = userDetailsService;
//        this.authenticationEntryPoint = authenticationEntryPoint;
//        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
//        return configuration.getAuthenticationManager();
//    }
//
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http.authorizeHttpRequests(authorize -> authorize
//
//                        .requestMatchers(HttpMethod.GET, "/evaporation/**").permitAll()
//                        .requestMatchers("/auth/**").permitAll()
//                        .anyRequest().authenticated())
//
//                .httpBasic(Customizer.withDefaults())
//                /* For JWT I must configure a exception handling of the SecurityFilterChain
//                 using the JWTEntryPoint */
//                .exceptionHandling(exception ->
//                                exception.authenticationEntryPoint(authenticationEntryPoint)
//                        /* To configure JWT STATELESS */
//                ).sessionManagement(session ->
//                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                );
//
//        http.csrf(csrf -> {
//            csrf.disable();
//        });
//
//        // PARA QUE APAREZCA LA CONSOLA H2 --> BORRAR!
//        http.headers().frameOptions().disable();
//
//        /* TO ADD Filter before others, in this case for JWT use */
//        http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//
//        return http.build();
//    }
//}
