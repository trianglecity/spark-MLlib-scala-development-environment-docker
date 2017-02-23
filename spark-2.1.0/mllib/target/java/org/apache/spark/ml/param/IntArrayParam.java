package org.apache.spark.ml.param;
/**
 * :: DeveloperApi ::
 * Specialized version of <code>Param[Array[Int}</code> for Java.
 */
public  class IntArrayParam extends org.apache.spark.ml.param.Param<int[]> {
  public   IntArrayParam (org.apache.spark.ml.param.Params parent, java.lang.String name, java.lang.String doc, scala.Function1<int[], java.lang.Object> isValid)  { throw new RuntimeException(); }
  public   IntArrayParam (org.apache.spark.ml.param.Params parent, java.lang.String name, java.lang.String doc)  { throw new RuntimeException(); }
  /** Creates a param pair with a {@link java.util.List} of values (for Java and Python). */
  public  org.apache.spark.ml.param.ParamPair<int[]> w (java.util.List<java.lang.Integer> value)  { throw new RuntimeException(); }
  public  java.lang.String jsonEncode (int[] value)  { throw new RuntimeException(); }
  public  int[] jsonDecode (java.lang.String json)  { throw new RuntimeException(); }
}
