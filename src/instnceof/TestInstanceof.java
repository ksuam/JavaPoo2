
package instnceof;

import sobrescritura.*;


public class TestInstanceof {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan",10000);
        determinarTipo(empleado1);
       
        Gerente gerente1 = new Gerente("Karla", 2000, "Contabilidad");
       
        
    }
    
    public static void determinarTipo(Empleado empleado){
       if(empleado instanceof Gerente){ //se pregunta si empleado es de tipo gerente
           System.out.println("empleado = de tipo gerente");
       }else if(empleado instanceof Empleado){
           System.out.println("TIPO EMPLEADO");
       }
    }
}
