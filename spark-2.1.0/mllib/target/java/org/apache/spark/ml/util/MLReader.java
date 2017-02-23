package org.apache.spark.ml.util;
/**
 * Abstract class for utility classes that can load ML instances.
 * <p>
 * @tparam T ML instance type
 */
public abstract class MLReader<T extends java.lang.Object> implements org.apache.spark.ml.util.BaseReadWrite {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   MLReader ()  { throw new RuntimeException(); }
  /**
   * Loads the ML component from the input path.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public abstract  T load (java.lang.String path)  ;
  public  org.apache.spark.ml.util.MLReader<T> session (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<T> context (org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
}
