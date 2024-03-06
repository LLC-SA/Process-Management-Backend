//package com.LLC.ProductionProcess.security;
//
//import com.LLC.ProductionProcess.exception.ApiException;
//import io.jsonwebtoken.*;
//import io.jsonwebtoken.io.Decoders;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Component;
//
//import java.security.Key;
//import java.util.Date;
//
//@Component
//public class JwtTokenProvider {
//
//    @Value("${app.jwt-secret}")
//    private String jwtSecret;
//
//    @Value("${app.jwt-expiration-milliseconds}")
//    private long jwtExpirationDate;
//
//    // Generate JWT token
//    public String generateJwtToken(Authentication authentication) {
//
//        // Getting the name or email from the Authentication Spring Object
//        String username = authentication.getName();
//
//        Date currentDate = new Date();
//
//        Date expireDate = new Date(currentDate.getTime() + jwtExpirationDate);
//
//        String jwtToken = Jwts.builder()
//                .setSubject(username)
//                .setIssuedAt(new Date())
//                .setExpiration(expireDate)
//                .signWith(key())
//                .compact();
//
//        return jwtToken;
//    }
//
//    // To DECODE the JWT secret
//    private Key key() {
//        return Keys.hmacShaKeyFor(
//                Decoders.BASE64.decode(jwtSecret));
//    }
//
//    // Get username from Jwt token
//    public String getUsername(String token) {
//
//        Claims claims = Jwts.parserBuilder()
//                .setSigningKey(key())
//                .build()
//                .parseClaimsJwt(token)
//                .getBody();
//
//        String username = claims.getSubject();
//
//        return username;
//    }
//
//    // Validate JWT token
//    public boolean validateToken(String token) {
//
//        try {
//            Jwts.parserBuilder()
//                    .setSigningKey(key())
//                    .build()
//                    .parse(token);
//
//            return true;
//
//        } catch (MalformedJwtException ex) {
//            throw new ApiException(HttpStatus.BAD_REQUEST, "Invalid JWT Token!");
//        } catch (ExpiredJwtException ex) {
//            throw new ApiException(HttpStatus.BAD_REQUEST, "Expired JWT Token!");
//        } catch (UnsupportedJwtException ex) {
//            throw new ApiException(HttpStatus.BAD_REQUEST, "Unsupported JWT Token!");
//        } catch (IllegalArgumentException ex) {
//            throw new ApiException(HttpStatus.BAD_REQUEST, "JWT claims that the string is empty");
//        }
//    }
//}
