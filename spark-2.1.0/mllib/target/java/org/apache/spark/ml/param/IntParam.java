package org.apache.spark.ml.param;
/**
 * :: DeveloperApi ::
 * Specialized version of <code>Param[Int]</code> for Java.
 */
public  class IntParam extends org.apache.spark.ml.param.Param<java.lang.Object> {
  public   IntParam (java.lang.String parent, java.lang.String name, java.lang.String doc, scala.Function1<java.lang.Object, java.lang.Object> isValid)  { throw new RuntimeException(); }
  public   IntParam (java.lang.String parent, java.lang.String name, java.lang.String doc)  { throw new RuntimeException(); }
  public   IntParam (org.apache.spark.ml.util.Identifiable parent, java.lang.String name, java.lang.String doc, scala.Function1<java.lang.Object, java.lang.Object> isValid)  { throw new RuntimeException(); }
  public   IntParam (org.apache.spark.ml.util.Identifiable parent, java.lang.String name, java.lang.String doc)  { throw new RuntimeException(); }
  /** Creates a param pair with the given value (for Java). */
  public  org.apache.spark.ml.param.ParamPair<java.lang.Object> w (int value)  { throw new RuntimeException(); }
  public  java.lang.String jsonEncode (int value)  { throw new RuntimeException(); }
  public  int jsonDecode (java.lang.String json)  { throw new RuntimeException(); }
}
