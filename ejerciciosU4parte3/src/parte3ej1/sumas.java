package parte3ej1;

public class sumas {
    int num1;
    int num2;
    double nume1;
    double nume2;
    
    public sumas(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int suma() {
        return this.num1 + this.num2;
    }
    
    public sumas(double nume1, double nume2) {
        this.nume1 = nume1;
        this.nume2 = nume2;
    }
    
    public double sumaD() {
        return this.nume1 + this.nume2;  
    }
}