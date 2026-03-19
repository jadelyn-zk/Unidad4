package parteCRUDej1;

public class Alumno {

		String nombre;
		double nota;

		public Alumno(String nombre, double nota) {
			this.nombre = nombre;
			this.nota = nota;
		}
		
		
		public String getNombre() {
			return nombre;
		}

		public double getNotaMedia() {
			return nota;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setNota(double nota) {
			this.nota = nota;
		}

		@Override
		public String toString() {
			return "El alumno " + nombre + ", con la nota media=" + nota;
		}
 	
	}//fin alumno
