/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author SUA
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 2;
        aritmetica1.b= 1;
        aritmetica1.sumar();
        
        int resutado = aritmetica1.sumarConRetorno();
        System.out.println("resutado desde clase de prueba = " + resutado);
    }
}
