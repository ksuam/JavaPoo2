/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instnceof;

import sobrescritura.*;

/**
 *
 * @author aprendiztic1
 */
public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    public String obtenerDetalles(){
        return super.obtenerDetalles() + " Departamento " + this.departamento;
    }
    
    
    
}
