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

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é: " + nome + " Essa é minha estratégia de combate");
    }

    // Inteligencia de combate - Metodo Padrão
    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é: " + nome + " Essa é minha inteligência de combate");
    }

    // Inteligencia de combate - Sobrecarga de metodo
    @Override
    public void inteligenciaDeCombate(int qi) {
        if(qi > 150){
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        }else if(qi >= 130){
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas habilidades");
        }

    }
}
