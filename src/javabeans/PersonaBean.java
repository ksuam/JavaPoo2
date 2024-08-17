
package javabeans;

import java.io.Serializable;


public class PersonaBean implements Serializable{//debe de ser serializable para que el objeto peuda ser transferido en bits, ceros y unos 
     private String nombre;
    private String apellido;
    
    //Debe de tener un constructor vacio 
    
    public PersonaBean(){
    
    }
    
    public PersonaBean(String nombre, String apellido){
        this.apellido = apellido;
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "PersonaBean{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
}
