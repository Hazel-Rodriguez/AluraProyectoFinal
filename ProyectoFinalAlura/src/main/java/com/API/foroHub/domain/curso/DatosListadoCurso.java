package com.API.foroHub.domain.curso;

public record DatosListadoCurso(
        Long id,
        String nombre,
        String categoria
) {
    @Override
    public String toString() {
        return "DatosListadoCurso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public DatosListadoCurso(Curso curso){
        this(curso.getId(),
                curso.getNombre(),
                curso.getCategoria()
                );
    }
}
