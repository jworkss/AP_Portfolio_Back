package com.portfolio.jay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String nombre;
    private String descripcion;
    private String url_proyecto;
    private String url_foto;
    private Long persona_id;

    public Proyecto(@NotNull String nombre, String descripcion, String url_proyecto, String url_foto, Long persona_id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url_proyecto = url_proyecto;
        this.url_foto = url_foto;
        this.persona_id = persona_id;
    }

}
