package parteCRUDej2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GestionArticulo {
    
    private ArrayList<Articulo> listaArticulos; 
    private Scanner sc;

    public GestionArticulo() {
        listaArticulos = new ArrayList<>();
    }
    
    public ArrayList<Articulo> getArticulos() {
        return listaArticulos;
    }
    
    public Articulo buscarPorCodigo (String codigo) {
    	Articulo articuloDeSalida=null;
    	
    	for(Articulo articuloEnLista: listaArticulos) {
    		if(articuloEnLista.getCodigo().equals(codigo)) {
    			return articuloEnLista;
    		}
    	}
    }
    
    
    
    
	public void modificarArticulo(Articulo articuloParaDarAlta) {
		
		for(Articulo articuloEnLista : listaArticulos) {
			if (articuloEnLista.equals(articuloParaDarAlta)) {
				
			}
		}
		System.out.println("Introduce el nombre del articulo a dar de alta: ");
		articuloParaDarAlta.nombre= sc.next();
		
		System.out.println("Introduce el codigo de tu articulo: ");
		articuloParaDarAlta.codigo=sc.next();
		
		System.out.println("Introduce el precio de compra del articulo: ");
		articuloParaDarAlta.precioCompra=sc.nextDouble();
		
		System.out.println("Introduce el precio de venta del articulo: ");
		articuloParaDarAlta.precioVenta=sc.nextDouble();
		
		System.out.println("Introduce el stock: ");
		articuloParaDarAlta.stock= sc.nextInt();
		
	}//fin modificar
	
	public void darDeAlta(Articulo articuloParaDarBaja) {
		listaArticulos.add(articuloParaDarAlta);

	}
	
	public void darDeBaja(ArrayList listaArticulos, String codigoBuscado) {
		System.out.println("Introduce el codigo del articulo a dar de baja");
		for (Articulo articulo : listaArticulos) {
	        if (articulo.getCodigo().equals(codigoBuscado)) {
	        	listaArticulos.remove(articuloParaDarBaja);
	        }
	}
	}
	
	/*
	 * 	Alta
	 * 
		Baja
		Modificación
		Entrada de mercancía
		Salida de mercancía
		Salida
	 */
	
}
