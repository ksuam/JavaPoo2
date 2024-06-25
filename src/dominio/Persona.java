
package dominio;


public class Persona {

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }
    private int idPersona;
    private static int contadorPersonas; // Atributo estatico
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(String nombre){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
        this.idPersona = Persona.contadorPersonas;
        Persona.contadorPersonas++; //Se accede con la clase y se aumenta en uno cada vez que se usa
        
        //Inrementar el contador por cada obejto nuevo
    }

    public String getNombre() { // recuperar el nombre por medioo del metodo get
        return this.nombre;
    }

    public void setNombre(String nombre) {//establecer un nuevo valor para el nombre por medio del metodo set
        this.nombre = nombre;
    }

  public double getSueldo(){
      return this.sueldo;
  }
  
  public void setSueldo(){
      this.sueldo = sueldo;
  }

    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    public String toString(){
        return "Persona [ nombre: " + this.nombre +
                " Sueldo: "+this.sueldo +
                " Eliminado:"+this.eliminado + "idPersona:"+ this.idPersona+"]";
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    
    
}
