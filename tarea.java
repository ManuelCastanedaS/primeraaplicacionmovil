import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese la marca del vehículo: "); //muestra por pantalla solicitud
        String marca = scanner.nextLine(); // recibe el dato del usuario y lo guarda en una variable

        System.out.print("Ingrese el modelo del vehículo: "); //muestra por pantalla solicitud
        String modelo = scanner.nextLine(); // recibe el dato del usuario y lo guarda en una variable

        System.out.print("Ingrese la cilindrada del vehículo: "); //muestra por pantalla solicitud
        int cilindrada = scanner.nextInt(); // recibe el dato del usuario y lo guarda en una variable
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el tipo de combustible del vehículo: "); //muestra por pantalla solicitud
        String tipoCombustible = scanner.nextLine(); // recibe el dato del usuario y lo guarda en una variable

        System.out.print("Ingrese la capacidad en pasajeros del vehículo: "); //muestra por pantalla solicitud
        int capacidadPasajeros = scanner.nextInt(); // recibe el dato del usuario y lo guarda en una variable

        // Mostrar los resultados guardados anteriormente en cada variable
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        // Cerrar el scanner
        scanner.close();
    }
}
