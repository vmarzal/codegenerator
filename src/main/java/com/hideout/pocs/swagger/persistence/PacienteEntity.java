package com.hideout.pocs.swagger.persistence;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "pacientes")
public class PacienteEntity {
    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
}

