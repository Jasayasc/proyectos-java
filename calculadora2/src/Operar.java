public class Operar implements Suma, Resta, Multiplicacion, Division{
    @Override
    public int operacionSuma(int a, int b){
        return a+b;
    }

    @Override
    public int operacionResta(int a, int b){
        return a-b;
    }

    @Override
    public double operacionMultiplicacion(double a, double b){
        return a*b;
    }

    @Override
    public double operacionDivision(double a, double b){
        return a/b;
    }
}
