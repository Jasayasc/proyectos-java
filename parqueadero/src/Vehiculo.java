import java.util.Scanner;

public class Vehiculo implements Moto, Carro, Bicicleta{

    private String placa;
    int horas,total;
    @Override
    public void parqueo(int tasa){
        Scanner leer = new Scanner(System.in);

        System.out.print("Digite placa del vehiculo: ");
        this.placa = leer.nextLine();
        System.out.print("Digite cantidad de horas: ");
        this.horas = leer.nextInt();
        this.total = this.horas * tasa;

        System.out.println("\nEl pago total por las horas sera de: $"+this.total);
    }
}
