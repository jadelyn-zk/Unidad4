package parteCRUDej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestorAlumnos {
	// creo una lista de alumnos
	private ArrayList<Alumno> listaAlumnos;
	// creo el scanner
	private Scanner scanner;

	// Constructor
	public GestorAlumnos() {
		this.listaAlumnos = new ArrayList<>();
		this.scanner = new Scanner(System.in);
	}

	// Método para listar todos los alumnos
	public void listarAlumnos() {
		if (listaAlumnos.isEmpty()) {
			System.out.println("No hay alumnos en la lista.");
		} else {
			System.out.println("=== LISTADO DE ALUMNOS ===");
			for (int indice = 1; indice < listaAlumnos.size(); indice++) {
				System.out.println((indice) + ". " + listaAlumnos.get(indice));
			}
		}
	}

	// Método para añadir un nuevo alumno
	public boolean nuevoAlumno(String nombre, double nota) {
		boolean alumnoAñadido= false;
		
		System.out.println("=== NUEVO ALUMNO ===");
		System.out.print("Introduce el nombre del alumno: ");
		nombre = scanner.nextLine();

		System.out.print("Introduce la nota del alumno: ");
		nota = scanner.nextDouble();

		Alumno nuevoAlumno = new Alumno(nombre, nota);
		listaAlumnos.add(nuevoAlumno);
		System.out.println("Alumno añadido correctamente");
		alumnoAñadido=true;
		
		return alumnoAñadido;
	}

	// Método para modificar la nota de un alumno
	public boolean modificarAlumno(String nombreBuscado, double nuevaNota){
		
		//creamos un boolean temporal para dar el return
		boolean encontrado = false;
		
		System.out.println("=== MODIFICAR ALUMNO ===");
		System.out.print("Introduce el nombre del alumno a modificar: ");
		nombreBuscado = scanner.nextLine();

		//bucle para buscar el nombre en cada entrada de la lista alumno
		for (Alumno alumno : listaAlumnos) {
			if (alumno.getNombre().equalsIgnoreCase(nombreBuscado)) {
				System.out.print("Introduce la nueva nota para " + alumno.getNombre() + ": ");
				nuevaNota = scanner.nextDouble();
//				scanner.nextLine(); // Limpiar el buffer

				alumno.setNota(nuevaNota);
				System.out.println("Nota modificada correctamente.");
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("No se encontró ningún alumno con ese nombre.");
		}
		return encontrado;
	}

	// Método para borrar un alumnoaaa
	public boolean borrarAlumno(String nombreBuscado) {
	    boolean encontrado = false;
	    Alumno alumno;
	    
	    System.out.println("=== BORRAR ALUMNO ===");
	    System.out.print("Introduce el nombre del alumno a borrar: ");
	    nombreBuscado = scanner.nextLine();
	    
	    // Recorremos la lista
	    for (int indice = 0; indice < listaAlumnos.size(); indice++) {
	    // el alumno en ese indice es el que vamos a ir compararando para eliminar al alumno q queremos
	        alumno = listaAlumnos.get(indice);
	        if (alumno.getNombre().equalsIgnoreCase(nombreBuscado)) {
	            listaAlumnos.remove(indice);
	            System.out.println("Alumno borrado correctamente.");
	            encontrado = true;
	            break;
	        }
	    }
	    
	    if (!encontrado) {
	        System.out.println("No se encontró ningún alumno con ese nombre.");
	    }
		return encontrado;
	}
	
	// Método para cerrar el scanner
	public void cerrarScanner() {
		scanner.close();
	}
}