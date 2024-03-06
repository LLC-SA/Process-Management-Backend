//package com.LLC.ProductionProcess.security;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//@Component
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//
//    private final JwtTokenProvider jwtTokenProvider;
//    private final UserDetailsService userDetailsService;
//
//    @Autowired
//    public JwtAuthenticationFilter(JwtTokenProvider jwtTokenProvider, UserDetailsService userDetailsService) {
//        this.jwtTokenProvider = jwtTokenProvider;
//        this.userDetailsService = userDetailsService;
//    }
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request,
//                                    HttpServletResponse response,
//                                    FilterChain filterChain) throws ServletException, IOException {
//
//        // get the JWT token from the http request
//        String token = getTokenFromRequest(request);
//
//        // validate token
//        if (StringUtils.hasText(token) && jwtTokenProvider.validateToken(token)) {
//
//            // get username from the jwt token
//            String username = jwtTokenProvider.getUsername(token);
//
//            // LOAD the user object from the database associated with the token
//            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//
//            // create the auth token for the user using the credentials in UserDetails
//            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
//                    userDetails,
//                    null,
//                    userDetails.getAuthorities());
//
//            // set the details of the auth token using the http request
//            authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//
//            // set the auth token in the spring context
//            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
//        }
//
//        // generating the filter for Spring Security Filter Chain
//        filterChain.doFilter(request, response);
//    }
//
//    private String getTokenFromRequest(HttpServletRequest request) {
//
//        String bearerToken = request.getHeader("Authorization");
//
//        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
//            return bearerToken.substring(7, bearerToken.length());
//        }
//
//        return null;
//    }
//}
