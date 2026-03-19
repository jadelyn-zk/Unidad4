package ejerciciosU4parte1;

public class Punto {
    // Atributos privados 
    private int x;
    private int y;
    
    // Constructor
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Getters
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    //Setters
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void desplaza(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    public double distancia(Punto p) {
        int dx = this.x - p.getX();
        int dy = this.y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}