package com.silvionetto.inventario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class EspecieController {
    private EspecieRepository repository;

    public EspecieController(EspecieRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/especies")
    public Collection<Especie> especies() {
        return repository.findAll();
    }
}
