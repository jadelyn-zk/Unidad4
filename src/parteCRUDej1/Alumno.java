package parteCRUDej1;

public class Alumno {

		String nombre;
		double notaMedia;

		public Alumno(String nombre, double notaMedia) {
			this.nombre = nombre;
			this.notaMedia = notaMedia;
		}
		
		
		public String getNombre() {
			return nombre;
		}

		public double getNotaMedia() {
			return notaMedia;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setNotaMedia(double notaMedia) {
			this.notaMedia = notaMedia;
		}

		@Override
		public String toString() {
			return "El alumno " + nombre + ", con la nota media=" + notaMedia;
		}

		public String compararNombre(Alumno alum2) {
			if(this.nombre.equals(alum2.nombre)) {
				return "Son el mismo alumno";
			}else return "Son diferentes alumnos";
		} 	
	}

}
