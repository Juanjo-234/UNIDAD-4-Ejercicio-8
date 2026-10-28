//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ServidorImpresion servidor = new ServidorImpresion();

    System.out.println("--- REGISTRO DE DISPOSITIVOS ---");
    Impresora laser = new ImpresoraLaser("HP LaserJet Pro", 100, 12);
    Impresora tinta = new ImpresoraTinta("Epson EcoTank", 8);
    Impresora matricial = new ImpresoraMatricial("IBM Proprinter", 100, 45);

    servidor.agregarImpresora(laser);
    servidor.agregarImpresora(tinta);
    servidor.agregarImpresora(matricial);

    servidor.enviarTrabajoATodos("Reporte_Fiscal_Anual.pdf");

    servidor.enviarTrabajoATodos("Factura_Electronica_#4092.pdf");
}
