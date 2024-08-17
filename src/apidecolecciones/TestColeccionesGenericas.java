
package apidecolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>(); // Se envuelven en genericos de tipo String
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("SABADO");
        miLista.add("Domingo");
        
        String elementos = miLista.get(0);
        
        Map miMapa = new HashMap(); // Se crea un objeto de tipo Map
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valro 2", "Karla");
        miMapa.put("3", "Kevin");
        
        String elemento = (String) miMapa.get("Valor1"); //Se asigna a una variable el valor que alamacena la llave "Valor 1"
        System.out.println("elemento = " + elemento); // Se imprime el valor qeu trae la llave "Valor 1"
        
        System.out.println("elemento = " + miMapa.keySet()); //Se imprimen las llaves de todo el Map
        System.out.println("elemento = " + miMapa.values()); // Se imprimen los valores de cada llave del Map
                
        
         //FOREACH PARA ITERAR LOS ELEMENTOS DE LA LISTA EN ORDEN
//        for(Object elemento : miLista){
//            System.out.println("Elemento "+ elemento);
//        }
    }
}
