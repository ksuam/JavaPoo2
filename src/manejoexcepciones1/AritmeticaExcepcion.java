
package manejoexcepciones1;


public class AritmeticaExcepcion {//Clase para manejar nuestras propias excepciones
    public static int division (int numerador,int  denominador) throws RuntimeException{
        if (denominador == 0){
            
            throw new OperacionExcepcion("Division entre cero");
        }else{
            return numerador/denominador;
        }
    }
}
