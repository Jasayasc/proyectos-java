public class Multiplicacion extends Operaciones{
    public Multiplicacion(int numero1, int numero2) {
        super(numero1, numero2);
    }

    public int operar(){
       return this.numero1 * this.numero2;
    }
}
