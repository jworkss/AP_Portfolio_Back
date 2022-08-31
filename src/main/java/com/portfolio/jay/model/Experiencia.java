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

public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String nombre_empresa;
    private boolean trabajo_actual;
    private String fecha_inicio;
    private String fecha_fin;
    private String descripcion;
    private String tipo_empleo;
    private Long persona_id;

    public Experiencia(@NotNull String nombre_empresa, boolean trabajo_actual, String fecha_inicio, String fecha_fin,
            String descripcion, String tipo_empleo, Long persona_id) {
        this.nombre_empresa = nombre_empresa;
        this.trabajo_actual = trabajo_actual;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.tipo_empleo = tipo_empleo;
        this.persona_id = persona_id;
    }

}
