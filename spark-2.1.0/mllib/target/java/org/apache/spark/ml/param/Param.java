package org.apache.spark.ml.param;
/**
 * :: DeveloperApi ::
 * A param with self-contained documentation and optionally default value. Primitive-typed param
 * should use the specialized versions, which are more friendly to Java users.
 * <p>
 * param:  parent parent object
 * param:  name param name
 * param:  doc documentation
 * param:  isValid optional validation method which indicates if a value is valid.
 *                See {@link ParamValidators} for factory methods for common validation functions.
 * @tparam T param value type
 */
public  class Param<T extends java.lang.Object> implements scala.Serializable {
  public  java.lang.String parent ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String doc ()  { throw new RuntimeException(); }
  public  scala.Function1<T, java.lang.Object> isValid ()  { throw new RuntimeException(); }
  // not preceding
  public   Param (java.lang.String parent, java.lang.String name, java.lang.String doc, scala.Function1<T, java.lang.Object> isValid)  { throw new RuntimeException(); }
  public   Param (org.apache.spark.ml.util.Identifiable parent, java.lang.String name, java.lang.String doc, scala.Function1<T, java.lang.Object> isValid)  { throw new RuntimeException(); }
  public   Param (java.lang.String parent, java.lang.String name, java.lang.String doc)  { throw new RuntimeException(); }
  public   Param (org.apache.spark.ml.util.Identifiable parent, java.lang.String name, java.lang.String doc)  { throw new RuntimeException(); }
  /**
   * Assert that the given value is valid for this parameter.
   * <p>
   * Note: Parameter checks involving interactions between multiple parameters and input/output
   * columns should be implemented in {@link org.apache.spark.ml.PipelineStage.transformSchema()}.
   * <p>
   * DEVELOPERS: This method is only called by {@link ParamPair}, which means that all parameters
   *             should be specified via {@link ParamPair}.
   * <p>
   * @throws IllegalArgumentException if the value is invalid
   * @param value (undocumented)
   */
    void validate (T value)  { throw new RuntimeException(); }
  /** Creates a param pair with the given value (for Java). */
  public  org.apache.spark.ml.param.ParamPair<T> w (T value)  { throw new RuntimeException(); }
  /** Encodes a param value into JSON, which can be decoded by `jsonDecode()`. */
  public  java.lang.String jsonEncode (T value)  { throw new RuntimeException(); }
  /** Decodes a param value from JSON. */
  public  T jsonDecode (java.lang.String json)  { throw new RuntimeException(); }
  public final  java.lang.String toString ()  { throw new RuntimeException(); }
  public final  int hashCode ()  { throw new RuntimeException(); }
  public final  boolean equals (Object obj)  { throw new RuntimeException(); }
}
