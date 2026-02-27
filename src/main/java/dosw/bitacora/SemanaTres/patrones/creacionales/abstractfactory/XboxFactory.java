package dosw.bitacora.SemanaTres.patrones.creacionales.abstractfactory;

public class XboxFactory implements GameFactory {

    public Control createController() {
        return new XboxControl();
    }

    public Game createGame() {
        return new XboxGame();
    }

    public UserInterface createUI() {
        return new XboxUI();
    }
}
