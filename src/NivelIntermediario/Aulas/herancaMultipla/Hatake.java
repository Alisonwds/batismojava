package NivelIntermediario.Aulas.herancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    public void boasVindas() {
        System.out.println(nome + ": Eu sou um Hatake");
    }

    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou um ninja de elite da anbu");
    }
}
