package ejercicioCrud1;

import java.util.Scanner;

public class mainEj1 {

    public static void main(String[] args) {

        Scanner sc             = new Scanner(System.in);
        GestorAlumnos gestor   = new GestorAlumnos();
        int opcion;

        do {
            System.out.println("ALUMNOS/AS");
            System.out.println("===================");
            System.out.println("1. Listado.");
            System.out.println("2. Nuevo Alumno.");
            System.out.println("3. Modificar.");
            System.out.println("4. Borrar.");
            System.out.println("5. Salir.");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    gestor.listar();
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nota media: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();
                    gestor.añadir(new Alumno(nombre, nota));
                    System.out.println("Alumno añadido correctamente.");
                    break;

                case 3:
                    System.out.print("Nombre del alumno a modificar: ");
                    String nomMod = sc.nextLine();
                    if (gestor.buscarPorNombre(nomMod) != null) {
                        System.out.print("Nueva nota: ");
                        double nuevaNota = sc.nextDouble();
                        sc.nextLine();
                        gestor.modificarNota(nomMod, nuevaNota);
                        System.out.println("Nota modificada correctamente.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Nombre del alumno a borrar: ");
                    String nomBorrar = sc.nextLine();
                    if (gestor.borrar(nomBorrar)) {
                        System.out.println("Alumno eliminado correctamente.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}