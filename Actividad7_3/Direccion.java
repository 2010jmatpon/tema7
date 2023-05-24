package serializacion.Actividad7_3;

import java.io.Serializable;

public class Direccion implements Serializable {

    public String calle;



    public Direccion() {}

    public Direccion(String calle) {
        this.calle = calle;
    }



    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }


    @Override
    public String toString() {
        return getCalle();
    }
}