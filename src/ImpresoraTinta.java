public class ImpresoraTinta extends Impresora{

    int nivelTinta;
    public ImpresoraTinta(String modelo, int nivelTinta) {
        super(modelo, nivelTinta);
    }

    @Override
    public boolean imprimirDocumento(String documento) {
        System.out.println("[INYECCIÓN DE TINTA - " + modelo + "] Comprobando inyectores y nivel de tinta (" + nivelTinta + "%)...");
        if (nivelTinta >= 10) {
            nivelTinta -= 10;
            System.out.println("-> Impresión fotográfica/documento a tinta finalizada: \"" + documento + "\" | Tinta restante: " + nivelTinta + "%");
            return true;
        } else {
            System.out.println("-> ERROR: Tinta agotada o insuficiente (" + nivelTinta + "%). Recargue los tanques.");
            return false;
        }
    }
}
