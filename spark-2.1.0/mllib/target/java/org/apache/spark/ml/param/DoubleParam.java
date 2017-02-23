package org.apache.spark.ml.param;
/**
 * :: DeveloperApi ::
 * Specialized version of <code>Param[Double]</code> for Java.
 */
public  class DoubleParam extends org.apache.spark.ml.param.Param<java.lang.Object> {
  /** Encodes a param value into JValue. */
  static public  org.json4s.JsonAST.JValue jValueEncode (double value)  { throw new RuntimeException(); }
  /** Decodes a param value from JValue. */
  static public  double jValueDecode (org.json4s.JsonAST.JValue jValue)  { throw new RuntimeException(); }
  static public  java.lang.String parent ()  { throw new RuntimeException(); }
  static public  java.lang.String name ()  { throw new RuntimeException(); }
  static public  java.lang.String doc ()  { throw new RuntimeException(); }
  static public  scala.Function1<T, java.lang.Object> isValid ()  { throw new RuntimeException(); }
  static   void validate (T value)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.ParamPair<T> $minus$greater (T value)  { throw new RuntimeException(); }
  static public final  java.lang.String toString ()  { throw new RuntimeException(); }
  static public final  int hashCode ()  { throw new RuntimeException(); }
  static public final  boolean equals (Object obj)  { throw new RuntimeException(); }
  public   DoubleParam (java.lang.String parent, java.lang.String name, java.lang.String doc, scala.Function1<java.lang.Object, java.lang.Object> isValid)  { throw new RuntimeException(); }
  public   DoubleParam (java.lang.String parent, java.lang.String name, java.lang.String doc)  { throw new RuntimeException(); }
  public   DoubleParam (org.apache.spark.ml.util.Identifiable parent, java.lang.String name, java.lang.String doc, scala.Function1<java.lang.Object, java.lang.Object> isValid)  { throw new RuntimeException(); }
  public   DoubleParam (org.apache.spark.ml.util.Identifiable parent, java.lang.String name, java.lang.String doc)  { throw new RuntimeException(); }
  /** Creates a param pair with the given value (for Java). */
  public  org.apache.spark.ml.param.ParamPair<java.lang.Object> w (double value)  { throw new RuntimeException(); }
  public  java.lang.String jsonEncode (double value)  { throw new RuntimeException(); }
  public  double jsonDecode (java.lang.String json)  { throw new RuntimeException(); }
}
