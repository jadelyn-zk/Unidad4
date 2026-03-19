package ejerciciosu4parte4;

public class Fraccion {
    
    private int numerador;
    private int denominador;
    
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    // get y set
    public int getNumerador() {
        return numerador;
    }
    
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    
    public int getDenominador() {
        return denominador;
    }
    
    
    
}