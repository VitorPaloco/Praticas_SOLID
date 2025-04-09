package OSolid.Exemplo2;

public class Pix implements FormaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }
}
