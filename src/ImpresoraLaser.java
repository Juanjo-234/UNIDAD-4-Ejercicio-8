public class ImpresoraLaser extends  Impresora{
    private double nivelToner;

    public ImpresoraLaser(String modelo, int nivelTinta, double nivelToner){
        super(modelo, nivelTinta);
        this.nivelToner = nivelToner;
    }

    @Override
    public boolean imprimirDocumento(String documento) {
        System.out.println("[LÁSER - " + modelo + "] Verificando temperatura del fusor y nivel de tóner (" + nivelToner + "%)...");
        if (nivelToner >= 5) {
            nivelToner -= 5;
            System.out.println("-> Impresión láser completada con alta velocidad: \"" + documento + "\" | Tóner restante: " + nivelToner + "%");
            return true;
        } else {
            System.out.println("-> ERROR: Nivel de tóner insuficiente (" + nivelToner + "%). Reemplace el cartucho de tóner.");
            return false;
        }
    }
}
