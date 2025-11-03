package NivelBasico.Aulas.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        * SwitcCases: Que servem para gerar casos especificos
        * Objetivo: Pedir para o usuario escolher entre os ninjas
        * switchCase
        * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        int escolhaDoUsuario = scanner.nextInt();

        //Escolha do usuario
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
            case 2:
                System.out.println("O usuario escolheu Sasuke Uchiha");
                break;
           case 3:
               System.out.println("O usuario escolheu Sakura Haruno");
               break;
           default:
               System.out.println("Escolha um numero valido");
               break;
        }
        //Fechar a caixa
        scanner.close();
    }
}
