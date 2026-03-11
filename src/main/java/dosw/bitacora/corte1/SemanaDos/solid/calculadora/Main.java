package dosw.bitacora.SemanaDos.solid.calculadora;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Operation sum = new Sum();
        Operation division = new Division();

        System.out.println("Suma: " + calculator.calculate(sum, 12, 9));
        System.out.println("División: " + calculator.calculate(division, 22, 9));
    }
}
