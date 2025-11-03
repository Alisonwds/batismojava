package NivelIntermediario.Aulas.Abstract.Polimorfismo_Abstracao;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    //Sobreescrver o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Eu sou " + nome + " e esse é o meu ataque Uchiha");
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Eu sou " + nome + "estrategia de batalha ");
    }
}
