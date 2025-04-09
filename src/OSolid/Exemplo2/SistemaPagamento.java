package OSolid.Exemplo2;

public class SistemaPagamento {
    public void realizarPagamento(double valor, FormaPagamento metodo) {
        metodo.pagar(valor);
    }
}
