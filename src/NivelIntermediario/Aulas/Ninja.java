package NivelIntermediario.Aulas;

public class Ninja {

    String nome;
    int idade;
    String aldeia;

    //Criar um metodo publico personalizado


    /*
    * Metodo String vai ter que retornar um String
    */
    public String euSouUmNinja(){
        return "Oi, Eu sou um ninja!";
    }
    /*
    * Metodo Int vai ter que retornar um int
    * */
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
