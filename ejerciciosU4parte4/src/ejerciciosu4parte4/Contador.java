package ejerciciosu4parte4;

public class Contador {

	int cont;
	
public Contador (int cont) {
		this.cont = cont;
	}

public int getCont() {
	return cont;
}

public void setCont(int cont) {
	if (this.cont<0) {
		throw new IllegalArgumentException("El contador no puede ser negativo");
	}
	this.cont = cont;
}

public void incrementarCont() {
cont++;
}

public void disminuirCont () {
	cont--;
	if (cont<0) {
		cont = 0;
	}
}
}