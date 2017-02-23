package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * Method by which input data was read. Network means that the data was read over the network
 * from a remote block manager (which may have stored the data on-disk or in-memory).
 * Operations are not thread-safe.
 */
public  class DataReadMethod {
  static public  scala.Enumeration.Value Memory ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.Value Disk ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.Value Hadoop ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.Value Network ()  { throw new RuntimeException(); }
  static protected  java.lang.Object readResolve ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.ValueSet values ()  { throw new RuntimeException(); }
  static protected  int nextId ()  { throw new RuntimeException(); }
  static protected  void nextId_$eq (int x$1)  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.String> nextName ()  { throw new RuntimeException(); }
  static protected  void nextName_$eq (scala.collection.Iterator<java.lang.String> x$1)  { throw new RuntimeException(); }
  static public final  int maxId ()  { throw new RuntimeException(); }
  static public final  scala.Enumeration.Value apply (int x)  { throw new RuntimeException(); }
  static public final  scala.Enumeration.Value withName (java.lang.String s)  { throw new RuntimeException(); }
  static protected final  scala.Enumeration.Value Value ()  { throw new RuntimeException(); }
  static protected final  scala.Enumeration.Value Value (int i)  { throw new RuntimeException(); }
  static protected final  scala.Enumeration.Value Value (java.lang.String name)  { throw new RuntimeException(); }
  static protected final  scala.Enumeration.Value Value (int i, java.lang.String name)  { throw new RuntimeException(); }
}
