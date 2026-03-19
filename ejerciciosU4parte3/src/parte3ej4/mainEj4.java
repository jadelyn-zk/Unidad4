package parte3ej4;

public class mainEj4 {
    public static void main(String[] args) {
        parseToBoolean p = new parseToBoolean();
        
        System.out.println(p.ceroUno(1));    
        System.out.println(p.ceroUno(0));   
        System.out.println(p.ceroUno(5));    
        
        System.out.println(p.truefalse("true"));   
        System.out.println(p.truefalse("false"));  
        System.out.println(p.truefalse("hola"));  
    }
}