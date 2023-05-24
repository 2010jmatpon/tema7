package serializacion.Actividad7_3;


import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    String nombre;
    String apellidos;
    int edad;

    Direccion direccion;

    public Persona(){
        this.nombre = "Joaquin";
        this.apellidos = " Sanchez";
        this.edad = 41;
        this.direccion = new Direccion("Calle Los Pastores nº3");
    }


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}