package dosw.bitacora.SemanaTres.patrones.creacionales.abstractfactory;

public interface GameFactory {
    Control createController();
    Game createGame();
    UserInterface createUI();
}
