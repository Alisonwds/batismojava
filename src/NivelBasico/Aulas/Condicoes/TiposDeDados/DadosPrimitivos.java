package NivelBasico.Aulas.Condicoes.TiposDeDados;

public class DadosPrimitivos {

    public static void main(String[] args) {
        /*
        * Dados primitivos - int, double, float, char, char, boolean, short.
        * Objetivo da aula: Criar um ninja - Naruto -
        * */

        int idade = 16; // Valor maximo: 2 147 483 647
        double altura = 1.77;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        long saldoBancario = 999999L; // Valor maximo: 9 223 372 036 854

        System.out.println(idade); //Comando para mostrar o usuario
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("Saldo Bancario é = " + saldoBancario);
        System.out.println("Minha idade é: " + idade);
    }
}
