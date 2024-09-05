package Herança.Equipamentos.estabelecimento;

import Herança.Equipamentos.Digitalizadora.Digitalizadora;
import Herança.Equipamentos.Digitalizadora.Scanner;
import Herança.Equipamentos.Impressora.DeskJet;
import Herança.Equipamentos.Impressora.Impressora;
import Herança.Equipamentos.Impressora.Laserjet;
import Herança.Equipamentos.copiadora.Copiadora;
import Herança.Equipamentos.multifuncional.EquipamentoMultifuncional;

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
