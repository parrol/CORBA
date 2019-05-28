package corbaserver;

import java.util.ArrayList;
import manejadores.Productos;
import manejadores.facturaPOA;

public class Metodos extends facturaPOA {

    
    
    public void generar(String nombre, String cedula, String direccionp, Productos[] productos, String company, String direccionc, String telefono, int numero) {
        System.out.println("/////////////////////////////////");
        System.out.println("SENIAT");
        System.out.println("Company: " + company);
        System.out.println("Direccion: " + direccionp);
        System.out.println("Telefono: " + telefono);
        System.out.println("Numero de factura: " + numero);
        System.out.println("Hora: " + new java.util.Date());
        System.out.println("Datos del consumidor");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Direccion: " + direccionc);
        System.out.println("FACTURA");
        int i;
        int total = 0;
        for (i = 0; i < productos.length; i++) {
            System.out.println(productos[i].nombre + " > " + productos[i].precio);
            total += productos[i].precio;
        }
        System.out.println("TOTAL> " + total);
        System.out.println("/////////////////////////////////");
    }

}
