package dosw.bitacora.SemanaTres.patrones.creacionales.builder;

public class ClassicDollBuilder implements ToyBuilder {

    private Toy toy = new Toy();

    public void buildHead() {
        toy.setHead("Cabeza delicada");
    }

    public void buildBody() {
        toy.setBody("Cuerpo elegante");
    }

    public void buildArms() {
        toy.setArms("Brazos suaves");
    }

    public void buildLegs() {
        toy.setLegs("Piernas estilizadas");
    }

    public void buildAccessories() {
        toy.setAccessories("Bolso y sombrero");
    }

    public Toy getResult() {
        return toy;
    }
}