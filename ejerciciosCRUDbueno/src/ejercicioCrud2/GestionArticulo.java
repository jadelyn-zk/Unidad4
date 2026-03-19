package ejercicioCrud2;
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
    
    
	public void asignarPropiedades(Articulo articuloParaModificar) {
		
				System.out.println("Introduce el nombre del articulo a dar de alta: ");
				articuloParaModificar.nombre= sc.next();
				
				System.out.println("Introduce el codigo de tu articulo: ");
				articuloParaModificar.codigo=sc.next();
				
				System.out.println("Introduce el precio de compra del articulo: ");
				articuloParaModificar.precioCompra=sc.nextDouble();
				
				System.out.println("Introduce el precio de venta del articulo: ");
				articuloParaModificar.precioVenta=sc.nextDouble();
				
				System.out.println("Introduce el stock: ");
				articuloParaModificar.stock= sc.nextInt();		
			} //fin modificar
	
	public void modificarArticulo(Articulo articuloParaModificar) {
		for(Articulo articuloEnLista : listaArticulos) {
			if (articuloEnLista.equals(articuloParaModificar)) {
				asignarPropiedades(articuloParaModificar);
			}
		}
	}
	
	public void darDeAlta(Articulo articuloParaDarAlta) {
		asignarPropiedades(articuloParaDarAlta);
		listaArticulos.add(articuloParaDarAlta);

	}
	
	public void darDeBaja(ArrayList listaArticulos, String codigoBuscado) {
		System.out.println("Introduce el codigo del articulo a dar de baja");
		for (Articulo articulo : listaArticulos) {
	        if (articulo.getCodigo().equals(codigoBuscado)) {
	        	listaArticulos.remove(articulo);
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
