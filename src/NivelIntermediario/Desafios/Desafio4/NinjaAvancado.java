package NivelIntermediario.Desafios.Desafio4;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    TipoHabilidade tipoHabilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade tipoHabilidade , String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.tipoHabilidade = tipoHabilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + tipoHabilidade);
        System.out.println("Especialidade: " + especialidade);
    }
    @Override
    public void executarHabilidade() {
        System.out.println("Execução do " + tipoHabilidade + " com a especilidade " + especialidade);
    }
}
