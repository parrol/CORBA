package corbaserver;
import example.fibonacci;
import example.fibonacciHelper;
import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;
public class FiboServer {

    public static void main(String args[]) {
        try {
            //Se instancia el ORB
            ORB orb = ORB.init(args, null);            
            //Se instancia el POA 
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));       
            //Se activa POA Manager
            rootpoa.the_POAManager().activate();       
            //Se instancia de clase que contiene los métodos a utilizar
            FiboImpl fiboImpl = new FiboImpl();             
            //obtiene la referencia de la clase FiboImpl (servant)
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(fiboImpl);
            fibonacci href = fibonacciHelper.narrow(ref);
            
            //obtiene referencia
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt rootContext = NamingContextExtHelper.narrow(objRef);
             
            NameComponent nameComponent[] = rootContext.to_name("Fibonacci");
            rootContext.rebind(nameComponent, href);
            
            //listo para recibir peticiones
            System.out.println("Servidor listo para recibir peticiones.");
            orb.run();            
        } catch (AdapterInactive | InvalidName | ServantNotActive | WrongPolicy | org.omg.CosNaming.NamingContextPackage.InvalidName | NotFound | CannotProceed e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace(System.out);
        }
    }
}
