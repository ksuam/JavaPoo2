
package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona1);
        System.out.println("persona nombre = " + persona1.nombre);

    }
}


class Persona{ //Solo se puede acceder dentro del paquete
    String nombre;
    String apellido;
    
    Persona (String nombre, String apellido){ //constructor del objeto
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("OBjeto perosna usando this"+this); // Imprimitr el mismo objeto desde si mismo
        new Imprimir().imprimir(this); // Otra sitaxis para crear un objeto
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir"+ persona);
        System.out.println("Persona desde imprimir"+ this);

    }
     
           
}
