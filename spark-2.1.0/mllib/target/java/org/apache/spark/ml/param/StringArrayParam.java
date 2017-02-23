package org.apache.spark.ml.param;
/**
 * :: DeveloperApi ::
 * Specialized version of <code>Param[Array[String}</code> for Java.
 */
public  class StringArrayParam extends org.apache.spark.ml.param.Param<java.lang.String[]> {
  public   StringArrayParam (org.apache.spark.ml.param.Params parent, java.lang.String name, java.lang.String doc, scala.Function1<java.lang.String[], java.lang.Object> isValid)  { throw new RuntimeException(); }
  public   StringArrayParam (org.apache.spark.ml.param.Params parent, java.lang.String name, java.lang.String doc)  { throw new RuntimeException(); }
  /** Creates a param pair with a {@link java.util.List} of values (for Java and Python). */
  public  org.apache.spark.ml.param.ParamPair<java.lang.String[]> w (java.util.List<java.lang.String> value)  { throw new RuntimeException(); }
  public  java.lang.String jsonEncode (java.lang.String[] value)  { throw new RuntimeException(); }
  public  java.lang.String[] jsonDecode (java.lang.String json)  { throw new RuntimeException(); }
}
