package actividad5;

public class Libro {
	String titulo;
	String autor;
	int isbn;
	int ejemplares;

	// costructor por defecto
	public Libro() {
	}

	// costructor con parametros
	public Libro(String titulo, String autor, int isbn, int ejemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.ejemplares = ejemplares;
	}

	// constructor copia
	public Libro(Libro p) {
		this.titulo = p.titulo;
		this.autor = p.autor;
		this.isbn = p.isbn;
		this.ejemplares = p.ejemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		titulo = titulo.toUpperCase();
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public boolean prestamo() {
		boolean prestamoSi = true;

		if (ejemplares <= 0) {
			System.out.println("No hay ejemplares disponibles");
			prestamoSi = false;

		} else {
			ejemplares-=1;
		}
		return prestamoSi;
	}

	public boolean devolucion() {
		boolean devolucionSi = true;
		ejemplares+=1;
		return devolucionSi;
	}

	public String mostrarDatos() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", ejemplares=" + ejemplares + "]";
	}

}
