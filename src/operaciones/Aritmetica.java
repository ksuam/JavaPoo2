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
    
    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor vacio");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        
        System.out.println("Ejecutando contructor con arg");
    }
    
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
    
    public int sumarConArgumentos(int arg1, int arg2){
        a =arg1;
        b = arg2;
        
        return a +b;
    }
}
