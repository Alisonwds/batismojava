package NivelBasico.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        //Contadores
        int aux = 0;
        int opcaoDoUsuario = 0;

        while (opcaoDoUsuario != 3) {
            System.out.println("-------------------");
            System.out.println("1 - Cadastrar Ninjas");
            System.out.println("2 - Lista de Ninjas Cadastrados");
            System.out.println("3 - Fechar Sistema");
            System.out.println("Digite o numero: ");
            opcaoDoUsuario = entrada.nextInt();
            entrada.nextLine();
            switch (opcaoDoUsuario) {
                case 1:
                    if(aux < NUMERO_MAX) {
                        System.out.println("Digite o nome do Ninja: ");
                        String nomeDoNinja = entrada.next();
                        ninjas[aux] = nomeDoNinja;
                        aux++;
                        System.out.println("Ninja Cadastrado com sucesso!");
                    } else {
                        System.out.println("A lista de ninjas cheia, não é possível cadastrar!");
                    }
                    break;
                case 2:
                    if(aux == 0){
                        System.out.println("Nenhum ninja cadastrado");
                    }else{
                        System.out.println("\n---- LISTA DE NINJAS ----");
                        for (int i= 0; i < ninjas.length; i++) {
                            System.out.println(i + " - " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Programa encerrando...");
                    break;
                default:
                    System.out.println("Essa opção não é válido!!");
                    break;
            }
        }

        entrada.close();
    }
}
