package org.apache.spark.api.r;
public  class RRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RRDD$ MODULE$ = null;
  public   RRDD$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaSparkContext createSparkContext (java.lang.String master, java.lang.String appName, java.lang.String sparkHome, java.lang.String[] jars, java.util.Map<java.lang.Object, java.lang.Object> sparkEnvirMap, java.util.Map<java.lang.Object, java.lang.Object> sparkExecutorEnvMap)  { throw new RuntimeException(); }
  /**
   * Create an RRDD given a sequence of byte arrays. Used to create RRDD when <code>parallelize</code> is
   * called from R.
   * @param jsc (undocumented)
   * @param arr (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> createRDDFromArray (org.apache.spark.api.java.JavaSparkContext jsc, byte[][] arr)  { throw new RuntimeException(); }
  /**
   * Create an RRDD given a temporary file name. This is used to create RRDD when parallelize is
   * called on large R objects.
   * <p>
   * @param fileName name of temporary file on driver machine
   * @param parallelism number of slices defaults to 4
   * @param jsc (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> createRDDFromFile (org.apache.spark.api.java.JavaSparkContext jsc, java.lang.String fileName, int parallelism)  { throw new RuntimeException(); }
}
