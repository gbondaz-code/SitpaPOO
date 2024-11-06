package com.gbondaz.sitpa.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.gbondaz.sitpa.models.Paciente;
import com.gbondaz.sitpa.repositories.PacienteRepository;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/pacientes")
public class PacientesController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping("")
     public String listarPacientes(Model model) {
     List<Paciente> pacientes = pacienteRepository.findAll();
     model.addAttribute("pacientes", pacientes);
        return "pacientes";
    }

       
   
    @GetMapping("/eliminar/{id}")
    public String eliminarPaciente(@PathVariable Integer id) {
    pacienteRepository.deleteById( id);
        return "redirect:/pacientes";
    }

    
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarProducto(@PathVariable Integer id, Model model) {
        Paciente paciente = pacienteRepository.findById(id).orElse(null);
        model.addAttribute("paciente", paciente);
        return "editar";  // Se eliminó "productos/"
    }

    @PostMapping("/{id}")
    public String actualizarProducto(@PathVariable Integer id,
       @ModelAttribute Paciente paciente) {
        paciente.setId(id);
        pacienteRepository.save(paciente);
        return "redirect:/pacientes";
    }
    
}
