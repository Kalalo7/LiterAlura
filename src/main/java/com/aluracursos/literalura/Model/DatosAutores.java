package com.aluracursos.literalura.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutores(

        @JsonAlias("name") String nombreAutor,
        @JsonAlias("birth_year") int anioNacimiento,
        @JsonAlias("death_year") int anioMuerte
) {
}
