package ax.com.gx.peliculas.datos;

import ax.com.gm.peliculas.domain.Pelicula;
import ax.com.gm.peliculas.excepciones.AccesoDatosEx;
import ax.com.gm.peliculas.excepciones.EscrituraDatosEx;
import ax.com.gm.peliculas.excepciones.LecturaDatosEx;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;


public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombre) throws AccesoDatosEx {
        File archivo = new File(nombre); //Se crea ek objeto de tipo arvhivo

        return archivo.exists(); // se retorna la respuesta de la pregunta si existe el archivo

    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx {
        File archivo = new File(nombre); //Se crea el objeto de tipo archivo con el nombre que recibe la funcion
        List<Pelicula> peliculas = new ArrayList<>(); //Crear la lista con objetos de tipo Pelicula
        try {

            var entrada = new BufferedReader(new FileReader(archivo)); //Crear objeto de tipo lecutra y pasarle el archivo a leer
            String linea = null; //Definir linea como nulo
            linea = entrada.readLine(); //Leer linea del archivo

            while (linea != null) {
                var pelicula = new Pelicula(linea); // Crear objeto de tipo pelocula y pasarle la informacion leida
                peliculas.add(pelicula);// Agregar a la lista de peliculas, la pelicula

                linea = entrada.readLine(); //Leer linea del archivo
            }

            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(); //Imprmir la excepcion en consola
            throw new LecturaDatosEx("Error al listar peloculas" + ex.getMessage());// en caso de excpecion s emostratra este mensaje al usuaroi
        } catch (IOException ex) {
            ex.printStackTrace();// Imperimir la excepcion en consola
        }

        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombre, boolean anexar) throws EscrituraDatosEx {
        var archivo = new File(nombre); //Se crea el objeto de tipo archivo con el nombre que se recibe
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());

            salida.close();
            System.out.println("Se ha escrito informacion al archivo" + pelicula);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Erros al ecribir"+ ex.getMessage());
        }

    }

    @Override
    public String buscar(String nombre, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombre); //Se crea el objeto de archivo
        String resultado = null; //Se define el resultado como nulo
        try {
            var entrada = new BufferedReader(new FileReader(nombre));// se crea y define la variable entrada como un objeto para leer el archivo
            String linea = null;
            linea = entrada.readLine();// Se lee al linea
            int indice = 1; //Para saber el indice de la linea donde se ecnietra la pelicula que uscamos

            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {// se valida si la cadena a buscar esta vacia y si es igual a alguna de las lineas leidas
                    resultado = "Pelicula" + linea + "Encotrada en la linea " + indice; //Se asigna la cadena leida y el indice donde se encontró a la varaible resultado
                    break;
                }
                entrada.close();
                linea = entrada.readLine();// Se vuelve a leer la linea
                indice++;//Se incremeenta la variable del indice
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar Pelicula"+ ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar Pelicula"+ ex.getMessage());
        }
        return resultado;
    }
    
    @Override
    public void crear(String nombre) throws AccesoDatosEx {
        var archivo = new File(nombre);
        try {
            var salida = new PrintWriter(new FileWriter(nombre)); // Crear el archivo
            salida.close();//Cerrar el flujo
            System.out.println("Se ha creado el archivo = " + nombre);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Excecpiona l crear archivo"+ ex.getMessage());
        }
        
       
    }

    @Override
    public void borrar(String nombre){
        var archivo = new File(nombre);
        if(archivo.exists()) // verificar si existe el archivo
        archivo.delete();// Si existe se borra el archivo
        
        System.out.println("Se ha borrado el archivo");
    }

}
