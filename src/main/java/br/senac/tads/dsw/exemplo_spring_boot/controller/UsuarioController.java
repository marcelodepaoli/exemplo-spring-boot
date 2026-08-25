package br.senac.tads.dsw.exemplo_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    
    @GetMapping("/ping")
    public String testarConexao() {
        return "API de Usuários está online e funcionando";
    }

}
