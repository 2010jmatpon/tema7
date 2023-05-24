package serializacion.Actividad7_3;


import java.io.*;

public class Actividad7_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Persona padre = new Persona();

        FileOutputStream padre1 = new FileOutputStream("C:\\Users\\1DAW_2223_14\\Desktop\\padre.bin");
        ObjectOutputStream oos = new ObjectOutputStream(padre1);

        oos.writeObject(padre);

        oos.close();

        FileInputStream padre2 = new FileInputStream("C:\\Users\\1DAW_2223_14\\Desktop\\padre.bin");
        ObjectInputStream ois = new ObjectInputStream(padre2);
        Persona osSalida = (Persona)ois.readObject();

        System.out.println("Nombre: " + osSalida.nombre + " " + osSalida.apellidos);
        System.out.println("Edad: " + osSalida.edad + " años.");

        ois.close();

    }
}
