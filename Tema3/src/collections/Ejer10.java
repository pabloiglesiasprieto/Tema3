package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		/*
		 * Realiza una aplicación donde se registren nombres de productos y su precio.
		 * Lleva a cabo el siguiente menú:
		 * 
		 * PRODUCTOS
		 * 
		 * 1. Alta de producto
		 * 
		 * 2. Baja de producto
		 * 
		 * 3. Listar existencias
		 * 
		 * 0. Salir
		 * 
		 * El orden en el que se almacenan los productos no importa.
		 */
		// Mapa para almacenar productos y sus precios
		Map<String, Double> productos = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// Mostrar el menú de opciones
			System.out.println("PRODUCTOS");
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("4. Listar existencias");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");

			int opcion = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer del scanner

			switch (opcion) {
			case 1:
				// Alta de producto
				System.out.print("Introduce el nombre del producto: ");
				String nombreProducto = scanner.nextLine();

				System.out.print("Introduce el precio del producto: ");
				double precioProducto = scanner.nextDouble();
				scanner.nextLine(); // Limpiar el buffer

				// Registrar el producto en el mapa
				productos.put(nombreProducto, precioProducto);
				System.out.println("Producto " + nombreProducto + " añadido con éxito.");
				break;

			case 2:
				// Baja de producto
				System.out.print("Introduce el nombre del producto a eliminar: ");
				String productoEliminar = scanner.nextLine();

				if (productos.containsKey(productoEliminar)) {
					productos.remove(productoEliminar);
					System.out.println("Producto " + productoEliminar + " eliminado con éxito.");
				} else {
					System.out.println("El producto no existe.");
				}
				break;

			case 4:
				// Listar existencias
				if (productos.isEmpty()) {
					System.out.println("No hay productos registrados.");
				} else {
					System.out.println("Listado de productos:");
					for (Map.Entry<String, Double> entry : productos.entrySet()) {
						System.out.println("Producto: " + entry.getKey() + " | Precio: " + entry.getValue());
					}
				}
				break;

			case 0:
				// Salir del programa
				System.out.println("Saliendo del programa...");
				scanner.close();
				return;

			default:
				System.out.println("Opción no válida. Por favor, elige una opción correcta.");
			}
		}
	}

}
