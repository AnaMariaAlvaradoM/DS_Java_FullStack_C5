package com.devsenior.vetcare.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import com.devsenior.vetcare.model.Rol;

public record RegistroRequest(
        @NotBlank(message = "El username es obligatorio")
        String username,

        @NotBlank(message = "El password es obligatorio")
        String password,

        @NotNull(message = "El rol es obligatorio")
        Rol rol
) {}