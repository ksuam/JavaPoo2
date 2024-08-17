/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ax.com.gx.peliculas.datos;

import ax.com.gm.peliculas.domain.Pelicula;
import ax.com.gm.peliculas.excepciones.AccesoDatosEx;
import ax.com.gm.peliculas.excepciones.EscrituraDatosEx;
import ax.com.gm.peliculas.excepciones.LecturaDatosEx;
import java.util.List;


public interface IAccesoDatos {
    
    boolean existe (String nombre) throws AccesoDatosEx;
    
    List<Pelicula> listar (String nombre) throws LecturaDatosEx;
    
    void escribir(Pelicula pelicula, String nombre, boolean anexar) throws EscrituraDatosEx;
    
    String buscar(String nombre, String buscar) throws LecturaDatosEx;
    
    void crear(String nombre) throws AccesoDatosEx;
    
    void borrar (String nombre) throws AccesoDatosEx;
}
