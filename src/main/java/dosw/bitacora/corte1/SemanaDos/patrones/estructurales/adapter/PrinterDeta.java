package dosw.bitacora.SemanaDos.patrones.estructurales.adapter;

public class PrinterDeta {
    public void printDetailed(String text, String author, String date) {
        System.out.println("Mensaje: " + text);
        System.out.println("Autor: " + author);
        System.out.println("Fecha: " + date);
    }
}
