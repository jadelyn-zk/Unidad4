package ejerciciosu4parte2;

public class mainAlumno {

	public static void main(String[] args) {

		Alumno alum1 = new Alumno("Pablito", 7.1);
		Alumno alum2= new Alumno("Hermenegilda", 4.9);
		Alumno alum3= new Alumno("Hermenegilda", 4.9);

		System.out.println(alum1.toString());
		System.out.println(alum2.toString());

		System.out.println(alum1.compararNombre(alum3));
		
	}

}
