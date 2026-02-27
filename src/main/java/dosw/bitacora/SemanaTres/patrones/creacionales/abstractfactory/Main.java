package dosw.bitacora.SemanaTres.patrones.creacionales.abstractfactory;

public class Main {

    public static void main(String[] args) {

        GameFactory factory = new XboxFactory();

        Control controller = factory.createController();
        Game game = factory.createGame();
        UserInterface ui = factory.createUI();

        controller.connect();
        game.start();
        ui.render();
    }
}
