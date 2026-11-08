package com.example.java_deploy.controller;
import com.example.java_deploy.dto.SaludoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SaludoController {

    @GetMapping("/saludo")
    public SaludoResponse obtenerSaludo() {
        return new SaludoResponse("Hola Mundo");
    }
}