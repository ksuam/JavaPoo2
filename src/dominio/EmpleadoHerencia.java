
package dominio;

public class EmpleadoHerencia extends PersonaHerencia {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public EmpleadoHerencia(String nombre, double sueldo){
       // this.idEmpleado = idEmpleado; //como es estatico no se declara de esta manera, se llama desde el otro controlador
       super(nombre); // recibir el argumento de persona hacia la clase empleado, llamando el contructor con la palabra SUPER
        this.sueldo = sueldo;
        this.idEmpleado =++EmpleadoHerencia.contadorEmpleado;
    }
    
    public int getIdEmpleado(){
        return this.idEmpleado;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmpleadoHerencia{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", persona=").append(super.toString()); // llamar el metodo toString de la clase padre para que muestre
        sb.append('}');
        return sb.toString();
    }


    
    
}

    