package selva;

public class ProgramaSelva {
    public static void main(String[] args) {
        Animal toto = new Cachorro();
        Animal tom = new Gato();
        Animal jerry = new Rato();

        toto.emitirSom();
        toto.dormir();

        tom.emitirSom();
        tom.dormir();

        jerry.emitirSom();
        jerry.dormir();
    }
}
