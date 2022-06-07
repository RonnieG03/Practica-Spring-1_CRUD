package com.example.PracticaSpring1.Controller;

import com.example.PracticaSpring1.Dao.UsuarioDao;
import com.example.PracticaSpring1.Model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @PostMapping("/save")
    public void Save(@RequestBody Usuario usuario){
        usuarioDao.save(usuario);
    }

    @GetMapping("/list")
    public List<Usuario> list(){
        return usuarioDao.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete (@PathVariable ("id") Integer id){
        usuarioDao.deleteById(id);
    }

    @PutMapping("/Edit")
    public void Edit (@RequestBody Usuario usuario){
            usuarioDao.save(usuario);
    }
}
