package Equipamentos.estabelecimento;

import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Digitalizadora.Scanner;
import Equipamentos.Impressora.DeskJet;
import Equipamentos.Impressora.Impressora;
import Equipamentos.copiadora.Copiadora;
import Equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        DeskJet deskJet = new DeskJet();
        Scanner scaner = new Scanner();

        Impressora impressora = deskJet;
        Digitalizadora digitalizadora = scaner;
        Copiadora copiadora = em;


        copiadora.copiar();
        digitalizadora.digitalizar();
        impressora.imprimindo();
    }
}
