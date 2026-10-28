public class ImpresoraMatricial extends  Impresora{
    private int vidaUtilCinta;

    public ImpresoraMatricial(String modelo, int nivelTinta, int vidaUtilCinta) {
        super(modelo, nivelTinta);
        this.vidaUtilCinta = vidaUtilCinta;
    }

    @Override
    public boolean imprimirDocumento(String documento) {
        System.out.println("[MATRICIAL - " + modelo + "] Verificando cabezal de agujas y cinta entintada (" + vidaUtilCinta + "%)...");
        if (vidaUtilCinta >= 3) {
            vidaUtilCinta -= 3;
            System.out.println("-> Impresión de matriz de puntos por impacto completada: \"" + documento + "\" | Cinta restante: " + vidaUtilCinta + "%");
            return true;
        } else {
            System.out.println("-> ERROR: Cinta agotada (" + vidaUtilCinta + "%). Es necesario cambiar el cartucho de cinta.");
            return false;
        }
    }
}
