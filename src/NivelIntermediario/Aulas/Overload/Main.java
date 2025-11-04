package NivelIntermediario.Aulas.Overload;

public class Main {

    public static void main(String[] args) {

        //Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 18, 30, NivelNinja.CHUUNIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();


        //Obj Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        //Obj Uchiha2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27);
        itachi.habilidadeEspecial();

        //Obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 50, 900, NivelNinja.HOKAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();

    }
}
