package com.devsenior.colmena.controller;

import com.devsenior.colmena.dto.ResumenResponse;
import com.devsenior.colmena.service.ReporteService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    private final ReporteService reporteService;

    public ReporteController(ReporteService reporteService) {
        this.reporteService = reporteService;
    }

    @PreAuthorize("hasAuthority('REPORTES_VER')")
    @GetMapping("/resumen")
    public ResponseEntity<ResumenResponse> resumen() {
        return ResponseEntity.ok(reporteService.resumen());
    }
}
