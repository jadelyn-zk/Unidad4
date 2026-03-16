package ejerciciosu4parte2;

public class mainLibro {

	public static void main(String[] args) {

		Libro libro1= new Libro("Carrie", "Megan Maxwell", 10, 0, "Narrativo");
		Libro libro3= new Libro("La Biblia", "el mensajero", 100, 31);
		Libro libro2= new Libro("IT", "Adam");

System.out.println(libro1.mostrarInformación());
libro1.prestamo();
System.out.println(libro1.mostrarInformación());

libro2.prestamo();

	}

}
