package NivelBasico.Aulas.Loops;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        *  Laços de Repetição: Vão repetir infinitamente ou até você atingir o parâmetro desejado
        * WHILE - FOR
        * */

        //While
        // while (condicao) { Tudo aqui vai acontecer }

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 10;

     /*   while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O naruto fez um clone das sombras " + numeroDeClones);
        }*/

        //FOR
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O naruto fez um clone da sombras " + i);

        }


    }
}
