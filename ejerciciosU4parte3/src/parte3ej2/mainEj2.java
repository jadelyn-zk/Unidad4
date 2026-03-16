package parte3ej2;

public class mainEj2 {

    public static void main(String[] args) {
        Media calculadora = new Media();
        
        System.out.println("Media de 5 y 7: " + calculadora.media(5, 7));
        
        System.out.println("Media de 4, 8 y 9: " + calculadora.media(4, 8, 9));
    }
}