package com.wizards.operations.icontrol;


/**
* com/wizards/operations/icontrol/AppletPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from icontrol.idl
* Monday, March 12, 2012 7:09:13 PM PDT
*/

public abstract class AppletPOA extends org.omg.PortableServer.Servant
 implements com.wizards.operations.icontrol.AppletOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:com/wizards/operations/icontrol/Applet:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Applet _this() 
  {
    return AppletHelper.narrow(
    super._this_object());
  }

  public Applet _this(org.omg.CORBA.ORB orb) 
  {
    return AppletHelper.narrow(
    super._this_object(orb));
  }


} // class AppletPOA
