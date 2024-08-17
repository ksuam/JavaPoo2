
package clasesgenericas;


public class ClaseGenerica <T>{ //Tipo T de cualquier tipo generico
    private T objeto;
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es:  = " + objeto.getClass().getTypeName());
    }
}
