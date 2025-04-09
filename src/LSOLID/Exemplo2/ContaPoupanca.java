package LSOLID.Exemplo2;

public class ContaPoupanca implements Deposito {
    private double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
