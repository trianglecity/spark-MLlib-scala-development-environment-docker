package org.apache.spark.examples.ml;
/**
 * An example demonstrating creating a custom {@link org.apache.spark.ml.Transformer} using
 * the {@link UnaryTransformer} abstraction.
 * <p>
 * Run with
 * <pre><code>
 * bin/run-example ml.UnaryTransformerExample
 * </code></pre>
 */
public  class UnaryTransformerExample {
  /**
   * Simple Transformer which adds a constant value to input Doubles.
   * <p>
   * {@link UnaryTransformer} can be used to create a stage usable within Pipelines.
   * It defines parameters for specifying input and output columns:
   * {@link UnaryTransformer.inputCol} and {@link UnaryTransformer.outputCol}.
   * It can optionally handle schema validation.
   * <p>
   * {@link DefaultParamsWritable} provides a default implementation for persisting instances
   * of this Transformer.
   */
  static public  class MyTransformer extends org.apache.spark.ml.UnaryTransformer<java.lang.Object, java.lang.Object, org.apache.spark.examples.ml.UnaryTransformerExample.MyTransformer> implements org.apache.spark.ml.util.DefaultParamsWritable {
    public  java.lang.String uid ()  { throw new RuntimeException(); }
    // not preceding
    public   MyTransformer (java.lang.String uid)  { throw new RuntimeException(); }
    public final  org.apache.spark.ml.param.DoubleParam shift ()  { throw new RuntimeException(); }
    public  double getShift ()  { throw new RuntimeException(); }
    public  org.apache.spark.examples.ml.UnaryTransformerExample.MyTransformer setShift (double value)  { throw new RuntimeException(); }
    public   MyTransformer ()  { throw new RuntimeException(); }
    protected  scala.Function1<java.lang.Object, java.lang.Object> createTransformFunc ()  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.types.DataType outputDataType ()  { throw new RuntimeException(); }
    protected  void validateInputType (org.apache.spark.sql.types.DataType inputType)  { throw new RuntimeException(); }
  }
  /**
   * Companion object for our simple Transformer.
   * <p>
   * {@link DefaultParamsReadable} provides a default implementation for loading instances
   * of this Transformer which were persisted using {@link DefaultParamsWritable}.
   */
  static public  class MyTransformer$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.examples.ml.UnaryTransformerExample.MyTransformer>, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MyTransformer$ MODULE$ = null;
    public   MyTransformer$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
