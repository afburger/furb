package com.furb.andre.basic_auth;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploBasicAuthController {

    @GetMapping("/publica")
    public ResponseEntity<String> rotaPublica() {
        return ResponseEntity.ok("Rota Pública");
    }

    @GetMapping("/privada")
    public ResponseEntity<String> rotaPrivada() {
        return ResponseEntity.ok("Rota Privada");
    }
    
}
