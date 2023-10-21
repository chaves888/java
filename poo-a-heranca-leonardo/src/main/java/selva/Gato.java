package selva;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void dormir() {
        System.out.println("rrRRRR");
    }
}
