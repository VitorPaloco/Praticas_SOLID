package ISOLID.Exemplo2;

public class Aviao implements Dirigivel, Aereo {
    @Override
    public void dirigir() {
        System.out.println("Avião está dirigindo na estrada...");
    }

    public void voar() {
        System.out.println("Avião está voando...");
    }
}
