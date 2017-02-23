package org.apache.spark.serializer;
/**
 * This is a bridge class to wrap KryoInput as an InputStream and ObjectInput. It forwards all
 * methods of InputStream and ObjectInput to KryoInput. It's usually helpful when an API expects
 * an InputStream or ObjectInput but you want to use Kryo.
 */
  class KryoInputObjectInputBridge extends java.io.FilterInputStream implements java.io.ObjectInput {
  public   KryoInputObjectInputBridge (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input input)  { throw new RuntimeException(); }
  public  long readLong ()  { throw new RuntimeException(); }
  public  char readChar ()  { throw new RuntimeException(); }
  public  float readFloat ()  { throw new RuntimeException(); }
  public  byte readByte ()  { throw new RuntimeException(); }
  public  short readShort ()  { throw new RuntimeException(); }
  public  java.lang.String readUTF ()  { throw new RuntimeException(); }
  public  int readInt ()  { throw new RuntimeException(); }
  public  int readUnsignedShort ()  { throw new RuntimeException(); }
  public  int skipBytes (int n)  { throw new RuntimeException(); }
  public  void readFully (byte[] b)  { throw new RuntimeException(); }
  public  void readFully (byte[] b, int off, int len)  { throw new RuntimeException(); }
  public  java.lang.String readLine ()  { throw new RuntimeException(); }
  public  boolean readBoolean ()  { throw new RuntimeException(); }
  public  int readUnsignedByte ()  { throw new RuntimeException(); }
  public  double readDouble ()  { throw new RuntimeException(); }
  public  java.lang.Object readObject ()  { throw new RuntimeException(); }
}
