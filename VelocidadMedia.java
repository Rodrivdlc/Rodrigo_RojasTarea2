import java.util.Scanner;


public class VelocidadMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la distancia recorrida (km):");
        double distanciaRecorrida = scanner.nextDouble();

        System.out.println("Introduzca el tiempo del recorrido (min):");
        double tiempoRecorrido = scanner.nextDouble();

        // Convertir el tiempo de minutos a horas
        double tiempoRecorridoHoras = tiempoRecorrido / 60.0;

        // Calcular la velocidad media en km/h
        double velocidadMedia = distanciaRecorrida / tiempoRecorridoHoras;

        System.out.println("Se ha desplazado a una velocidad de " + velocidadMedia + " km/h.");

        scanner.close();
    }
}
