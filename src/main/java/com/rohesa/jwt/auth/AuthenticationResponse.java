/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rohesa.jwt.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Rohesa
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class AuthenticationResponse {
    
    private String token;
}
