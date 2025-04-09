package OSolid.Exemplo2;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        sistema.realizarPagamento(100.0, new Pix());
        sistema.realizarPagamento(200.0, new Boleto());
        sistema.realizarPagamento(300.0, new Cartao());
    }
}
