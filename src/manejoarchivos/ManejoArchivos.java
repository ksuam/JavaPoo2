/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SUA
 */
public class ManejoArchivos {

    public static void crearArchivo(String nombre) {
        File archivo = new File(nombre); //nomnbre del archivo
        try {
            PrintWriter salida = new PrintWriter(archivo);// abrir el archivo para su salida
            salida.close(); //Cerrar la puerta del archivo
            System.out.println("Se ha creado el archivo");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);//Imprimir el error en caso de que aparezca
        }
    }

    public static void escribirArchivo(String nombre, String contenido) { //Sobre escribe la informacion
        File archivo = new File(nombre); //nomnbre del archivo

        //Se genera un try catch porque el objeto printwriter puede generar una expecion
        try {
            PrintWriter salida = new PrintWriter(archivo);// abrir el archivo para su salida
            salida.println(contenido); //Contendio a escribir en el archivo
            salida.close(); //Cerrar la puerta del archivo
            System.out.println("Se ha ecrito en el archivo");
            System.out.println("Se ha creado el archivo");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);//Imprimir el error en caso de que aparezca
        }
    }

    public static void anexarArchivo(String nombre, String contenido) {//Escribe informacion adicionala a la que ya está
        
        File archivo = new File(nombre); //nomnbre del archivo

        //Se genera un try catch porque el objeto printwriter puede generar una expecion
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido); //Contendio a escribir en el archivo
            salida.close(); //Cerrar la puerta del archivo
            System.out.println("Se ha anexado informacion en el archivo");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);//Imprimir el error en caso de que aparezca
        } catch (IOException ex) {
            ex.printStackTrace(System.out);//Imprimir el error en caso de que aparezca
        }
    }

    public static void leerArchivo(String nombre) {
        File archivo = new File(nombre);

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); //crear obejto

            var lectura = entrada.readLine(); // Leer lineas completas

            while (lectura != null) {
                System.out.println("Lecura = " + lectura);
                lectura = entrada.readLine(); //Leer la siguiente linea
            }
            entrada.close(); // Cerrar flujo
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
