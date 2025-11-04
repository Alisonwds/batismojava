package NivelIntermediario.Aulas.Overload;

public class Uzumaki extends Ninja{

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println(nome + " e esse é meu ataque Uzumaki, um ataque de selamento. Eu já completei: " + numeroDeMissoesConcluidas);
    }
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println(nome + " essa é a minha estratégia de combate");
    }
}
