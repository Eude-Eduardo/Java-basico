package Enums;

import Enums.EstadosBrasileiro.EstadoBrasileiro;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            // System.out.println(e.getSigla() + " - " + e.getNome());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;

        System.err.println(eb.getNome());
        System.err.println(eb.getSigla());
        System.err.println(eb.getIbge());
        System.err.println(eb.getNomeMaiusculo());
    }
}
