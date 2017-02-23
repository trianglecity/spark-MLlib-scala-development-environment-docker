package org.apache.spark.mllib.util;
/**
 * :: DeveloperApi ::
 * <p>
 * Trait for models and transformers which may be saved as files.
 * This should be inherited by the class which implements model instances.
 */
public  interface Saveable {
  /**
   * Save this model to the given path.
   * <p>
   * This saves:
   *  - human-readable (JSON) model metadata to path/metadata/
   *  - Parquet formatted data to path/data/
   * <p>
   * The model may be loaded using <code>Loader.load</code>.
   * <p>
   * @param sc  Spark context used to save model data.
   * @param path  Path specifying the directory in which to save this model.
   *              If the directory already exists, this method throws an exception.
   */
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  ;
  /** Current version of model save/load format. */
  public  java.lang.String formatVersion ()  ;
}
