package Enums;

import Enums.EstadosBrasileiro.EstadoBrasileiro;

public class SistemaIbge {
    public static void main(String[] args) {
        var values = EstadoBrasileiro.values();
		for (int i = 0; i < values.length; i++) {
		}
        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;

        System.err.println(eb.getNome());
        System.err.println(eb.getSigla());
        System.err.println(eb.getIbge());
        System.err.println(eb.getNomeMaiusculo());
    }
}
