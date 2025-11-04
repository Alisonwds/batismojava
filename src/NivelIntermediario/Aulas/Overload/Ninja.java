package NivelIntermediario.Aulas.Overload;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir 2 novos  atributos: numeroDeMissoesConcluidas, Rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;

    }

    // Sobrecarga de métodos você não preicsa redeclarar o construtor só os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Metodos geral! Todos os ninjas vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + "e esse é meu ataque especial");
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Estrategia de Batalha Ninja");
    }

}
