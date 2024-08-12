
package bloquesinicializacion;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    //bloque de iniciailizacion estatica, se ejecuta al carga la clase en memoria la primera vez
    static{ 
        System.out.println("Ejeecucion bloque estatico");
        Persona.contadorPersona = ++contadorPersona;
        
    }
    
    //bloque de inicializacion no estatico, se ejecuta antes del constructoer de la clase
    {
        System.out.println("Ejecucion de bloque NO estatic");
        this.idPersona = contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
}
