
package ax.com.gm.peliculas.servicio;

import ax.com.gm.peliculas.domain.Pelicula;
import ax.com.gm.peliculas.excepciones.AccesoDatosEx;
import ax.com.gm.peliculas.excepciones.LecturaDatosEx;
import ax.com.gx.peliculas.datos.AccesoDatosImpl;
import ax.com.gx.peliculas.datos.IAccesoDatos;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CatalogoPeliculasImpl implements ICataogoPeliculas {
    private final IAccesoDatos datos;
    
    public CatalogoPeliculasImpl(){
        this.datos = new AccesoDatosImpl(); //Se asigna a la variable datos de tipo interfaceaccesodatos, para qeu puedas usar los metodos de la imnplementacion de acceso datos
        
    }
    
    @Override
    public void agregarPelicula(String nombre) {
        Pelicula pelicula = new Pelicula(nombre); //Se crea un objeto de tipo pelicula y se le pasa el atributo de nombre
        boolean anexar = false; //Se define e inicializa la variable anexar en false
        try {
            anexar = datos.existe(NOMBRE_RECURSO); //Validar si eciste el recurso (archivo)
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar); //Agregar la pelicula al archivo
        } catch (AccesoDatosEx ex) {
            
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out); // se manda a imprimir la excepcion
        }
        
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            
            for(var pelicula : peliculas){
                System.out.println("pelicula = " + pelicula);
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Erros deacceso datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPeliculas(String buscar) {
        String resultado = null;
        
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
            
        } catch (LecturaDatosEx ex) {
            System.out.println("erros acceso datos = ");
            ex.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            }else{
                datos.crear(NOMBRE_RECURSO);
            } } catch (AccesoDatosEx ex) {
             System.out.println("Error al iniciar catalogo");
             ex.printStackTrace(System.out);
        }
    }
    
}
