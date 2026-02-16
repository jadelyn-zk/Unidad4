package ejerciciosu4parte2;

public class mainCuentaCorriente {

	public static void main(String[] args) {

		cuentaCorriente cuenta1 = new cuentaCorriente("12345678A", 1000.50);
		cuentaCorriente cuenta2 = new cuentaCorriente("87654321B", "Ana García", 2500.75);
        cuentaCorriente cuenta3 = new cuentaCorriente("45678912C", "Carlos López", 5000.00, "Española");
	
	
   System.out.println(cuenta2.mostrarInformación());
   cuenta2.ingresarDinero(30);
   System.out.println(cuenta2.mostrarInformación());
   cuenta2.sacarDinero(5000);
   System.out.println(cuenta2.mostrarInformación());

        
        
	
	
	
	}

	
	
	
}
 