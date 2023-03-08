import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Vehiculo();
        Carro carro = new Vehiculo();
        Bicicleta bicicleta = new Vehiculo();

        Scanner leer = new Scanner(System.in);

        int op;
        while(true){
            System.out.println("\nParqueadero");
            System.out.println("\n1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Bicicleta");
            System.out.println("4. Salir");
            System.out.print("Digite una opcion: ");
            op = leer.nextInt();
            switch (op){
                case 1:
                    carro.parqueo(1500);
                    break;
                case 2:
                    moto.parqueo(1000);
                    break;
                case 3:
                    bicicleta.parqueo(700);
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Digite una opcion correcta...");
            }
        }

    }
}