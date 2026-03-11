package dosw.bitacora.SemanaDos.patrones.estructurales.adapter;

public class AdapterPrinterDeta implements Print{
    private PrinterDeta printerDeta;

    public AdapterPrinterDeta(PrinterDeta detailedPrinter) {
        this.printerDeta = detailedPrinter;
    }

    @Override
    public void print(Message message) {
        printerDeta.printDetailed(
                message.getText(),
                message.getAuthor(),
                message.getDate()
        );
    }
}
