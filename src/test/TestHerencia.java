/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dominio.ClienteHerencia;
import dominio.EmpleadoHerencia;
import java.util.Date;

/**
 *
 * @author aprendiztic1
 */
public class TestHerencia {
    public static void main(String[] args) {
        //EmpleadoHerencia empleado1 = new EmpleadoHerencia();
        //System.out.println("empleado1 = " + empleado1);
        var fecha = new Date();
        ClienteHerencia cliente1 = new ClienteHerencia(fecha, true, "Karla", 'F', 28, "Saturno 15");
        System.out.println("Cliente:" + cliente1);
        
    }
}
