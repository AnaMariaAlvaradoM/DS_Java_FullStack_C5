package com.devsenior.vetcare.controller;

import com.devsenior.vetcare.dto.DuenoRequest;
import com.devsenior.vetcare.dto.DuenoResponse;
import com.devsenior.vetcare.service.DuenoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/duenos")
public class DuenoController {

    private final DuenoService duenoService;

    public DuenoController(DuenoService duenoService) {
        this.duenoService = duenoService;
    }

    @GetMapping
    public ResponseEntity<List<DuenoResponse>> listarTodos() {
        return ResponseEntity.ok(duenoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DuenoResponse> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(duenoService.buscarPorId(id));
    }

//    @PostMapping
//    public ResponseEntity<DuenoResponse> crear(@Valid @RequestBody DuenoRequest request) {
//        DuenoResponse creado = duenoService.crear(request);
//        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
//    }

//    @PutMapping("/{id}")
//    public ResponseEntity<DuenoResponse> actualizar(
//            @PathVariable Long id,
//            @Valid @RequestBody DuenoRequest request) {
//        return ResponseEntity.ok(duenoService.actualizar(id, request));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
//        duenoService.eliminar(id);
//        return ResponseEntity.noContent().build();
//    }

    // TODO Modulo 2 (JWT): reactivar @PreAuthorize("hasRole('ADMIN')") cuando tengan login.
    // Por ahora, en Modulo 1 / Clase 4, el frontend registra duenos sin autenticacion.
    @PostMapping
    public ResponseEntity<DuenoResponse> crear(@Valid @RequestBody DuenoRequest request) {
        DuenoResponse creado = duenoService.crear(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    // TODO Modulo 2 (JWT): reactivar @PreAuthorize("hasRole('ADMIN')") cuando tengan login.
    @PutMapping("/{id}")
    public ResponseEntity<DuenoResponse> actualizar(
            @PathVariable Long id,
            @Valid @RequestBody DuenoRequest request) {
        return ResponseEntity.ok(duenoService.actualizar(id, request));
    }

    // TODO Modulo 2 (JWT): reactivar @PreAuthorize("hasRole('ADMIN')") cuando tengan login.
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        duenoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}


























//
//
//import com.devsenior.vetcare.model.Dueno;
//import com.devsenior.vetcare.service.DuenoService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/duenos")
//public class DuenoController {
//
//    private final DuenoService duenoService;
//
//    public DuenoController(DuenoService duenoService) {
//        this.duenoService = duenoService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Dueno>> listarTodos() {
//        return ResponseEntity.ok(duenoService.listarTodos());
//    }
//}


