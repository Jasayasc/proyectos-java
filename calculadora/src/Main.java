import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x,y,z;
        System.out.print("Digite un numero: ");
        x= leer.nextInt();
        System.out.print("Digite un numero: ");
        y=leer.nextInt();
        System.out.print("Operacion");
        System.out.println("                 ");
        System.out.println("Division.1");
        System.out.println("Suma.2");
        System.out.println("Resta.3");
        System.out.println("Multiplicacion4");
        z=leer.nextInt();
        
        switch(z){
            case 1:{
                Division operacion = new Division(x,y);
            System.out.println("El resultado es: " + operacion.operar());
            break;
            }

            case 2:{
                Suma operacion = new Suma(x,y);
                System.out.println("El resultado es: " + operacion.operar());
                break;
            }
            case 3:{
                Resta operacion = new Resta(x,y);
                System.out.println("El resultado es: " + operacion.operar());
                break;
            }
            case 4:{
                Multiplicacion operacion = new Multiplicacion(x,y);
                System.out.println("El resultado es: " + operacion.operar());
                break;
            }
        } 
    }
}