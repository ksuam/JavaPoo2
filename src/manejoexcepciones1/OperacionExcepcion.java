
package manejoexcepciones1;

public class OperacionExcepcion extends Exception {
        //Execptioin obliga a colocar try cathc para controlar la excepcion
    
    public OperacionExcepcion (String mensaje){
        super(mensaje);
    }
}
