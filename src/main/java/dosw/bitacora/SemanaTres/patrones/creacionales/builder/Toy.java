package dosw.bitacora.SemanaTres.patrones.creacionales.builder;

public class Toy {

    private String head;
    private String body;
    private String arms;
    private String legs;
    private String accessories;

    public void setHead(String head) {
        this.head = head;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        return "Muñeco construido con: \n" +
                "Cabeza: " + head + "\n" +
                "Cuerpo: " + body + "\n" +
                "Brazos: " + arms + "\n" +
                "Piernas: " + legs + "\n" +
                "Accesorios: " + accessories;
    }
}