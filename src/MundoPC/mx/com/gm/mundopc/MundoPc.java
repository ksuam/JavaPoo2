
package MundoPC.mx.com.gm.mundopc;


public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorHp = new Monitor("HP", 13);
        Teclado tecladoHp = new Teclado ("USB","HP");
        Raton ratonHp = new Raton("Sin entrada", "HP");
        Computadora computadoraHP = new Computadora ("MI pc god", monitorHp, tecladoHp, ratonHp);
        
       Orden orden1 = new Orden();
       orden1.agregarComputadora(computadoraHP);
       orden1.mostrarOrden();
    }
}
