package NivelIntermediario.Aulas.Abstract;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    // Metodos Abstratos

    public abstract void nomeDoNinja();

    public void arremessarKunai(){
        System.out.println("Ninja arremessando Kunai");
    }

}
