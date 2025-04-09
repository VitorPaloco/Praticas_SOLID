package SSolid.Exemplo2;

import java.util.Scanner;

public class ProcessarEncomenda {
    private final CalcularFrete calcularFrete = new CalcularFrete();
    private final SalvarArquivo salvarArquivo = new SalvarArquivo();

    public void executar() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o ID da encomenda: ");
            String idEncomenda = sc.nextLine();

            System.out.println("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            double valorFrete = calcularFrete.executar(peso);
            System.out.println("Valor do frete calculado: " + valorFrete);

            salvarArquivo.executar(idEncomenda, valorFrete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
