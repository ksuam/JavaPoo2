
package MundoPC.mx.com.gm.mundopc;


public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    public int idMonitor(){
        return this.idMonitor;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public double getTamanio(){
        return this.tamanio;
    }
    
    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }
    
    @Override
    public String toString(){
        return " { idMonitor: "+this.idMonitor+ " Marca: "+this.marca+ " Tamaño: "+this.tamanio;
    }
    
}
