package MundoPC.mx.com.gm.mundopc;


public class Computadora {
    private  final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputador;
    
    public Computadora(){
        this.idComputadora = ++contadorComputador;
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this(); //Se llama el constructor vacio
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }
    
    //GETTERS AND SETTERS
    
    public int getIdComputadora(){
        return this.idComputadora;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Monitor getMonitor(){
        return this.monitor;
    }
    
    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }
    
    public Teclado getTeclado(){
        return this.teclado;
    }
    
    public void setTeclado (Teclado teclado){
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
    
    
}
