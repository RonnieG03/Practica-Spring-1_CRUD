package com.example.PracticaSpring1.Dao;

import com.example.PracticaSpring1.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Integer> {

}
