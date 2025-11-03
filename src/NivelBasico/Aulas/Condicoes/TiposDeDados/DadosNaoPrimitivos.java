package NivelBasico.Aulas.Condicoes.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
//    Tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java
        /*
        * Dados nao primitivos: Strings, Array, Class, enum
        * */

        String nome = "Naruto Uzumaki";

        String nomeEmCaixaAlta = nome.toUpperCase(); //ToUppercase vai colcoar tudo em CAPSLOCK
        System.out.println("Esse texto esta em CASPLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeida = "ALDEIA DA FOLHA";
        String aldeidaEmCaixaBaixa = aldeida.toLowerCase(); // ToLowerCase vai coloacar tudo em caixa baixa/minusculo
        System.out.println(aldeidaEmCaixaBaixa);
    }
}
