/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bca.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("helloService")
public class HelloService {

    public String sayHello(String nama) {
        return "Hi " + nama + " welcome to Springboot";
    }
}
