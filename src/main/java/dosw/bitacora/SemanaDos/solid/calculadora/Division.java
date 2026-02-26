package dosw.bitacora.SemanaDos.solid.calculadora;

public class Division implements Operation{
    @Override
    public double execute(double a, double b) {

        if(b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }

        return a / b;
    }
}
