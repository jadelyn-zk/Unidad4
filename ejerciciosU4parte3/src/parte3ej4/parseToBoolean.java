package parte3ej4;

public class parseToBoolean {

	int argumento;
	String cadena;
	
	public boolean ceroUno(int argumento) {
		if(argumento==1) {
			return true;
		} else if (argumento==0) {
			return false;
		}else {
			System.out.println("ERROR. El numero instroducido no es ni 0 ni 1");
			return false;
		}		
	}
	
	public boolean truefalse(String cadena) {
	if(cadena.equals("true")) {
		return true;
	} else if (cadena.equals("false")) {
		return false;
	}else {
		System.out.println("ERROR, la cadena introducida no es ni true ni false");
		return false;
	}
	
	
	
	
	}
	
	
	
}
