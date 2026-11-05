public class DemoException {
    public int somma(int a, int b) throws Exception {
        int somma = a + b;
        if (somma > 10) throw new Exception("La somma non può essere maggiore di 10");
        return somma;

    }
    public int prodotto(int a) throws Exception {
        return somma(a,a);

    }
}

