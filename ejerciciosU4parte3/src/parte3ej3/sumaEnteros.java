package parte3ej3;

public class sumaEnteros {

	int numero;
	int num1;
	int num2;

	public int sumaHastaNum(int numero) {
	    int sumaHasta = 0;
	    for(int i = 1; i <= numero; i++) {
	        sumaHasta += i;  
	    }
	    return sumaHasta;
	}
	
	public int sumaEntreNum(int num1, int num2){
		int sumaEntre = 0;
		for (int i=num1; i<=num2; i++) {
			sumaEntre += i;
		}
		return sumaEntre;
	}
	
}
