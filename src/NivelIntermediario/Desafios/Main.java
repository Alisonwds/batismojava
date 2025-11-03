package NivelIntermediario.Desafios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Uchiha[] ninjas = new Uchiha[1];

//        sc.nextLine();

        int opcao = 0;
        while(opcao != 4){
            System.out.println("\n");
            System.out.println("1- Cadastrar Ninja ");
            System.out.println("2- Atualizar Habilidade Especial ");
            System.out.println("3- Exibir Ninjas ");
            System.out.println("4- Finalizar programa");
            System.out.println("Escolha opção: ");
            opcao = sc.nextInt();
//            sc.nextLine();
            switch (opcao){
                case 1:
                    for (int i = 0; i < ninjas.length; i++) {
                        sc.nextLine();
                        Uchiha ninja = new Uchiha();
                        System.out.println("Digite o nome do ninja : ");
                        ninja.nome = sc.next();
                        System.out.println("Digite a idade do ninja : ");
                        ninja.idade = sc.nextInt();
                        System.out.println("Digite a missao do ninja: ");
                        ninja.missao = sc.next();
                        sc.nextLine();
                        System.out.println("Digite a dificuldade da missao: ");
                        ninja.nivelDificuldade = sc.next();
                        System.out.println("Digite o status da missão: ");
                        ninja.statusMissao = sc.next();
                        sc.nextLine();
                        System.out.println("Digite o poder especial do ninja: ");
                        ninja.habilidadeEspecial = sc.next();
                        ninjas[i] = ninja;
                        ninja.mostrarInformacoes();
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    for(Uchiha ninja : ninjas){
                        if(ninja != null){
                            System.out.println("Digite a habilidade nova do ninja : ");
                            ninja.habilidadeEspecial = sc.next();
                            sc.nextLine();

                        }
                    }
                    break;
                case 3:
                    for (Uchiha u : ninjas){
                        if(u != null){
                            u.mostrarInformacoes();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
        }


        sc.close();


    }
}
