/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author SUA
 */
public class Aritmetica {
    //ATRIBUTOS DE LA CLASE
    int a;
    int b;
    
    //METODOS
    public void sumar(){
        int resultado = a+b;
        System.out.println("resultado suma = " + resultado );
    }
    
    public int sumarConRetorno(){
        /*int resultado = a+b;
        return resultado;/*
        
        */
        return a+b;
    }
}
