package com.miguelmaldonado.uisrael.msa.ms_solicitudes.repository;

import com.miguelmaldonado.uisrael.msa.ms_solicitudes.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository  extends JpaRepository<Solicitud, Long> {
}
