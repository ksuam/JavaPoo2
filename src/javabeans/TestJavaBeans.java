/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabeans;

/**
 *
 * @author SUA
 */
public class TestJavaBeans {
    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean(); //Se inicializa con el constructor vacio
        persona.setApellido("Martinez");
        persona.setNombre("Kevoin");
        System.out.println("persona = " + persona);
        persona.toString();
        
    }
}
