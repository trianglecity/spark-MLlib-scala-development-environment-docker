package org.apache.spark.ml;
/**
 * :: DeveloperApi ::
 * Abstract class for transformers that take one input column, apply transformation, and output the
 * result as a new column.
 */
public abstract class UnaryTransformer<IN extends java.lang.Object, OUT extends java.lang.Object, T extends org.apache.spark.ml.UnaryTransformer<IN, OUT, T>> extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.UnaryTransformer), List(TypeTree().setOriginal(Ident(TypeName("IN"))), TypeTree().setOriginal(Ident(TypeName("OUT"))), TypeTree().setOriginal(Ident(TypeName("T"))))))))
  public   UnaryTransformer ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  T setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  T setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Creates the transform function using the given param map. The input param map already takes
   * account of the embedded param map. So the param values should be determined solely by the input
   * param map.
   * @return (undocumented)
   */
  protected abstract  scala.Function1<IN, OUT> createTransformFunc ()  ;
  /**
   * Returns the data type of the output column.
   * @return (undocumented)
   */
  protected abstract  org.apache.spark.sql.types.DataType outputDataType ()  ;
  /**
   * Validates the input type. Throw an exception if it is invalid.
   * @param inputType (undocumented)
   */
  protected  void validateInputType (org.apache.spark.sql.types.DataType inputType)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  T copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
