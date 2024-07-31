
package MundoPC.mx.com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras [];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS =10;
    private int contadorComputadoras;
    
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
        
        
    }
    
    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Limite de Computadoras por orden"+ Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #: "+ this.idOrden);
        
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
