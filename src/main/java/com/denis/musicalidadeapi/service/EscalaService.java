package com.denis.musicalidadeapi.service;

import com.denis.musicalidadeapi.domain.Nota;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EscalaService {

    private static final int[] INTERVALOS_MAIOR = {2, 2, 1, 2, 2, 2, 1};

    public List<Nota> gerarEscalaMaior(Nota notaBase) {
        List<Nota> escala = new ArrayList<>();

        escala.add(notaBase);

        int indiceAtual = notaBase.ordinal(); // Pega o número da nota (Ex: C é 0)
        Nota[] todasNotas = Nota.values();    // Pega todas as 12 notas

        for (int intervalo : INTERVALOS_MAIOR) {
            indiceAtual += intervalo;

            indiceAtual = indiceAtual % 12;

            escala.add(todasNotas[indiceAtual]);
        }

        return escala;
    }
}