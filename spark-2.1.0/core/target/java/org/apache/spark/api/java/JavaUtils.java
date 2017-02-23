package org.apache.spark.api.java;
public  class JavaUtils {
  static public  class SerializableMapWrapper<A extends java.lang.Object, B extends java.lang.Object> extends java.util.AbstractMap<A, B> implements java.io.Serializable {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   SerializableMapWrapper (scala.collection.Map<A, B> underlying)  { throw new RuntimeException(); }
    public  int size ()  { throw new RuntimeException(); }
    public  B get (java.lang.Object key)  { throw new RuntimeException(); }
    public  java.util.Set<java.util.Map.Entry<A, B>> entrySet ()  { throw new RuntimeException(); }
  }
  static public <T extends java.lang.Object> org.apache.spark.api.java.Optional<T> optionToOptional (scala.Option<T> option)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.apache.spark.api.java.JavaUtils.SerializableMapWrapper<A, B> mapAsSerializableJavaMap (scala.collection.Map<A, B> underlying)  { throw new RuntimeException(); }
}
