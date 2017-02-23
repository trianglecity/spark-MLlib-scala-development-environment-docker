package org.apache.spark.ml;
/**
 * :: DeveloperApi ::
 * Abstract class for transformers that transform one dataset into another.
 */
public abstract class Transformer extends org.apache.spark.ml.PipelineStage {
  /**
   * Transforms the dataset with optional parameters
   * @param dataset input dataset
   * @param firstParamPair the first param pair, overwrite embedded params
   * @param otherParamPairs other param pairs, overwrite embedded params
   * @return transformed dataset
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamPair<?> firstParamPair, org.apache.spark.ml.param.ParamPair<?>... otherParamPairs)  { throw new RuntimeException(); }
  // not preceding
  public   Transformer ()  { throw new RuntimeException(); }
  /**
   * Transforms the dataset with optional parameters
   * @param dataset input dataset
   * @param firstParamPair the first param pair, overwrite embedded params
   * @param otherParamPairs other param pairs, overwrite embedded params
   * @return transformed dataset
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamPair<?> firstParamPair, scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> otherParamPairs)  { throw new RuntimeException(); }
  /**
   * Transforms the dataset with provided parameter map as additional parameters.
   * @param dataset input dataset
   * @param paramMap additional parameters, overwrite embedded params
   * @return transformed dataset
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamMap paramMap)  { throw new RuntimeException(); }
  /**
   * Transforms the input dataset.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  ;
  public abstract  org.apache.spark.ml.Transformer copy (org.apache.spark.ml.param.ParamMap extra)  ;
}
