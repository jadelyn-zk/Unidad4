package ejerciciosu4parte2;

public class cuentaCorriente {
	private String dni;
    private String nombre;
    private double saldo;
    private String nacionalidad;
    
    // Con DNI y saldo inicial
    public cuentaCorriente(String dni, double saldoInicial) {
        this.dni = dni;
        this.saldo = saldoInicial;
    }
    
	// Con DNI, nombre y saldo inicial
    public cuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    // Con DNI, nombre, saldo inicial y nacionalidad
    public cuentaCorriente(String dni, String nombre, double saldo, String nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        this.nacionalidad = nacionalidad;
    } 
    
    public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNacionalidad(String nacionalidad) {
		if (nacionalidad.equals("Española") || nacionalidad.equals("Extranjera")) {
			this.nacionalidad = nacionalidad;
		} else {
			System.out.println("Error. La nacionalidad debe ser Española o Extrangera");
		} 
	}
    
    //operaciones del banco para hacer
    
    public boolean sacarDinero(double cantidad) {
    	if (cantidad> 0 && cantidad<=saldo) {
    		saldo-=cantidad;
    		return true;
    	}else {
    		System.out.println("No hay saldo suficiente");
    		return false;
    	}
    }
    
    public boolean ingresarDinero(double cantidad) {
    	if (cantidad>0) {
    		saldo+=cantidad;
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public String mostrarInformación() {
    	return "Cuenta de " + nombre + " con DNI: " + dni + " y nacionalidad " + nacionalidad + " con un saldo de " + saldo; 
    	
    }
    
    
    
    
    
    
}
