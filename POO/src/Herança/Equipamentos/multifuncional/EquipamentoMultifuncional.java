package Herança.Equipamentos.multifuncional;

import Herança.Equipamentos.Digitalizadora.Digitalizadora;
import Herança.Equipamentos.Impressora.Impressora;
import Herança.Equipamentos.copiadora.Copiadora;

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
