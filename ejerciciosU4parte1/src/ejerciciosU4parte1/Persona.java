package ejerciciosU4parte1;

public class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	 
 public Persona(String dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
 
 public String getDni() {
	return dni;
}
 public void setDni(String dni) {
	this.dni = dni;
 }
 public String getNombre() {
	return nombre;
 }
 public void setNombre(String nombre) {
	this.nombre = nombre;
 }
 public String getApellidos() {
	return apellidos;
 }
 public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
 }
 public int getEdad() {
	return edad;
 }
 public void setEdad(int edad) {
	this.edad = edad;
 }
 
 public boolean esMayorEdad() {
	    return edad >= 18;  
	}

	public boolean esJubilado() {
	    return edad >= 65;
	}

	public int diferenciaEdad(Persona p) {
	    return Math.abs(this.edad - p.getEdad());
	}
 
	 public String toString() {  
		    return nombre + " " + apellidos + " con DNI " + dni + " " + 
		           (edad >= 18 ? "es" : "no es") + " mayor de edad";
		}
}
 



