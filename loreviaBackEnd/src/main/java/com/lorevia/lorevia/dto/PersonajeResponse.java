package com.lorevia.lorevia.dto;

import java.time.LocalDate;

public record PersonajeResponse (Long id, String nombre, String lugarOrigen, LocalDate fechaNacimiento, LocalDate fechaMuerte, int librosPerteneciente) {}
