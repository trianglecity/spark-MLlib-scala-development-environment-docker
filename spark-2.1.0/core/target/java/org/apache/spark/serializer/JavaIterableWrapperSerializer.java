package org.apache.spark.serializer;
/**
 * A Kryo serializer for serializing results returned by asJavaIterable.
 * <p>
 * The underlying object is scala.collection.convert.Wrappers$IterableWrapper.
 * Kryo deserializes this into an AbstractCollection, which unfortunately doesn't work.
 */
public  class JavaIterableWrapperSerializer extends com.esotericsoftware.kryo.Serializer<java.lang.Iterable<?>> {
  static public  Object wrapperClass ()  { throw new RuntimeException(); }
  static private  scala.Option<java.lang.reflect.Method> underlyingMethodOpt ()  { throw new RuntimeException(); }
  static public  boolean getAcceptsNull ()  { throw new RuntimeException(); }
  static public  void setAcceptsNull (boolean x$1)  { throw new RuntimeException(); }
  static public  boolean isImmutable ()  { throw new RuntimeException(); }
  static public  void setImmutable (boolean x$1)  { throw new RuntimeException(); }
  static public  void setGenerics (com.esotericsoftware.kryo.Kryo x$1, java.lang.Class<?>[] x$2)  { throw new RuntimeException(); }
  static public  T copy (com.esotericsoftware.kryo.Kryo x$1, T x$2)  { throw new RuntimeException(); }
  public   JavaIterableWrapperSerializer ()  { throw new RuntimeException(); }
  public  void write (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Output out, java.lang.Iterable<?> obj)  { throw new RuntimeException(); }
  public  java.lang.Iterable<?> read (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input in, java.lang.Class<java.lang.Iterable<?>> clz)  { throw new RuntimeException(); }
}
