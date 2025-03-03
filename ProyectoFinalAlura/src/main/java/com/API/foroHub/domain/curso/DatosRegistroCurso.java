package com.API.foroHub.domain.curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroCurso(
        @NotBlank
        String nombre,
        @NotNull
        com.API.foroHub.domain.curso.Categoria categoria,
        @NotNull
        String descripcion
) {
}
