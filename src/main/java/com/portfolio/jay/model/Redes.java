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
public class Redes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String nombre;
    private String url_foto;
    private String url_red;
    private Long persona_id;

    public Redes(@NotNull String nombre, String url_foto, String url_red, Long persona_id) {
        this.nombre = nombre;
        this.url_foto = url_foto;
        this.url_red = url_red;
        this.persona_id = persona_id;
    }

}
