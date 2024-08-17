package manejoarchivos;

public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombre = "Prueba.txt";

        //ManejoArchivos.crearArchivo(nombre); //Crear el archivo
//        ManejoArchivos.anexarArchivo(nombre, "Adios");
//        ManejoArchivos.anexarArchivo(nombre, "hola");

        ManejoArchivos.leerArchivo(nombre);

    }
}
