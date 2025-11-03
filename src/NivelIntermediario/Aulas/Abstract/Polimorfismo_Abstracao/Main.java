package NivelIntermediario.Aulas.Abstract.Polimorfismo_Abstracao;


public class Main {

    public static void main(String[] args) {

       // Objeto ninja nao da para ser criado

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;

        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 16;

        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        Uchiha uchiha = new Uchiha("Obito Uchiha", "Aldeia da Folha", 30);


    }
}
