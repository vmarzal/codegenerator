package com.hideout.pocs.swagger.mapper;

import com.hideout.pocs.swagger.domain.Paciente;
import com.hideout.pocs.swagger.model.PacienteDTO;
import com.hideout.pocs.swagger.persistence.PacienteEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PacienteMapper {

    Paciente toDomain(PacienteDTO dto);
    PacienteDTO toDto(Paciente domain);

    PacienteEntity toEntity(Paciente domain);
    Paciente toDomain(PacienteEntity entity);
}

