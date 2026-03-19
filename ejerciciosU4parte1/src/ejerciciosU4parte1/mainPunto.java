package ejerciciosU4parte1;

public class mainPunto {
    public static void main(String[] args) {
        Punto punto1 = new Punto(5, 0);
        Punto punto2 = new Punto(10, 10);
        Punto punto3 = new Punto(-3, 7);
        Punto p = new Punto(9, 2);

        // Mostrar coordenadas iniciales usando getters
        System.out.println("Coordenadas iniciales:");
        System.out.println("Punto 1:" + punto1.toString());
        System.out.println("Punto 2:" + punto2.toString());
        System.out.println("Punto 3:" + punto3.toString());
        
        // Modificar coordenadas usando setters con operaciones
        punto1.setX(punto1.getX() + 2);  
        punto1.setY(punto1.getY() + 3);  
        
        punto2.setX(punto2.getX() - 5);  
        punto2.setY(punto2.getY() * 2);  
        
        punto3.setX(-punto3.getX());      
        punto3.setY(punto3.getY() + 1);   
        
     // Mostrar coordenadas modificadas usando getters
        System.out.println("\nCoordenadas después de modificar:");
        System.out.println("Punto 1:" + punto1.toString());
        System.out.println("Punto 2:" + punto2.toString());
        System.out.println("Punto 3:" + punto3.toString());
        
        //probar klas otras funciones
        
        Punto p3 = new Punto(1, 2);
        Punto p4 = new Punto(3, 4);
        
        System.out.println("p3 = " + p3);
        System.out.println("p4 = " + p4);
        System.out.println("Distancia de p3 a p4: " + p3.distancia(p4));
        
        p3.desplaza(1, 1);
        System.out.println("p3 después de desplaza(1,1): " + p3);
        
        p4.setXY(10, 10);
        System.out.println("p4 después de setXY " + p4);
        System.out.println("Distancia: " + p3.distancia(p4));
    }
}