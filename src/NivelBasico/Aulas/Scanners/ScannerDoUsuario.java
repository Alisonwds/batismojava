package NivelBasico.Aulas.Scanners;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         *  Scanner = É um jeito de trazer o usuário para dentro da aplicação
         * Objetivo: O usuário vai criar um ninja e vmaos validar os dados
         * */

        Scanner caixaDeTexto = new Scanner(System.in);

//      Receber o nome do ninja
        System.out.println("Digite o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.println("Digite aqui a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("O idade do ninja é: " + idadeDoNinja);

        if(idadeDoNinja >= 18){
            System.out.println("Esse ninja é maior de idade e pode ir para missões fora da aldeia");
        }else{
            System.out.println("Esse ninja é muito novo ainda, precisa treinar mais antes de sair da vila");
        }
        //Fechar sempre o Scanner
        caixaDeTexto.close();


    }
}
