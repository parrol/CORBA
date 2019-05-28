package corbacliente;
import example.fibonacci;
import example.fibonacciHelper;
import java.util.Scanner;
import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;
public class FiboClient {
    
    public static void main(String args[]) {
        try {
            
            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            fibonacci fiboImpl = fibonacciHelper.narrow(ncRef.resolve_str("Fibonacci"));
            //para capturar lo que escriba el usuario
            Scanner c = new Scanner(System.in);
            System.out.println("PC> - Generador de Fibonacci - ");
            for (;;) {//ciclo infinito
                System.out.println("PC> Ingrese numero [x:salir]:");
                String input = c.nextLine();       
                if(input.equals("x"))break;
                int numero = Integer.parseInt(input);
                String response = fiboImpl.generar(numero);
                System.out.println("Fibonacci de " + numero + " es " + response);
                System.out.println("----------------------------------------------------------------------------");
            }     
            
        } catch (InvalidName | NotFound | CannotProceed | org.omg.CosNaming.NamingContextPackage.InvalidName e) {
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }
    }
}