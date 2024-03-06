//package com.LLC.ProductionProcess.security;
//
//import com.LLC.ProductionProcess.auth.dao.UserRepository;
//import com.LLC.ProductionProcess.auth.entity.Role;
//import com.LLC.ProductionProcess.auth.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private final UserRepository userRepository;
//
//    @Autowired
//    public CustomUserDetailsService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    // Loads the User from the Database
//    @Override
//    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
//
//        User user = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
//                .orElseThrow(() -> new UsernameNotFoundException("No se encontró el usuario buscado"));
//
//        // Converting handmade User object into Spring Security User object
//        return new org.springframework.security.core.userdetails.User(
//                user.getEmail(),
//                user.getPassword(),
//                mapRolesToAuthorities(user.getRoles())
//        );
//    }
//
//    // To grant authority using Spring Security to a User Object (Authentication Object) using the Role object of these Users
//    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Set<Role> roles) {
//
//        return roles.stream()
//                .map(role -> new SimpleGrantedAuthority(role.getName()))
//                .collect(Collectors.toList());
//    }
//}
