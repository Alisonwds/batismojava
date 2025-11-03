package NivelIntermediario.Aulas;

public class Main {
    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto é um OBJETO
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.idade = 17;
        naruto.aldeia = "Aldeia da Folha";
        naruto.ModoSabioAtivado();

        // Criar ninja Sasuke Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 20;
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.sharinganAtivado();
/*
        // Aplicando Metodos ao meu objetos
        String chamandoMetodo = sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = sasuke.anosParaSeTornarHokage(60);
        System.out.println("Você tem "+ sasuke.idade + " anos entao falta no minimo: " + quantoTempoFalta + " anos para voce se tornar Hokage");*/

        // Criar Sakura Haruno
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura";
        sakura.idade = 19;
        sakura.aldeia = "Aldeia da Folha";
        sakura.ativarCura();

        // Criar Hinata Hyuga
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata";
        hinata.idade = 18;
        hinata.aldeia = "Aldeia da Folha";
        hinata.ativarByakugan();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto";
        boruto.idade = 9;
        boruto.aldeia = "Aldeia da Folha";

        boruto.ModoSabioAtivado();
        boruto.AtivarOKarma();
        boruto.AtivarJougan();
    }
}
