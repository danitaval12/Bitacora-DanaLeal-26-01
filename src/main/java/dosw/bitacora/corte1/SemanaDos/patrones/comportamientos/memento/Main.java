package dosw.bitacora.SemanaDos.patrones.comportamientos.memento;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("La Primera versión");
        history.save(editor.save());

        editor.write("La Segunda versión");
        history.save(editor.save());

        editor.write("La Tercera versión");

        System.out.println("Actual: " + editor.getContent());

        editor.restore(history.get(0));

        System.out.println("Restaurado: " + editor.getContent());
    }
}

