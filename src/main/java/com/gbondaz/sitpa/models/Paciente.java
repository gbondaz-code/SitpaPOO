package com.gbondaz.sitpa.models;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pacientes")

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    
    private int telefono;
    private String recomienda;
    
    private String coberturaMedica;  
    private int sesionesPorMes;
    private int sesionesAdeudadas; 
    private LocalDate fechaNacimiento; 
    private LocalDate fechaInicio; 


    // Constructores
    public Paciente(Integer id, String nombre, String apellido, LocalDate fechaNacimiento, int telefono,
            String recomienda, LocalDate fechaInicio, String coberturaMedica, int sesionesPorMes,
            int sesionesAdeudadas) {
                
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.recomienda = recomienda;
        this.fechaInicio = fechaInicio;
        this.coberturaMedica = coberturaMedica;
        this.sesionesPorMes = sesionesPorMes;
        this.sesionesAdeudadas = sesionesAdeudadas;

    }

    // Constructor vacio
    public Paciente() {
    }

    
    // Getters y Setter de cada uno
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate  getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate  fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getRecomienda() {
        return recomienda;
    }

    public void setRecomienda(String recomienda) {
        this.recomienda = recomienda;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCoberturaMedica() {
        return coberturaMedica;
    }

    public void setCoberturaMedica(String coberturaMedica) {
        this.coberturaMedica = coberturaMedica;
    }

    public int getSesionesPorMes() {
        return sesionesPorMes;
    }

    public void setSesionesPorMes(int sesionesPorMes) {
        this.sesionesPorMes = sesionesPorMes;
    }

    public int getSesionesAdeudadas() {
        return sesionesAdeudadas;
    }

    public void setSesionesAdeudadas(int sesionesAdeudadas) {
        this.sesionesAdeudadas = sesionesAdeudadas;
    }

    
}
