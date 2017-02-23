package org.apache.spark.serializer;
  class JavaDeserializationStream extends org.apache.spark.serializer.DeserializationStream {
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Class<?>> primitiveMappings ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T readKey (scala.reflect.ClassTag<T> evidence$9)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T readValue (scala.reflect.ClassTag<T> evidence$10)  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<java.lang.Object> asIterator ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> asKeyValueIterator ()  { throw new RuntimeException(); }
  public   JavaDeserializationStream (java.io.InputStream in, java.lang.ClassLoader loader)  { throw new RuntimeException(); }
  private  java.io.ObjectInputStream objIn ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T readObject (scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
