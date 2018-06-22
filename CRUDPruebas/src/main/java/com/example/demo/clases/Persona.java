package com.example.demo.clases;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Persona {

    @NotNull(message = "Dame tu nombre para que te salude")
    String nombre;
    @NotNull(message = "Dígame sus apellidos")
    String apellidos;
}