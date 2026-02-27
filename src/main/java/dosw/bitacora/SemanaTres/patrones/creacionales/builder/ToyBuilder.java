package dosw.bitacora.SemanaTres.patrones.creacionales.builder;

public interface ToyBuilder {

    void buildHead();
    void buildBody();
    void buildArms();
    void buildLegs();
    void buildAccessories();

    Toy getResult();
}