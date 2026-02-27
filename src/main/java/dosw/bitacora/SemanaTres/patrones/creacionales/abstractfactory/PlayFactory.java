package dosw.bitacora.SemanaTres.patrones.creacionales.abstractfactory;

public class PlayFactory implements GameFactory {

    public Control createController() {
        return new PlayControl();
    }

    public Game createGame() {
        return new PlayGame();
    }

    public UserInterface createUI() {
        return new PlayUI();
    }
}
