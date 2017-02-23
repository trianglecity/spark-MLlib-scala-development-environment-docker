package org.apache.spark.ml.param;
/**
 * :: DeveloperApi ::
 * Specialized version of <code>Param[Long]</code> for Java.
 */
public  class LongParam extends org.apache.spark.ml.param.Param<java.lang.Object> {
  public   LongParam (java.lang.String parent, java.lang.String name, java.lang.String doc, scala.Function1<java.lang.Object, java.lang.Object> isValid)  { throw new RuntimeException(); }
  public   LongParam (java.lang.String parent, java.lang.String name, java.lang.String doc)  { throw new RuntimeException(); }
  public   LongParam (org.apache.spark.ml.util.Identifiable parent, java.lang.String name, java.lang.String doc, scala.Function1<java.lang.Object, java.lang.Object> isValid)  { throw new RuntimeException(); }
  public   LongParam (org.apache.spark.ml.util.Identifiable parent, java.lang.String name, java.lang.String doc)  { throw new RuntimeException(); }
  /** Creates a param pair with the given value (for Java). */
  public  org.apache.spark.ml.param.ParamPair<java.lang.Object> w (long value)  { throw new RuntimeException(); }
  public  java.lang.String jsonEncode (long value)  { throw new RuntimeException(); }
  public  long jsonDecode (java.lang.String json)  { throw new RuntimeException(); }
}
