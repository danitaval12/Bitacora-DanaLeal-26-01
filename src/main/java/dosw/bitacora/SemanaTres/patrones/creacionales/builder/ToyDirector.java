package dosw.bitacora.SemanaTres.patrones.creacionales.builder;

public class ToyDirector {
    public void construct(ToyBuilder builder) {
        builder.buildHead();
        builder.buildBody();
        builder.buildArms();
        builder.buildLegs();
        builder.buildAccessories();
    }
}