package com.hideout.pocs.swagger.domain;

import java.time.LocalDate;
import java.time.Period;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Paciente {
    String id;
    String nombre;
    String apellidos;
    LocalDate fechaNacimiento;

    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public boolean esMenorDeEdad() {
        return calcularEdad() < 18;
    }
}

