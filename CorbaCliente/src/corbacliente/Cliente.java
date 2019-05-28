package corbacliente;

import corbacliente.ventanas.*;
import corbacliente.Interfaz;
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
            Main main = new Main();
            main.setVisible(true);

            ProductosV productos = new ProductosV();
            productos.setVisible(false);

            Clientes clientes = new Clientes();
            clientes.setVisible(false);

            Interfaz.getInterfaz().add(0, main);
            Interfaz.getInterfaz().add(1, clientes);
            Interfaz.getInterfaz().add(2, productos);

            
                //String response = metodos.generar(numero);
                //System.out.println("Fibonacci de " + numero + " es " + response);

        } catch (InvalidName | NotFound | CannotProceed | org.omg.CosNaming.NamingContextPackage.InvalidName e) {
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }
    }
}
