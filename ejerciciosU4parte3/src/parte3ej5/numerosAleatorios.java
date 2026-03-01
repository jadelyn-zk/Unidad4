package parte3ej5;
import java.util.Random;

public class numerosAleatorios {
    Random random = new Random();
    
    public void numerosAleatorios(int cantidad) {
        for(int i = 0; i < cantidad; i++) {
            System.out.println(random.nextDouble());
        }
    }
    
    public void numerosAleatorios(int cantidad, int max) {
        for(int i = 0; i < cantidad; i++) {
            System.out.println(random.nextInt(max + 1));
        }
    }
    
    public void numerosAleatorios(int cantidad, int min, int max) {
        for(int i = 0; i < cantidad; i++) {
            System.out.println(random.nextInt(max - min + 1) + min);
        }
    }
}