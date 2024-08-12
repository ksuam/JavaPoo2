/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeraciones;

/**
 *
 * @author aprendiztic1
 */
public class TestEnumeraciones {
   
    public static void main(String[] args) {
      //  System.out.println("Dia 1:" +Dias.LUNES);
        //indicarDiasSemana(Dias.LUNES);
        System.out.println("Continente no 4" + Continentes.AMERICA);
        System.out.println("Paises en el 4o continente"+ Continentes.AMERICA.getPaises());
    }
    
    
    private static void indicarDiasSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
            break;
            
            case MARTES:
                System.out.println("Segundo dia de la semana");
        }
    }
}
