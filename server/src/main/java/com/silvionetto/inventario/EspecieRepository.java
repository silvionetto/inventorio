package com.silvionetto.inventario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EspecieRepository extends JpaRepository<Especie, Long> {
}
