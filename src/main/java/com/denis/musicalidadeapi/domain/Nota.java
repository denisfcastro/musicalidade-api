package com.denis.musicalidadeapi.domain;

import com.fasterxml.jackson.annotation.JsonValue;
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
    @JsonValue
    public String getSimbolo() {
        return simbolo;
    }
}