package ejerciciosU4parte1;

public class Rectangulo {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    // Getters
    public int getX1() { 
    	return x1; }
    public int getY1() { 
    	return y1; }
    public int getX2() { 
    	return x2; }
    public int getY2() { 
    	return y2; }

    // Setters
    public void setX1(int x1) { 
    	this.x1 = x1; }
    public void setY1(int y1) { 
    	this.y1 = y1; }
    public void setX2(int x2) { 
    	this.x2 = x2; }
    public void setY2(int y2) { 
    	this.y2 = y2; }

    
    //Ahora getters y setters dobles para facilitar
    public void getX1Y1(int x1, int y1) {
    	 this.x1 = x1;
         this.y1 = y1;
    }
    public void getX2Y2(int x2, int y2) {
   	 this.x2 = x2;
        this.y2 = y2;
   }
    
    public void setX2Y2(int x2, int y2) {
    	 this.x2 = x2;
         this.y2 = y2;
    }
    
    public void setX1Y1(int x1, int y1) {
   	 this.x1 = x1;
        this.y1 = y1;
   }
    public void getAll(int x1, int y1, int x2, int y2) {
    	
    }
    public void setAll(int x1, int y1, int x2, int y2) {
    	this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    
    // Constructor
    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x1 < x2 && y1 < y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.out.println("Error: Las coordenadas no son válidas. Se usarán valores por defecto (1,1,2,2)");
            this.x1 = 1;
            this.y1 = 1;
            this.x2 = 2;
            this.y2 = 2;
        }
    }
    
    public String mostrarRectangulo() {
        return " - Coordenadas: (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")";
    }
    
    public int getAncho() {
        return Math.abs(x2 - x1);
    }
    
    public int getAlto() {
        return Math.abs(y2 - y1);
    }
    
    public int getPerimetro() {
        return 2 * (getAncho() + getAlto());
    }
    
    public int getArea() {
        return getAncho() * getAlto();
    }
    
    public String mostrarInfoCompleta() {
        return "Ancho: " + getAncho() + ", Alto: " + getAlto() + " Perímetro: " + getPerimetro() + "  Área: " + getArea();
    }
}