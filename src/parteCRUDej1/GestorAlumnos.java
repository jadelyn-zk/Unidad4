package parteCRUDej1;

import java.util.ArrayList;

public class GestorAlumnos {

    private ArrayList<Alumno> alumnos;

    public GestorAlumnos() {
        this.alumnos = new ArrayList<>();
    }

    public void añadir(Alumno alumno) {
        alumnos.add(alumno);
    }

    public Alumno buscarPorNombre(String nombre) {
        for (Alumno a : alumnos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) return a;
        }
        return null;
    }

    public boolean modificarNota(String nombre, double nuevaNota) {
        Alumno alumno = buscarPorNombre(nombre);
        if (alumno != null) {
            alumno.setNotaMedia(nuevaNota);
            return true;
        }
        return false;
    }

    public boolean borrar(String nombre) {
        Alumno alumno = buscarPorNombre(nombre);
        if (alumno != null) {
            alumnos.remove(alumno);
            return true;
        }
        return false;
    }

    public void listar() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno a : alumnos) {
                System.out.println(a);
            }
        }
    }
}