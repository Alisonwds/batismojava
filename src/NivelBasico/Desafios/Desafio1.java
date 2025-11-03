package NivelBasico.Desafios;

public class Desafio1 {

    public static void main(String[] args) {

        String nomeNinja1 = "Naruto Uzumaki";
        String nomeNinja2 = "Sasuke Uchiha";
        String nomeNinja3 = "Sakura";
        int idadeNinja1 = 15;
        int idadeNinja2 = 16;
        int idadeNinja3 = 14;
        String missao1 = "Limpar bueiro";
        String missao2 = "Escoltar imperador";
        String missao3 = "Ajudar idosa";
        char rankMissao1 = 'S';
        char rankMissao2 = 'S';
        char rankMissao3 = 'S';
        boolean statuMissao1 = false;
        boolean statuMissao2 = false;
        boolean statuMissao3 = false;

        System.out.println("Nome: " + nomeNinja1 + "\nIdade: " + idadeNinja1 + "\nMissão: " + missao1 + "\nRank: " + rankMissao1);
        System.out.println("Nome: " + nomeNinja2 + "\nIdade: " + idadeNinja2 + "\nMissão: " + missao2 + "\nRank: " + rankMissao2);
        System.out.println("Nome: " + nomeNinja3 + "\nIdade: " + idadeNinja3 + "\nMissão: " + missao3 + "\nRank: " + rankMissao3);

        if(idadeNinja1 < 15 || idadeNinja2 < 15 || idadeNinja3 < 15){
            if(rankMissao1 == 'C' || rankMissao1 == 'D'){
                statuMissao1 = true;
            }

            if (rankMissao2 == 'C' || rankMissao2 == 'D') {
                statuMissao2 = true;
            }

            if (rankMissao3 == 'C' || rankMissao3 == 'D') {
                statuMissao3 = true;
            }

        }

        if(idadeNinja1 >= 15){
            statuMissao1 = true;
        }
        if (idadeNinja2 >= 15) {
            statuMissao2 = true;
        } 
        if (idadeNinja3 >= 15) {
            statuMissao3 = true;
        }


        if(statuMissao1){
            System.out.println("Missão 1 Concluída");
        } else {
            System.out.println("Missão 1 não concluida");
        }

        if (statuMissao2) {
            System.out.println("Missão 2 Concluída");
        } else {
            System.out.println("Missão 2 não concluida");
        }
        if (statuMissao3) {
            System.out.println("Missão 3 Concluída");
        } else {
            System.out.println("Missão 3 não concluida");
        }
    }
}
