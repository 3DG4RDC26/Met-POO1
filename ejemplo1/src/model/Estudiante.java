package model;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private String carrera;
    private float nota;

    public Estudiante() {
    }
    public Estudiante(String nombre, String apellidos, String carrera) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
