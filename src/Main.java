// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("¿Quieres agregar un libro?");
        Scanner scanner = new Scanner(System.in);
        ArrayList<libro> listaLibros = new ArrayList<>();

    if(scanner.nextLine().equalsIgnoreCase("si")){

        do {
            // Crear un nuevo libro
            libro nuevoLibro = new libro();

            // Preguntar por el nombre del libro
            System.out.println("¿Cuál es el nombre del libro?");
            nuevoLibro.setNombre(scanner.nextLine());

            // Preguntar por el autor del libro
            System.out.println("¿Cuál es el autor del libro?");
            nuevoLibro.setAutor(scanner.nextLine());

            // Agregar el nuevo libro a la lista
            listaLibros.add(nuevoLibro);

            // Preguntar si se quiere agregar otro libro
            System.out.println("¿Quieres agregar otro libro? (Escribe 'si' o 'no')");
        } while (scanner.nextLine().equalsIgnoreCase("si"));

        // Se hace una iteración para mostrar todos los libros
        System.out.println("Libros agregados:");
        for (libro libro : listaLibros) {
            System.out.println("Nombre: " + libro.getNombre() + ", Autor: " + libro.getAutor());
        }

        scanner.close();
    }else{
        System.out.println("Libros agregados:");
        for (libro libro : listaLibros) {
            System.out.println("Nombre: " + libro.getNombre() + ", Autor: " + libro.getAutor());
        }
    }

    }
}