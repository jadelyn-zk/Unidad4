package ejerciciosu4parte2;


public class Libro {

	String titulo;
	String autor;
	int disponibles;
	int prestados;
	String genero;
	
public Libro(String titulo, String autor) {
	this.titulo=titulo;
	this.autor=autor;

	}

public Libro(String titulo, String autor, int disponibles, int prestados) {
	this.titulo=titulo;
	this.autor=autor;
	this.disponibles=disponibles;
	this.prestados=prestados;
}

public Libro(String titulo, String autor, int disponibles, int prestados, String genero) {
	this.titulo=titulo;
	this.autor=autor;
	this.disponibles=disponibles;
	this.prestados=prestados;
	this.genero=genero;
}

public String getTitulo() {
	return titulo;
}

public String getAutor() {
	return autor;
}

public int getDisponibles() {
	return disponibles;
}

public int getPrestados() {
	return prestados;
}

public void getGenero() {
	if(genero!= "Narrativo" || genero!= "Lirico" || genero!= "Dramatico" || genero!= "Didactico" || genero!= "Poetico") {
		this.genero = genero;
	} else { System.out.println("Error, el genero del libro no es válido");
}
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public void setDisponibles(int disponibles) {
	this.disponibles = disponibles;
}

public void setPrestados(int prestados) {
	this.prestados = prestados;
}

public void setGenero(String genero) {
	if(genero!= "Narrativo" || genero!= "Lirico" || genero!= "Dramatico" || genero!= "Didactico" || genero!= "Poetico") {
		this.genero = genero;
	} else { System.out.println("Error, el genero del libro no es válido");
}
}

/**
 * La funcion de prestamo me suma 1 en prestamo y me quita uno de disponible
 */

public void prestamo() {
	if(disponibles>=1) {
		this.prestados+=1;
		this.disponibles-=1;
	}else {
		System.out.println("No hay libros disponibles para prestar");
	}
}

public void devolucion() {
	if(prestados>=1) {
		this.disponibles+=1;
		this.prestados-=1;
	}else {
		System.out.println("No hay libros disponibles para prestar");
	}
}

public String mostrarInformación() {
	return "Libro: " + this.titulo + " del autor " + this.autor + " es un libro de " + this.genero + ", tiene " + this.disponibles + " unidades disponibles para prestar y " + this.prestados + " unidades ya prestadas" ;
	
}
}