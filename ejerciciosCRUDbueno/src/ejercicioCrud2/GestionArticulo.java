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
    	Articulo articuloSalida=null;
    	
    	for(Articulo articuloEnLista: listaArticulos) {
    		if(articuloEnLista.getCodigo().equals(codigo)) {
    			articuloSalida= articuloEnLista;
    		}
    	}
		return articuloSalida;
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
	
	
	public void modificarArticulo(String codigoBuscado) {
		for(Articulo articuloEnLista : listaArticulos) {
			if (codigoBuscado.equals(articuloEnLista.getCodigo())) {
				asignarPropiedades(articuloEnLista);
			}
		}
	}
	
	public void darDeAlta(Articulo articuloParaDarAlta) {
		asignarPropiedades(articuloParaDarAlta);
		listaArticulos.add(articuloParaDarAlta);

	}
	
	//metodo que recorre el for al reves, por que al eliminar un elemento del array los incices se desplazan, asi lo evitamos
	public void darDeBaja(ArrayList<Articulo> listaArticulos, String codigoBuscado) {
	    System.out.println("Introduce el codigo del articulo a dar de baja");
	    for (int i = listaArticulos.size() - 1; i >= 0; i--) {
	        if (listaArticulos.get(i).getCodigo().equals(codigoBuscado)) {
	            listaArticulos.remove(i);
	        }
	    }
	}
	
	public void entradaMercancia() {
		
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
