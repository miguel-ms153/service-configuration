package com.miguelmaldonado.uisrael.msa.ms_usuarios.repository;

import com.miguelmaldonado.uisrael.msa.ms_usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
}
