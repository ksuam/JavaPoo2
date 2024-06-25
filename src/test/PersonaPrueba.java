package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000, false);

        persona1.setNombre("Juan carlos");
        System.out.println("persona1 = " + persona1.getNombre());
        System.out.println("persona1 eliminado = " + persona1.isEliminado());

        System.out.println("persona1 objeto= " + persona1.toString());
    }
}
