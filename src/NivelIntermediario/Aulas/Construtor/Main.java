package NivelIntermediario.Aulas.Construtor;

public class Main {
    public static void main(String[] args) {
        Hokages hashirama = new Hokages();
        hashirama.nome = "Hashirama";

        Hokages tobirama = new Hokages("Tobirama Senju", 60, false);
        System.out.println(tobirama.nome);

//        Hokages Hiruzen = new Hokages(40);
//        System.out.println(Hiruzen.idade);

        Hokages minato = new Hokages("Minato Namikaze", 32, false);


    }
}
