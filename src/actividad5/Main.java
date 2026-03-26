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
		Libro libro3 = new Libro("1984", "George Orwell", 35122, 15);
		Libro libro4 = new Libro("Cien años de soledad", "Gabriel García Márquez", 35132, 17);
		Libro libro5 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 35522, 32);
		Libro libro6 = new Libro("Harry Potter y la piedra filosofal", "J. K. Rowling", 30922, 56);
		
		// constructor copia
		Libro libro7 = new Libro(libro2);

		
		//Hagan algunos préstamos y devoluciones para ver si el stock cambia correctamente.
		libro2.prestamo();
		libro1.prestamo();
		libro3.devolucion();
		libro1.prestamo();
		libro2.devolucion();
		libro4.prestamo();
		libro5.prestamo();
		libro7.devolucion();
		libro6.prestamo();
		libro7.devolucion();


		//Cambien algún dato usando los setters
		libro2.setAutor("July");
		
		//Muestren por pantalla los datos de los 3 libros al final.
		System.out.println("Datos del libro 1: "+ libro1.mostrarDatos());
		System.out.println("Datos del libro 2: "+ libro2.mostrarDatos());
		System.out.println("Datos del libro 3: "+ libro3.mostrarDatos());
		System.out.println("Datos del libro 4: "+ libro4.mostrarDatos());
		System.out.println("Datos del libro 5: "+ libro5.mostrarDatos());
		System.out.println("Datos del libro 6: "+ libro6.mostrarDatos());
		
	}
}
