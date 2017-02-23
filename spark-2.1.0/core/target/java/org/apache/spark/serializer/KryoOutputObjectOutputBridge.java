package org.apache.spark.serializer;
/**
 * This is a bridge class to wrap KryoOutput as an OutputStream and ObjectOutput. It forwards all
 * methods of OutputStream and ObjectOutput to KryoOutput. It's usually helpful when an API expects
 * an OutputStream or ObjectOutput but you want to use Kryo.
 */
  class KryoOutputObjectOutputBridge extends java.io.FilterOutputStream implements java.io.ObjectOutput {
  public   KryoOutputObjectOutputBridge (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Output output)  { throw new RuntimeException(); }
  public  void writeFloat (float v)  { throw new RuntimeException(); }
  public  void writeChars (java.lang.String s)  { throw new RuntimeException(); }
  public  void writeDouble (double v)  { throw new RuntimeException(); }
  public  void writeUTF (java.lang.String s)  { throw new RuntimeException(); }
  public  void writeShort (int v)  { throw new RuntimeException(); }
  public  void writeInt (int v)  { throw new RuntimeException(); }
  public  void writeBoolean (boolean v)  { throw new RuntimeException(); }
  public  void write (int b)  { throw new RuntimeException(); }
  public  void write (byte[] b)  { throw new RuntimeException(); }
  public  void write (byte[] b, int off, int len)  { throw new RuntimeException(); }
  public  void writeBytes (java.lang.String s)  { throw new RuntimeException(); }
  public  void writeChar (int v)  { throw new RuntimeException(); }
  public  void writeLong (long v)  { throw new RuntimeException(); }
  public  void writeByte (int v)  { throw new RuntimeException(); }
  public  void writeObject (java.lang.Object obj)  { throw new RuntimeException(); }
}
