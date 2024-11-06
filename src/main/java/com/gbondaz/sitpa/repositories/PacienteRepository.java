package com.gbondaz.sitpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gbondaz.sitpa.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

    static void save(Paciente paciente, PacienteRepository pacienteRepository) {
        
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}
