package com.devsenior.colmena.controller;

import com.devsenior.colmena.dto.EstadoRequest;
import com.devsenior.colmena.dto.UsuarioRequest;
import com.devsenior.colmena.dto.UsuarioResponse;
import com.devsenior.colmena.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Todo este controlador exige el mismo permiso: se pone una sola vez, sobre la clase
@RestController
@RequestMapping("/api/usuarios")
@PreAuthorize("hasAuthority('USUARIOS_GESTIONAR')")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> listar() {
        return ResponseEntity.ok(usuarioService.listar());
    }

    @PostMapping
    public ResponseEntity<UsuarioResponse> crear(@Valid @RequestBody UsuarioRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.crear(request));
    }

    @PatchMapping("/{id}/estado")
    public ResponseEntity<UsuarioResponse> cambiarEstado(@PathVariable Long id,
                                                         @Valid @RequestBody EstadoRequest request,
                                                         Authentication autenticacion) {
        return ResponseEntity.ok(usuarioService.cambiarEstado(id, request.activo(), autenticacion.getName()));
    }
}
