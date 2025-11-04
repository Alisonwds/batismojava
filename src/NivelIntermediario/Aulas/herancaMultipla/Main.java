package NivelIntermediario.Aulas.herancaMultipla;

public class Main {

    public static void main(String[] args) {

        //Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeida = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();

        //Obj Hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeida = "Aldeia da Folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();

        //Obj Uzumaki
        Uzumaki naruto =  new Uzumaki();
        naruto.nome = "Naruto";
        naruto.aldeida = "Aldeia da Folha";
        naruto.idade = 17;


    }
}
