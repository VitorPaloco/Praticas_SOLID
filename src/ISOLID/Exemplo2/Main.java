package ISOLID.Exemplo2;

public class Main {
    public static void main(String[] args) {
        Dirigivel carro = new Carro();
        carro.dirigir();

        Aviao aviao = new Aviao();
        aviao.dirigir();
        aviao.voar();

        Navegador navio = new Navio();
        navio.navegar();
    }
}
