package org.apache.spark.ml.util;
/**
 * Abstract class for utility classes that can save ML instances.
 */
public abstract class MLWriter implements org.apache.spark.ml.util.BaseReadWrite, org.apache.spark.internal.Logging {
  public   MLWriter ()  { throw new RuntimeException(); }
  protected  boolean shouldOverwrite ()  { throw new RuntimeException(); }
  /**
   * Saves the ML instances to the input path.
   * @param path (undocumented)
   */
  public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  /**
   * {@link save()} handles overwriting and then calls this method.  Subclasses should override this
   * method to implement the actual saving of the instance.
   * @param path (undocumented)
   */
  protected abstract  void saveImpl (java.lang.String path)  ;
  /**
   * Overwrites if the output path already exists.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter overwrite ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter session (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter context (org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
}
