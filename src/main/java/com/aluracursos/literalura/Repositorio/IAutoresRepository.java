package com.aluracursos.literalura.Repositorio;

import com.aluracursos.literalura.Model.Autores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAutoresRepository extends JpaRepository<Autores, Long> {
    Autores findByNameIgnoreCase(String nombre);

    List<Autores> findByAnioNacimientoLessThanEqualAndAnioMuerteGreaterThanEqual(int anioInicial, int anioFinal);

}
