package ejerciciosu4parte2;

public class mainPizza {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza(89,"Mediana","Funghi","Pedida");
		Pizza pizza2 = new Pizza(4234,"Mediana","Ant","Pedida");
		Pizza pizza3 = new Pizza(421,"Mediana","Funghi","Servida");

		pizza1.compararCorrecto();
		pizza2.compararCorrecto();
		pizza3.compararCorrecto();

	}

}
