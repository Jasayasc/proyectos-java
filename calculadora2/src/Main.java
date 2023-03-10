import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Suma suma = new Operar();
        Resta resta = new Operar();
        Multiplicacion multiplicacion = new Operar();
        Division division = new Operar();

        Scanner leer = new Scanner(System.in);
        int x, y, z;
        while (true) {
            System.out.print("Digite un numero: ");
            x = leer.nextInt();
            System.out.print("Digite un numero: ");
            y = leer.nextInt();
            System.out.print("Operacion");
            System.out.println("                 ");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5. Salir");
            System.out.print("Digite una opcion: ");
            z = leer.nextInt();
            //if(Type.)

            switch (z) {
                case 1: {

                    System.out.println("El resultado es: " + suma.operacionSuma(x,y));
                    break;
                }

                case 2: {
                    System.out.println("El resultado es: " + resta.operacionResta(x,y));
                    break;
                }
                case 3: {
                    System.out.println("El resultado es: " + multiplicacion.operacionMultiplicacion(x,y));
                    break;
                }
                case 4: {
                    System.out.println("El resultado es: " + division.operacionDivision(x,y));
                    break;
                }
                case 5: {
                    System.exit(1);
                    break;
                }
                default:
                    System.out.println("Digite opcion valida.");
            }
        }
    }
}