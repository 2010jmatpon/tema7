package Actividad7_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Actividad7_2 {
    public static void main(String[] args) {
        try {
            File carpeta = new File("C:\\Users\\1DAW_2223_14");
            if (!carpeta.exists()) {
                carpeta.mkdir();
            }
            File file1 = new File("C:\\Users\\1DAW_2223_14\\alumnos.txt");
            if (!file1.exists()) {
                file1.createNewFile();
            }
            FileWriter escribir = new FileWriter(file1);
            BufferedWriter buffer = new BufferedWriter(escribir);
            buffer.write("Diego \n");
            buffer.write("Victor \n");
            buffer.write("Julián \n");
            buffer.write("Pablo \n");
            buffer.write("Saborido \n");
            buffer.write("Dani \n");
            buffer.write("Adrián \n");
            buffer.write("Antonio \n");
            buffer.write("Jorge \n");
            buffer.write("Juan Maria \n");
            buffer.write("Johnnatan \n");
            buffer.write("Herrera \n");
            buffer.write("Juan Jesús \n");
            buffer.write("Ricardo \n");

            buffer.close();



            File file2 = new File("C:\\Users\\1DAW_2223_14\\prog_codificado.txt");
            file1.renameTo(file2);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
