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

public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String nombre;
    private int nivel;
    private String url_foto;
    private Long tipo_skill;
    private Long persona_id;

    public Skill(@NotNull String nombre, int nivel, String url_foto, Long tipo_skill, Long persona_id) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.url_foto = url_foto;
        this.tipo_skill = tipo_skill;
        this.persona_id = persona_id;
    }

}
