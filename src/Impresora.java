public abstract class Impresora {
    protected String modelo;
    protected int nivelTinta;
    public Impresora(String modelo, int nivelTinta) {
        this.modelo = modelo;
        this.nivelTinta = nivelTinta;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNivelTinta() {
        return nivelTinta;
    }

    public abstract boolean imprimirDocumento(String documento);
}
