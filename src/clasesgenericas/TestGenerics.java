/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesgenericas;

/**
 *
 * @author SUA
 */
public class TestGenerics {
    public static void main(String[] args) {
        
        //Se crea el pbjetod e tipo entero con su clase envolvente
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
     }
}
