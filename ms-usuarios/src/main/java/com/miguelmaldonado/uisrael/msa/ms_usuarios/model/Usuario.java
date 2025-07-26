package com.miguelmaldonado.uisrael.msa.ms_usuarios.model;
import jakarta.persistence.*;
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String identificacion;
}
