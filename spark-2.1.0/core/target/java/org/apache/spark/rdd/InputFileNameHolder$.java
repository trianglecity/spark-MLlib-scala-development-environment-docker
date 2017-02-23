package org.apache.spark.rdd;
/**
 * This holds file names of the current Spark task. This is used in HadoopRDD,
 * FileScanRDD, NewHadoopRDD and InputFileName function in Spark SQL.
 * <p>
 * The returned value should never be null but empty string if it is unknown.
 */
public  class InputFileNameHolder$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InputFileNameHolder$ MODULE$ = null;
  public   InputFileNameHolder$ ()  { throw new RuntimeException(); }
  /**
   * Returns the holding file name or empty string if it is unknown.
   * @return (undocumented)
   */
  public  org.apache.spark.unsafe.types.UTF8String getInputFileName ()  { throw new RuntimeException(); }
    void setInputFileName (java.lang.String file)  { throw new RuntimeException(); }
    void unsetInputFileName ()  { throw new RuntimeException(); }
}
