package ejerciciosU4parte1;

import java.util.Scanner;

public class mainPersona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear personas vacías (con valores por defecto)
        Persona persona1 = new Persona("", "", "", 0);
        Persona persona2 = new Persona("", "", "", 0);
        Persona persona3 = new Persona("María", "Martín", "45678912C", 65);  // Jubilada

        
        // Pedir datos de la primera persona
        System.out.println("Introduce los datos de la primera persona:");
        
        System.out.print("DNI: ");
        persona1.setDni(sc.next());
        
        System.out.print("Nombre: ");
        persona1.setNombre(sc.next());
        
        System.out.print("Apellidos: ");
        persona1.setApellidos(sc.next());
        
        System.out.print("Edad: ");
        persona1.setEdad(sc.nextInt());
        
        // Pedir datos de la segunda persona 
        System.out.println("\nIntroduce los datos de la segunda persona:");
        
        System.out.print("DNI: ");
        persona2.setDni(sc.next());
        
        System.out.print("Nombre: ");
        persona2.setNombre(sc.next());
        
        System.out.print("Apellidos: ");
        persona2.setApellidos(sc.next());
        
        System.out.print("Edad: ");
        persona2.setEdad(sc.nextInt());
        
        System.out.println("RESULTADOS:");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

        
        //probar mas metodos
        
        System.out.println("MAYORES DE EDAD");
        System.out.println("Persona 1 " + persona1.esMayorEdad());
        System.out.println("Persona 2 " + persona2.esMayorEdad());
        System.out.println("Persona 3 " + persona3.esMayorEdad());

        System.out.println("JUBILADOS:");
        System.out.println("Persona 1 " + persona1.esJubilado());
        System.out.println("Persona 2 " + persona2.esJubilado());
        System.out.println("Persona 3 " + persona3.esJubilado());
        
        System.out.println("DIFERENCIA DE EDAD");
        System.out.println("Persona 3 tiene una diferencia de edad de " + persona3.diferenciaEdad(persona1) 
        + " años con la persona 1 y una diferencia de edad de "  + persona3.diferenciaEdad(persona2) + " años con la persona 2");


    }
}