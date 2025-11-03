package NivelBasico.Aulas.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        *  Ternarios: Maneiras de reduzir o código
        *  Variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
        * */

        short numeroDeMissoes = 9;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);
    }
}
