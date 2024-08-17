
package ax.com.gm.peliculas.servicio;


public interface ICataogoPeliculas {
    String NOMBRE_RECURSO = "Peliculas.txt";
    
    void agregarPelicula(String nombre);
    
    void listarPeliculas();
    
    void  buscarPeliculas(String buscar);
    
    void iniciarCatalogoPeliculas();
}