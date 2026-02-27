package dosw.bitacora.SemanaTres.patrones.creacionales.builder;

public class ActionFigureBuilder implements ToyBuilder {

    private Toy toy = new Toy();

    public void buildHead() {
        toy.setHead("Cabeza de héroe");
    }

    public void buildBody() {
        toy.setBody("Cuerpo musculoso");
    }

    public void buildArms() {
        toy.setArms("Brazos articulados");
    }

    public void buildLegs() {
        toy.setLegs("Piernas fuertes");
    }

    public void buildAccessories() {
        toy.setAccessories("Espada y escudo");
    }

    public Toy getResult() {
        return toy;
    }
}