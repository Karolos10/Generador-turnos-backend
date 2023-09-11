package com.asesoftware.turnos.turnos;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "turnos")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_turno", nullable = false)
    private Long idTurno;


    @Column(name = "fecha_turno", nullable = false)
    private Date fechaTurno;

    @Column(name = "hora_inicio", nullable = false)
    private String horaInicio;

    @Column(name = "hora_fin", nullable = false)
    private String horaFin;

    @Column(name = "estado", nullable = false)
    private String estado;


}
