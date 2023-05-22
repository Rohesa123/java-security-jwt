/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rohesa.jwt.auth;

import com.rohesa.jwt.user.User;
import com.rohesa.jwt.user.UserRepository;
import com.rohesa.jwt.config.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Rohesa
 */

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    
    public AuthenticationResponse register(RegisterRequest request) {
        var user = User.builder()
                .firstName(request.getFirstname())
                .lastName(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();
        repository.save(user);
        var jwtToken = jwtService.generatedToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
    
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        return null;
    }
}
