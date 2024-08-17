
package ax.com.gm.peliculas.excepciones;


public class AccesoDatosEx extends Exception{
    public AccesoDatosEx(String mesanje){ //Recibe un mensaje
        super(mesanje); // lo propaga a la clase padre
    }
}
