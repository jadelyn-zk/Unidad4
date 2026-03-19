package parte3ej3;

public class mainEj3 {
    public static void main(String[] args) {
        sumaEnteros suma1 = new sumaEnteros();
        sumaEnteros suma2 = new sumaEnteros();

        
        System.out.println("Suma todos los numeros desde 1 hasta 5: " + suma1.sumaHastaNum(5));   
        System.out.println("Suma todos los numeros desde 1 hasta 3: " + suma1.sumaHastaNum(3));   
        System.out.println("Suma todos los numeros desde 1 hasta 10: " + suma1.sumaHastaNum(10)); 
        
        System.out.println("Suma todos los numeros entre 3 hasta 9: " + suma2.sumaEntreNum(3,9));   

    }
}