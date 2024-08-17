package ax.com.gm.peliculas.presentacion;

import ax.com.gm.peliculas.servicio.CatalogoPeliculasImpl;
import ax.com.gm.peliculas.servicio.ICataogoPeliculas;
import java.util.Scanner;

public class CatalogoPeliulasPresentacion {

    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICataogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println(
                    "Elige una opcion \n"
                    + "1. Inciar catalogo de peliculas \n"
                    + "2. Agregar Pelicula \n"
                    + "3. Listar Peliuclas \n"
                    + "4. Buscar Pelicula \n"
                    + "5. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch(opcion){
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                    
                case 2: 
                    System.out.println("Introduce el nombre de la pelicula = ");
                    var nombre = scanner.nextLine();
                    catalogo.agregarPelicula(nombre);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                
                case 4:
                    
                    System.out.println("Que pelicula desea buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPeliculas(buscar);
                case 0: 
                    System.out.println("Hasta Pronto");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
            }
                    
        }

    }
}
