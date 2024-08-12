/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeraciones;

/**
 *
 * @author aprendiztic1
 */
public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    private final int paises;
    
    //constructor
    Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
