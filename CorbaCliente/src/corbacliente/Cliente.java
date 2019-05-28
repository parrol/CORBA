package corbacliente;

import corbacliente.ventanas.CrearFactura;
import corbacliente.ventanas.Main;
import java.util.Scanner;
import manejadores.factura;
import manejadores.facturaHelper;
import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class Cliente {

    public static void main(String args[]) {
        try {

            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            factura metodos = facturaHelper.narrow(ncRef.resolve_str("Factura"));

            //Empieza el programa
            //MAIN//
            

            CrearFactura crearFactura = new CrearFactura();
            crearFactura.setVisible(false);
            
            Main main = new Main(crearFactura);
            main.setVisible(true);

            Scanner c = new Scanner(System.in);
            System.out.println("PC> - Generador de Fibonacci - ");
            for (;;) {//ciclo infinito
                System.out.println("PC> Ingrese numero [x:salir]:");
                String input = c.nextLine();
                if (input.equals("x")) {
                    break;
                }
                int numero = Integer.parseInt(input);
                String response = metodos.generar(numero);
                System.out.println("Fibonacci de " + numero + " es " + response);
                System.out.println("----------------------------------------------------------------------------");
            }

        } catch (InvalidName | NotFound | CannotProceed | org.omg.CosNaming.NamingContextPackage.InvalidName e) {
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }
    }
}
