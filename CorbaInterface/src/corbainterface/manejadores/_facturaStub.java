package manejadores;


/**
* manejadores/_facturaStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/LABAM/Documents/Parra/Sistemas Distribuidos/CORBA/CORBA/CorbaInterface/src/corbainterface/generar.idl
* martes 28 de mayo de 2019 15H59' PYT
*/

public class _facturaStub extends org.omg.CORBA.portable.ObjectImpl implements manejadores.factura
{

  public void generar (String nombre, String cedula, String direccionp, manejadores.Productos[] productos, String company, String direccionc, String telefono, int numero)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("generar", true);
                $out.write_string (nombre);
                $out.write_string (cedula);
                $out.write_string (direccionp);
                manejadores.productosarrayHelper.write ($out, productos);
                $out.write_string (company);
                $out.write_string (direccionc);
                $out.write_string (telefono);
                $out.write_long (numero);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                generar (nombre, cedula, direccionp, productos, company, direccionc, telefono, numero        );
            } finally {
                _releaseReply ($in);
            }
  } // generar

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:manejadores/factura:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _facturaStub
