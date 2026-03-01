package ejerciciosu4parte4;

public class mainEj4 {
    public static void main(String[] args) {
        Hora hora = new Hora(23, 24, 59);
        
        System.out.println(hora.getHora() + ":" + hora.getMinuto() + ":" + hora.getSegundo());
        
        hora.incrementarSegundo();
        System.out.println(hora.getHora() + ":" + hora.getMinuto() + ":" + hora.getSegundo());
        
        hora.incrementarSegundo();
        System.out.println(hora.getHora() + ":" + hora.getMinuto() + ":" + hora.getSegundo());
    }
}