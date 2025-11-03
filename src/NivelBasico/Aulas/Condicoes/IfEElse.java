package NivelBasico.Aulas.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

    /*
    * IF e ELSE = NivelBasico.Aulas.Condicoes
    * Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
    * */

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 24;

        /*
        * if (condicao) { resultado }
        * else if (condicao) { resultado }
        * else { resultado caso nada seja verdadeiro }
        * */
//        Se (condicao) {Faca isso}
        if(numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
