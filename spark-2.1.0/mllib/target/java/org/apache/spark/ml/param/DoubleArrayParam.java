package org.apache.spark.ml.param;
/**
 * :: DeveloperApi ::
 * Specialized version of <code>Param[Array[Double}</code> for Java.
 */
public  class DoubleArrayParam extends org.apache.spark.ml.param.Param<double[]> {
  public   DoubleArrayParam (org.apache.spark.ml.param.Params parent, java.lang.String name, java.lang.String doc, scala.Function1<double[], java.lang.Object> isValid)  { throw new RuntimeException(); }
  public   DoubleArrayParam (org.apache.spark.ml.param.Params parent, java.lang.String name, java.lang.String doc)  { throw new RuntimeException(); }
  /** Creates a param pair with a {@link java.util.List} of values (for Java and Python). */
  public  org.apache.spark.ml.param.ParamPair<double[]> w (java.util.List<java.lang.Double> value)  { throw new RuntimeException(); }
  public  java.lang.String jsonEncode (double[] value)  { throw new RuntimeException(); }
  public  double[] jsonDecode (java.lang.String json)  { throw new RuntimeException(); }
}
