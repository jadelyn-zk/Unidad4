package ejercicioCrud2;

public class Articulo {
	
	String nombre;
	String codigo;
	double precioCompra;
	double precioVenta;
	int stock;
	
	public Articulo(String nombre, String codigo, double precioCompra, double precioVenta, int stock) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	/**
	 * Incrementa el stock del articulo en una cantidad
	 * @param cantidad para aumentar el stock
	 * 
	 */
	public void entradaMercancia(int cantidad) {
		this.stock+=cantidad;
	}
	
	public boolean salidaMercancia(int cantidad) {
		boolean puedeSalir=true;
		if (cantidad>stock) {
			puedeSalir=false;
		}
		stock-=cantidad;
		return puedeSalir;
	}
}
