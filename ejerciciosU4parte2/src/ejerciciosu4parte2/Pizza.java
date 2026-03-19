package ejerciciosu4parte2;

import java.util.Arrays;

public class Pizza {

	int codigo;
    String[] tamanos = new String[]{"Mediana", "Familiar"};
    String[] tipos = new String[]{"Maregarita", "CuatroQuesos", "Funghi"};
    String[] estados = new String[]{"Pedida", "Servida"};
    
    String tamanoUsuario;
    String tipoUsuario;
    String estadoUsuario;

    public Pizza(int codigo, String tamano, String tipo, String estado) {
		super();
		this.codigo = codigo;
		this.tamanoUsuario = tamano;
		this.tipoUsuario = tipo;
		this.estadoUsuario = estado;
	}

    public void compararCorrecto() {
    	int todoCorrecto = 0;
    	
    	for(int i=0 ; i<tamanos.length ; i++) {
       	 if(tamanos[i].equals(this.tamanoUsuario)) {
       		todoCorrecto++;
      		 break;
       	 }
    	}	
    	
    	for(int i=0 ; i<tipos.length ; i++) {
          	 if(tipos[i].equals(this.tipoUsuario)) {
          		todoCorrecto++;
         		 break;
          	 }
       	}	
    	for(int i=0 ; i<estados.length ; i++) {
          	 if(estados[i].equals(this.estadoUsuario)) {
          		todoCorrecto++;
         		 break;
          	 }
       	}	
    	
    	if(todoCorrecto==3) {
    		System.out.println(this.codigo + ": " + this.tamanoUsuario + " - " + this.tipoUsuario + " - " + this.estadoUsuario);
    	} else System.out.println("Algún parámetro no es válido (tamaño, tipo o estado)");
    	
    }
    
    
}


	