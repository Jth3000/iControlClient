package com.wizards.operations.icontrol;


/**
* com/wizards/operations/icontrol/MemberHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from icontrol.idl
* Monday, March 12, 2012 7:09:13 PM PDT
*/

abstract public class MemberHelper
{
  private static String  _id = "IDL:com/wizards/operations/icontrol/Member:1.0";

  public static void insert (org.omg.CORBA.Any a, com.wizards.operations.icontrol.Member that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.wizards.operations.icontrol.Member extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [5];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_longlong);
          _members0[1] = new org.omg.CORBA.StructMember (
            "connections",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "availability",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "enabled",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "description",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (com.wizards.operations.icontrol.MemberHelper.id (), "Member", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.wizards.operations.icontrol.Member read (org.omg.CORBA.portable.InputStream istream)
  {
    com.wizards.operations.icontrol.Member value = new com.wizards.operations.icontrol.Member ();
    value.name = istream.read_string ();
    value.connections = istream.read_longlong ();
    value.availability = istream.read_string ();
    value.enabled = istream.read_string ();
    value.description = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.wizards.operations.icontrol.Member value)
  {
    ostream.write_string (value.name);
    ostream.write_longlong (value.connections);
    ostream.write_string (value.availability);
    ostream.write_string (value.enabled);
    ostream.write_string (value.description);
  }

}