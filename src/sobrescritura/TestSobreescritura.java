
package sobrescritura;


public class TestSobreescritura {
    public static void main(String[] args) {
        //Gerente gerente1 = new Gerente("Juan", 5000 ,"Sistemas");
        //System.out.println("Gernete1" + gerente1.obtenerDetalles());
        
        Empleado empleado1 = new Empleado("Juan",10000);
        //System.out.println("Empleado: "+empleado1.obtenerDetalles());
        imprimir(empleado1);
        
        Gerente gerente1 = new Gerente("Karla", 2000, "Contabilidad");
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        imprimir(gerente1);
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
