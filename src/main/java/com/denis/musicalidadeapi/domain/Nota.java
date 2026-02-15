package com.denis.musicalidadeapi.domain;

public enum Nota {
    C("C"),
    C_SHARP("C#"),
    D("D"),
    D_SHARP("D#"),
    E("E"),
    F("F"),
    F_SHARP("F#"),
    G("G"),
    G_SHARP("G#"),
    A("A"),
    A_SHARP("A#"),
    B("B");

    private final String simbolo;

    Nota(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}