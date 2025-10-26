package com.hideout.pocs.swagger.service;

import com.hideout.pocs.swagger.domain.Paciente;
import com.hideout.pocs.swagger.mapper.PacienteMapper;
import com.hideout.pocs.swagger.persistence.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository repository;
    private final PacienteMapper mapper;

    public List<Paciente> listar() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    public Paciente crear(Paciente paciente) {
        var saved = repository.save(mapper.toEntity(paciente));
        return mapper.toDomain(saved);
    }
}

