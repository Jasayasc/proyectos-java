import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x,y;
        System.out.print("Digite un numero: ");
        x= leer.nextInt();
        System.out.print("Digite un numero: ");
        y=leer.nextInt();

        Multiplicacion operacion = new Multiplicacion(x,y);
        System.out.println("El resultado es: " + operacion.operar());
    }
}