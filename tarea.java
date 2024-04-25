import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese la cilindrada del vehículo: ");
        int cilindrada = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el tipo de combustible del vehículo: ");
        String tipoCombustible = scanner.nextLine();

        System.out.print("Ingrese la capacidad en pasajeros del vehículo: ");
        int capacidadPasajeros = scanner.nextInt();

        // Mostrar los resultados
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        // Cerrar el scanner
        scanner.close();
    }
}
