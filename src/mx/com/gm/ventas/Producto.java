
package mx.com.gm.ventas;

public class Producto {
     private final int idProducto;
     private String nombre;
     private Double precio;
     private static int contadorProductos;
     
     private Producto(){
         this.idProducto = ++Producto.contadorProductos;
     }
     
     public Producto(String nombre, Double precio){
         this(); //se llama el constructor vacio para inicializar el idProducto
         this.nombre = nombre;
         this.precio = precio;
     }
     
     public int getIdProducto(){
         return idProducto;
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
     
     
     
     
}
