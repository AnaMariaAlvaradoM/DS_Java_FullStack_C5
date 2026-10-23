package com.devsenior.colmena.controller;

import com.devsenior.colmena.dto.ReservaRequest;
import com.devsenior.colmena.dto.ReservaResponse;
import com.devsenior.colmena.service.ReservaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    // Todas las reservas (opcional: ?fecha=2026-10-20)
    @PreAuthorize("hasAuthority('RESERVAS_VER_TODAS')")
    @GetMapping
    public ResponseEntity<List<ReservaResponse>> listarTodas(@RequestParam(required = false) LocalDate fecha) {
        return ResponseEntity.ok(reservaService.listarTodas(fecha));
    }

    // "Mis reservas": el email sale del token, no de la URL
    @PreAuthorize("hasAuthority('RESERVAS_VER_PROPIAS')")
    @GetMapping("/mias")
    public ResponseEntity<List<ReservaResponse>> listarMias(Authentication autenticacion) {
        return ResponseEntity.ok(reservaService.listarMias(autenticacion.getName()));
    }

    @PreAuthorize("hasAuthority('RESERVAS_CREAR')")
    @PostMapping
    public ResponseEntity<ReservaResponse> crear(@Valid @RequestBody ReservaRequest request,
                                                 Authentication autenticacion) {
        ReservaResponse creada = reservaService.crear(request, autenticacion.getName());
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    // Puede entrar quien tenga CUALQUIERA de los dos permisos;
    // el servicio verifica, ademas, que la reserva sea suya si solo tiene "propias"
    @PreAuthorize("hasAnyAuthority('RESERVAS_CANCELAR_PROPIAS', 'RESERVAS_CANCELAR_TODAS')")
    @PatchMapping("/{id}/cancelar")
    public ResponseEntity<ReservaResponse> cancelar(@PathVariable Long id, Authentication autenticacion) {
        return ResponseEntity.ok(reservaService.cancelar(id, autenticacion));
    }
}
