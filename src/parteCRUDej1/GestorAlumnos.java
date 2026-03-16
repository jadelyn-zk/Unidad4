package parteCRUDej1;

import java.util.ArrayList;

public class GestorAlumnos {
	
	private ArrayList<Alumno> alumnos;

	
	public GestorAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
		
		
	}

	public Alumno buscarAlumnoPorNombre(String nombre) {
		//aaa
	}
	
	public boolean modificarNota(String nombre, double nuevaNota) {
		Alumno alumno = buscarAlumnoPorNombre(nombre);
		boolean hayModificacion;
		if(alumno != null) {
			alumno.setNotaMedia(nuevaNota);
			hayModificacion=true;
			
		}
		return hayModificacion;
	}
	
}
