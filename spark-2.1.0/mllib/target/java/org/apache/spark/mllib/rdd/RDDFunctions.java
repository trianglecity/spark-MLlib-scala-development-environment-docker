package org.apache.spark.mllib.rdd;
/**
 * :: DeveloperApi ::
 * Machine learning specific RDD functions.
 */
public  class RDDFunctions<T extends java.lang.Object> implements scala.Serializable {
  /** Implicit conversion from an RDD to RDDFunctions. */
  static public <T extends java.lang.Object> org.apache.spark.mllib.rdd.RDDFunctions<T> fromRDD (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   RDDFunctions (org.apache.spark.rdd.RDD<T> self, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Returns an RDD from grouping items of its parent RDD in fixed size blocks by passing a sliding
   * window over them. The ordering is first based on the partition index and then the ordering of
   * items within each partition. This is similar to sliding in Scala collections, except that it
   * becomes an empty RDD if the window size is greater than the total number of items. It needs to
   * trigger a Spark job if the parent RDD has more than one partitions and the window size is
   * greater than 1.
   * @param windowSize (undocumented)
   * @param step (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> sliding (int windowSize, int step)  { throw new RuntimeException(); }
  /**
   * <code>sliding(Int, Int)*</code> with step = 1.
   * @param windowSize (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> sliding (int windowSize)  { throw new RuntimeException(); }
}
