/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author aprendiztic1
 */
public class TestMatrices {
    public static void main(String[] args) {
        int edades [][] = new int [3][2]; 
        System.out.println("edades = " + edades);
        
        edades [0][0] = 5;
        edades [0][1] = 8;
        edades [1][0] = 4;
        edades [1][1] = 9;
        
        System.out.println("edades = " + edades[0][0]);
        
        for (int ren = 0; ren < edades.length; ren++) {
            
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades " + ren+ "-"+col+" valor: "+edades[ren][col]);
            }
            
        }
        
        String frutas [][] = {{"Manzana","Limon"},{"fresa", "uva"}};
        
        for (int ren = 0; ren < frutas.length; ren++) {
            
            for (int j = 0; j < frutas[ren].length; j++) {
                System.out.println("Frutas = " + ren +"-"+j+ "VALOR: |"+frutas[ren][j]+"|");
            }
        }
    }
}
