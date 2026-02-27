package dosw.bitacora.SemanaTres.patrones.creacionales.builder;

public class Main {

    public static void main(String[] args) {
        ToyDirector director = new ToyDirector();

        ToyBuilder actionBuilder = new ActionFigureBuilder();
        director.construct(actionBuilder);
        Toy actionFigure = actionBuilder.getResult();
        System.out.println(actionFigure);

        ToyBuilder classicBuilder = new ClassicDollBuilder();
        director.construct(classicBuilder);
        Toy classicDoll = classicBuilder.getResult();
        System.out.println(classicDoll);
    }
}