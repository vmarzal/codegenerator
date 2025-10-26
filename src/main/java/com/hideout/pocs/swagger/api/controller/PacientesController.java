package com.hideout.pocs.swagger.api.controller;

import com.hideout.pocs.swagger.api.DefaultApi;
import com.hideout.pocs.swagger.mapper.PacienteMapper;
import com.hideout.pocs.swagger.model.PacienteDTO;
import com.hideout.pocs.swagger.service.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PacientesController implements DefaultApi {

    private final PacienteService service;
    private final PacienteMapper mapper;

    @Override
    public ResponseEntity<List<PacienteDTO>> listarPacientes() {
        var pacientes = service.listar().stream().map(mapper::toDto).toList();
        return ResponseEntity.ok(pacientes);
    }

    @Override
    public ResponseEntity<Void> crearPaciente(PacienteDTO pacienteDto) {
        var paciente = mapper.toDomain(pacienteDto);
        service.crear(paciente);
        return ResponseEntity.status(201).build();
    }
}


