package Equipamentos.multifuncional;

import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Impressora.Impressora;
import Equipamentos.copiadora.Copiadora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    public void copiar() {
        System.out.println("copiando via multifincional");
    }
    public void digitalizar() {
        System.out.println("Digitalizando via multifincional");
    }
    public void imprimindo() {
        System.out.println("Imprimindo via multifincional");
    }
    
}
