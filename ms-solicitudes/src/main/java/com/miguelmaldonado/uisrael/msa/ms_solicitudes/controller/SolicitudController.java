package com.miguelmaldonado.uisrael.msa.ms_solicitudes.controller;

import com.miguelmaldonado.uisrael.msa.ms_solicitudes.model.Solicitud;
import com.miguelmaldonado.uisrael.msa.ms_solicitudes.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {

    @Autowired
    private SolicitudRepository repo;

    @PostMapping
    public Solicitud registrar(@RequestBody Solicitud solicitud) {
        solicitud.setFechaRegistro(LocalDate.now());
        solicitud.setEstado("EN_REVISION");
        return repo.save(solicitud);
    }

    @GetMapping
    public List<Solicitud> listar() {
        return repo.findAll();
    }
}
