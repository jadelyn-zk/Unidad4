package ejerciciosU4parte1;

public class mainRectangulo {
 
    public static void main(String[] args) {
        // Crear dos objetos Rectangulo
        Rectangulo rect1 = new Rectangulo(4, 3, 2, 1);  // Este dará error 
        Rectangulo rect2 = new Rectangulo(1, 2, 3, 4);  
        
        // Mostrar información inicial
        System.out.println("RECTÁNGULOS INICIALES");
        System.out.println("Rectángulo 1" + rect1.mostrarRectangulo()); 
        System.out.println("Rectángulo 2" + rect2.mostrarRectangulo());  
        
        // Modificar las coordenadas
        rect1.setX1Y1(rect1.getX1() + 1, rect1.getY1() + 2);
        rect2.setX1Y1(rect2.getX2() + 3, rect2.getY2() + 4);
        
        // Mostrar información modificada
        System.out.println();
        System.out.println("RECTÁNGULOS MODIFICADOS");
        System.out.println("Rectángulo 1" + rect1.mostrarRectangulo());
        System.out.println("Rectángulo 2" + rect2.mostrarRectangulo());
        
        System.out.println("Rectángulo 1: " + rect1.mostrarInfoCompleta());
        System.out.println("Rectángulo 2: " + rect2.mostrarInfoCompleta());
    }
}