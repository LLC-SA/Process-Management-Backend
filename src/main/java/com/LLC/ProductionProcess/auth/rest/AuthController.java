//package com.LLC.ProductionProcess.auth.rest;
//
//import com.LLC.ProductionProcess.auth.dto.JwtAuthResponse;
//import com.LLC.ProductionProcess.auth.entity.Login;
//import com.LLC.ProductionProcess.auth.entity.Register;
//import com.LLC.ProductionProcess.auth.rest.service.AuthService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//
//    private final AuthService authService;
//
//    @Autowired
//    public AuthController(AuthService authService) {
//        this.authService = authService;
//    }
//
//    /* Login for basic auth using spring security */
//    /* @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody Login login) {
//
//        String response = authService.login(login);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    } */
//
//    /* login using JWT token */
//    @PostMapping("/login")
//    public ResponseEntity<JwtAuthResponse> login(@RequestBody Login login) {
//
//        String token = authService.login(login);
//
//        JwtAuthResponse jwtAuthResponse = new JwtAuthResponse();
//        jwtAuthResponse.setAccessToken(token);
//
//        return new ResponseEntity<>(jwtAuthResponse, HttpStatus.OK);
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity<String> register(@RequestBody Register register) {
//
//        String response = authService.register(register);
//        return new ResponseEntity<>(response, HttpStatus.CREATED);
//    }
//}
