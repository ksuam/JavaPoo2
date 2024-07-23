/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import Arreglos.Persona;

/**
 *
 * @author aprendiztic1
 */
public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona [2];
        personas [0] = new Persona("Juan");
        personas [1] = new Persona ("Karla");
        System.out.println("personas = " + personas[0]);
        System.out.println("personas = " + personas[1]);
        
        
        for(int i =0; i<personas.length; i++){
            System.out.println("Personas = " + personas[i]);
        }
        
        String frutas [] ={
            "Naranja",
            "Manzana",
            "Uva"
        };
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
        
    }
}
