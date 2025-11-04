package NivelIntermediario.Aulas.Overload;

public class Uchiha extends Ninja{

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " e esse é meu ataque Uchiha, um ataque de fogo. Eu já completei: " + numeroDeMissoesConcluidas);
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println(nome + " essa é minha estratégia de combate");
    }
}

