package dosw.bitacora.SemanaDos.patrones.estructurales.adapter;

public class Main {
    public static void main(String[] args) {
        Message message = new Message(
                "Espero que este semestre me vaya muy bien",
                "DANA VALERIA LEAL GUZMÁN",
                "2026-01-01"
        );

        Print simplePrinter = new PrinterSimp();
        simplePrinter.print(message);

        Print detailedPrinter =
                new AdapterPrinterDeta(new PrinterDeta());

        detailedPrinter.print(message);
    }
}
