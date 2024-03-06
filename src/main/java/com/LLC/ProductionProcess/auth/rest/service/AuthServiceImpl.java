//package com.LLC.ProductionProcess.auth.rest.service;
//
//import com.LLC.ProductionProcess.auth.dao.RoleRepository;
//import com.LLC.ProductionProcess.auth.dao.UserRepository;
//import com.LLC.ProductionProcess.auth.entity.Login;
//import com.LLC.ProductionProcess.auth.entity.Register;
//import com.LLC.ProductionProcess.auth.entity.Role;
//import com.LLC.ProductionProcess.auth.entity.User;
//import com.LLC.ProductionProcess.exception.DataException;
//import com.LLC.ProductionProcess.security.JwtTokenProvider;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class AuthServiceImpl implements AuthService {
//
//    private final AuthenticationManager authenticationManager;
//    private final UserRepository userRepository;
//    private final RoleRepository roleRepository;
//    private final PasswordEncoder passwordEncoder;
//    private final JwtTokenProvider jwtTokenProvider;
//
//    @Autowired
//    public AuthServiceImpl(AuthenticationManager authenticationManager,
//                           UserRepository userRepository,
//                           RoleRepository roleRepository,
//                           PasswordEncoder passwordEncoder,
//                           JwtTokenProvider jwtTokenProvider) {
//
//        this.authenticationManager = authenticationManager;
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//        this.passwordEncoder = passwordEncoder;
//        this.jwtTokenProvider = jwtTokenProvider;
//    }
//
//    @Override
//    public String login(Login login) {
//
//        // Creating the Authentication Spring Object, using the manager
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                login.getUsernameOrEmail(),
//                login.getPassword()));
//
//        // Set the Authentication Object in the Spring context
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        // Creating the JWT token
//        String token = jwtTokenProvider.generateJwtToken(authentication);
//
//        // return "User Logged-in successfully!."; --> If i use just Basic Auth
//        return token;
//    }
//
//    @Override
//    public String register(Register register) {
//
//        if (userRepository.existsByUsername(register.getUsername())) {
//            throw new DataException("The user already exist!");
//        }
//
//        if (userRepository.existsByEmail(register.getEmail())) {
//            throw new DataException("The email already exist!");
//        }
//
//        User user = new User();
//        user.setEmail(register.getEmail());
//        user.setUsername(register.getUsername());
//        user.setPassword(passwordEncoder.encode(register.getPassword()));
//
//        Set<Role> roles = new HashSet<>();
//        Role userRole = roleRepository.findByName("USER_ROLE").get();
//        roles.add(userRole);
//        user.setRoles(roles);
//
//        userRepository.save(user);
//
//        return "User created!";
//    }
//}
