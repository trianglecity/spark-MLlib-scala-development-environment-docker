package org.apache.spark.ml.util;
/**
 * Trait for {@link MLWriter} and {@link MLReader}.
 */
  interface BaseReadWrite {
  public  scala.Option<org.apache.spark.sql.SparkSession> optionSparkSession ()  ;
  /**
   * Sets the Spark SQLContext to use for saving/loading.
   * @param sqlContext (undocumented)
   * @return (undocumented)
   *
   * @deprecated Use session instead, This method will be removed in 2.2.0. Since 2.0.0. 
  */
  public  org.apache.spark.ml.util.BaseReadWrite context (org.apache.spark.sql.SQLContext sqlContext)  ;
  /**
   * Sets the Spark Session to use for saving/loading.
   * @param sparkSession (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.BaseReadWrite session (org.apache.spark.sql.SparkSession sparkSession)  ;
  /**
   * Returns the user-specified Spark Session or the default.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SparkSession sparkSession ()  ;
  /**
   * Returns the user-specified SQL context or the default.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SQLContext sqlContext ()  ;
  /** Returns the underlying `SparkContext`. */
  public  org.apache.spark.SparkContext sc ()  ;
}
