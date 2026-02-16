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
        Nota[] todasNotas = Nota.values();

        escala.add(notaBase);

        int indiceAtual = notaBase.ordinal() ;

        for (int i = 0; i < 6; i++) {
            indiceAtual = (indiceAtual + INTERVALOS_MAIOR[i]) % 12;

            escala.add(todasNotas[indiceAtual]);
        }

        return escala;
    }
}