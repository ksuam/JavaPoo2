/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ax.com.gm.peliculas.domain;

/**
 *
 * @author SUA
 */
public class Pelicula {
    private String nombre;
    
    public Pelicula(){
        
    }
    
    public Pelicula (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
}
