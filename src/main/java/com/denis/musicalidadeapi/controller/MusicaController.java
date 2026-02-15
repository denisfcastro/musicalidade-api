package com.denis.musicalidadeapi.controller;

import com.denis.musicalidadeapi.domain.Nota;
import com.denis.musicalidadeapi.service.EscalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/musica")
public class MusicaController {

    @Autowired
    private EscalaService escalaService;

    @GetMapping("/escala-maior/{nota}")
    public List<Nota> getEscalaMaior(@PathVariable Nota nota) {
        return escalaService.gerarEscalaMaior(nota);
    }
}