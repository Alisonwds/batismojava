package NivelIntermediario.Desafios.Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    TipoHabilidade tipoHabilidade;

    public NinjaBasico(String nome, int idade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.tipoHabilidade = tipoHabilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("TipoHabilidade: " + tipoHabilidade);
    }
    @Override
    public void executarHabilidade() {
        System.out.println("Executar habilidade " + tipoHabilidade);
    }

}
