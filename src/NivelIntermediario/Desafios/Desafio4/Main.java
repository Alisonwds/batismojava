package NivelIntermediario.Desafios.Desafio4;

public class Main {

    public static void main(String[] args) {

        NinjaBasico ninjaBasico = new NinjaBasico("Sasuke", 15, TipoHabilidade.GENJUTSU);
        NinjaAvancado ninjaAvancado = new NinjaAvancado("Naruto", 15,TipoHabilidade.NINJUTSU, "Kyuubi");

        ninjaBasico.mostrarInformacoes();
        ninjaAvancado.mostrarInformacoes();
        ninjaBasico.executarHabilidade();
        ninjaAvancado.executarHabilidade();

    }
}
