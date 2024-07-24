
package mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[]; // Se declara el arreglo
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes; //Se asigna +1 del valor que tenga contadorOrdenes
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; // Se inicializa el arreglo
    }
    
    public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) { //se valida si la cantidad de productos a agregar es menor que la cantidad de productos permitidas
            productos[contadorProductos++] = producto; //se asigna un nuevo producto al arreglo productos
        }
        else{
            System.out.println("Se ha superado el limite de productos");
        }
    };
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            Producto producto = this.productos[i];//variable local producto que hace referencia al objeto producto que se agregó al arreglo
            total += producto.getPrecio();//sumar el total al precio del producto
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("id orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("totalOrden = $" + totalOrden);
        System.out.println("Productos de la orden:");
        
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i].toString());
        }
    }
        
   

}
