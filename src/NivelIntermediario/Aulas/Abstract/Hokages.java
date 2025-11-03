package NivelIntermediario.Aulas.Abstract;

public abstract class Hokages {
    // 1. Classes Abstratas não podem ser instanciadas (ela se torna uma superclass)
    // 2. Metódos abstratos não podem conter body (corpo)
    String name;
    int age;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public Hokages() {
    }

    public Hokages(String name) {
        this.name = name;
    }
    public Hokages(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Hokages(String name, int age, boolean vivoOuNao, String aldeia) {
        this.name = name;
        this.age = age;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
    }

    public abstract void sabedoriaHokage();
}
