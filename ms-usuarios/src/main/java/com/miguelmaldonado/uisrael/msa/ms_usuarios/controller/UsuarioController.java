package com.miguelmaldonado.uisrael.msa.ms_usuarios.controller;


import com.miguelmaldonado.uisrael.msa.ms_usuarios.model.Usuario;
import com.miguelmaldonado.uisrael.msa.ms_usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repo;

    @PostMapping
    public Usuario registrar(@RequestBody Usuario usuario) {
        return repo.save(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return repo.findAll();
    }
}
