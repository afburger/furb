package com.furb.andre.jwtauthspringboot.web;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class CarrosController {
    
    @GetMapping
    public List<Carro> all() {
        return List.of(
            new Carro("Toyota Corolla", 2022),
            new Carro("Ford Mustang", 1964),
            new Carro("Volkswagen Golf", 2000),
            new Carro("Honda Civic", 2019),
            new Carro("BMW M3", 2023)
        );
    }

    public record Carro(String modelo, Integer ano) {}
}
