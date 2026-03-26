package actividad5;

public class Main {
	public static void main(String[] args) {
		// costructor por defecto
		Libro libro1 = new Libro();
		libro1.setTitulo("El Principito");
		libro1.setAutor("Antoine de Saint-Exupéry");
		libro1.setIsbn(39183);
		libro1.setEjemplares(32);

		// constructor con parametros
		Libro libro2 = new Libro("las mil y una noches", "Anonimo", 35122, 13);

		// constructor copia
		Libro libro3 = new Libro(libro2);

		//Hagan algunos préstamos y devoluciones para ver si el stock cambia correctamente.
		libro2.prestamo();
		libro1.prestamo();
		libro3.devolucion();
		libro1.prestamo();
		libro2.devolucion();

		//Cambien algún dato usando los setters
		libro2.setAutor("July");
		
		//Muestren por pantalla los datos de los 3 libros al final.
		System.out.println("Datos del libro 1: "+ libro1.mostrarDatos());
		System.out.println("Datos del libro 2: "+ libro2.mostrarDatos());
		System.out.println("Datos del libro 3: "+ libro3.mostrarDatos());
		
	}
}
