
package dominio;

import java.util.Date;


public class ClienteHerencia extends PersonaHerencia{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    public ClienteHerencia(Date fechaRegistro, boolean vip,String nombre, char genero, int edad, String direccion){
        
        super (nombre, genero, edad, direccion); //manda a llamar el constructor de la clase padre, para inicializar estos atributos en esra clase
        this.idCliente =++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClienteHerencia{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", vip=").append(super.toString());

        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
