package com.portfolio.jay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String titulo;
    private String institucion;
    private String url_foto;
    private String direccion;
    private String fecha_inicio;
    private String fecha_fin;
        private Long persona_id;

    public Educacion(@NotNull String titulo, String institucion, String url_foto, String direccion, String fecha_inicio,
            String fecha_fin,  Long persona_id) {
        this.titulo = titulo;
        this.institucion = institucion;
        this.url_foto = url_foto;
        this.direccion = direccion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.persona_id = persona_id;
    }

}
