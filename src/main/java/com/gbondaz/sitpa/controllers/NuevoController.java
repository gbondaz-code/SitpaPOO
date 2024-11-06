package com.gbondaz.sitpa.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.stereotype.Controller;*/
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.bind.annotation.ModelAttribute;*/
/*import org.springframework.web.bind.annotation.PathVariable;*/

import com.gbondaz.sitpa.models.Paciente;
import com.gbondaz.sitpa.repositories.PacienteRepository;
/*import org.springframework.web.bind.annotation.PostMapping;*/
/*import org.springframework.web.bind.annotation.RequestBody;*/
/*import org.springframework.web.bind.annotation.RequestMapping;*/
/*import org.springframework.web.bind.annotation.RequestParam;*/

public class NuevoController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping("/pacientes")
    public String listarPacientes(Model model) {
     List<Paciente> pacientes = pacienteRepository.findAll();
     model.addAttribute("pacientes", pacientes);
        return "Pacientes";
    }



}
