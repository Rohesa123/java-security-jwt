/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rohesa.jwt.user;

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
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    private Integer id;
    
    private String firstName;
    
    private String lastName;
    
    private String email;
    
    private String password;
}
