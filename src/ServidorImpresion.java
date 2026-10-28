import java.util.ArrayList;
import java.util.List;

public class ServidorImpresion {
    private List<Impresora> dispositivos;

    public ServidorImpresion() {
        this.dispositivos = new ArrayList<>();
    }

    public void agregarImpresora(Impresora impresora) {
        dispositivos.add(impresora);
        System.out.println("Servidor: Impresora '" + impresora.getModelo() + "' registrada exitosamente.");
    }

    public void enviarTrabajoATodos(String documento) {
        System.out.println("\n========================================================");
        System.out.println(" ENVIANDO TRABAJO DE IMPRESIÓN MASIVO: \"" + documento + "\"");
        System.out.println("========================================================");

        for (Impresora impresora : dispositivos) {
            boolean exito = impresora.imprimirDocumento(documento);
            if (exito) {
                System.out.println(">> Estado Operativo: TRABAJO EXITOSO\n");
            } else {
                System.out.println(">> Estado Operativo: TRABAJO FALLIDO (Requiere mantenimiento)\n");
            }
        }
        System.out.println("========================================================\n");
    }
}
