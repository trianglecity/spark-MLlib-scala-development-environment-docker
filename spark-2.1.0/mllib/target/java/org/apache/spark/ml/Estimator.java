package org.apache.spark.ml;
/**
 * :: DeveloperApi ::
 * Abstract class for estimators that fit models to data.
 */
public abstract class Estimator<M extends org.apache.spark.ml.Model<M>> extends org.apache.spark.ml.PipelineStage {
  /**
   * Fits a single model to the input data with optional parameters.
   * <p>
   * @param dataset input dataset
   * @param firstParamPair the first param pair, overrides embedded params
   * @param otherParamPairs other param pairs.  These values override any specified in this
   *                        Estimator's embedded ParamMap.
   * @return fitted model
   */
  public  M fit (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamPair<?> firstParamPair, org.apache.spark.ml.param.ParamPair<?>... otherParamPairs)  { throw new RuntimeException(); }
  // not preceding
  public   Estimator ()  { throw new RuntimeException(); }
  /**
   * Fits a single model to the input data with optional parameters.
   * <p>
   * @param dataset input dataset
   * @param firstParamPair the first param pair, overrides embedded params
   * @param otherParamPairs other param pairs.  These values override any specified in this
   *                        Estimator's embedded ParamMap.
   * @return fitted model
   */
  public  M fit (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamPair<?> firstParamPair, scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> otherParamPairs)  { throw new RuntimeException(); }
  /**
   * Fits a single model to the input data with provided parameter map.
   * <p>
   * @param dataset input dataset
   * @param paramMap Parameter map.
   *                 These values override any specified in this Estimator's embedded ParamMap.
   * @return fitted model
   */
  public  M fit (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamMap paramMap)  { throw new RuntimeException(); }
  /**
   * Fits a model to the input data.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public abstract  M fit (org.apache.spark.sql.Dataset<?> dataset)  ;
  /**
   * Fits multiple models to the input data with multiple sets of parameters.
   * The default implementation uses a for loop on each parameter map.
   * Subclasses could override this to optimize multi-model training.
   * <p>
   * @param dataset input dataset
   * @param paramMaps An array of parameter maps.
   *                  These values override any specified in this Estimator's embedded ParamMap.
   * @return fitted models, matching the input parameter maps
   */
  public  scala.collection.Seq<M> fit (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamMap[] paramMaps)  { throw new RuntimeException(); }
  public abstract  org.apache.spark.ml.Estimator<M> copy (org.apache.spark.ml.param.ParamMap extra)  ;
}
