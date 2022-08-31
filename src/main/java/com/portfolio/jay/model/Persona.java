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
@NoArgsConstructor
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    private String url_foto;
    private String fecha_nac;
    private String position;
    private String sobre_mi;
    private String sobre_mi_bg;
    private String curriculum;

    public Persona(@NotNull String nombre, @NotNull String apellido, String url_foto, String fecha_nac, String position,
            String sobre_mi, String sobre_mi_bg, String curriculum) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.url_foto = url_foto;
        this.fecha_nac = fecha_nac;
        this.position = position;
        this.sobre_mi = sobre_mi;
        this.sobre_mi_bg = sobre_mi_bg;
        this.curriculum = curriculum;
    }

}
