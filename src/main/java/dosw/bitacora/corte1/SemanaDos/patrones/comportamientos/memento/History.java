package dosw.bitacora.SemanaDos.patrones.comportamientos.memento;
import java.util.ArrayList;
import java.util.List;

public class History {
    private List<TextEditor.Memento> savedStates = new ArrayList<>();

    public void save(TextEditor.Memento memento) {
        savedStates.add(memento);
    }

    public TextEditor.Memento get(int index) {
        return savedStates.get(index);
    }
}

