import java.util.Scanner;

public class SS25031 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Sistema de Ventas");
            System.out.println("1. Registrar una venta");
            System.out.println("2. Mostrar total de ventas");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    scanner.nextLine(); // Consumir el salto de línea
                    String producto = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad vendida: ");
                    int cantidad = scanner.nextInt();
                    double totalVenta = registrarVenta(precio, cantidad);
                    System.out.println("Venta registrada: " + producto + " - Total: $" + totalVenta);
                    break;
                case 2:
                    System.out.println("El total de ventas acumuladas es: $" + obtenerTotalVentas());
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del sistema. ¡Gracias por usar el sistema de ventas!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static double totalVentas = 0;

    public static double registrarVenta(double precio, int cantidad) {
        double total = precio * cantidad;
        totalVentas += total;
        return total;
    }

    public static double obtenerTotalVentas() {
        return totalVentas;
    }
}
