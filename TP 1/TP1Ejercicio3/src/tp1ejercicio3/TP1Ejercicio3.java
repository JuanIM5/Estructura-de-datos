package tp1ejercicio3;
import java.util.Scanner;

public class TP1Ejercicio3 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Ingrese la cantidad de productos: ");
        int n = scanner.nextInt();
        
        // vectores
        int[] cantidades = new int[n];
        double[] costos = new double[n];
        double precioTotal = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nProducto " + (i + 1) + ":");
            System.out.print("Cantidad: ");
            cantidades[i] = scanner.nextInt();

            System.out.print("Costo unitario ($): ");
            costos[i] = scanner.nextDouble();
        }
        
        System.out.println("\nProductos con precio total mayor a $1000:");

        for (int i = 0; i < n; i++) {
            double precioTotalProducto = cantidades[i] * costos[i];
            precioTotal += precioTotalProducto;

            if (precioTotalProducto > 1000) {
                System.out.println("Producto " + (i + 1) + ": $" + precioTotalProducto);
            }
        }
        
        System.out.println("\nPrecio total de todos los productos: $" + precioTotal);

        scanner.close();
    }
    
}
