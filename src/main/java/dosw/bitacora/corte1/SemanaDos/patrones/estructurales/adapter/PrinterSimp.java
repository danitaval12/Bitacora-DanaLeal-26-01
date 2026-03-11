package dosw.bitacora.SemanaDos.patrones.estructurales.adapter;

public class PrinterSimp implements Print {
    @Override
    public void print(Message message) {
        System.out.println(message.getText());
    }
}
