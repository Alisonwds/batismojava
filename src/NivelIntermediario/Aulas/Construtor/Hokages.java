package NivelIntermediario.Aulas.Construtor;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;
    /*
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;*/

    public Hokages(){
        // Construtor Vazio, sem argumentos
    }

    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
