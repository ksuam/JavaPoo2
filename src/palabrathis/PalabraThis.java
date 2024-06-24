
package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona1);
    }
}


class Persona{ //Solo se puede acceder dentro del paquete
    String nombre;
    String apellido;
    
    Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
