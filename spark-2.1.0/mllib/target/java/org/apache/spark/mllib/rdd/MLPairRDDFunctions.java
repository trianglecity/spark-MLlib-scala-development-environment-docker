package org.apache.spark.mllib.rdd;
/**
 * :: DeveloperApi ::
 * Machine learning specific Pair RDD functions.
 */
public  class MLPairRDDFunctions<K extends java.lang.Object, V extends java.lang.Object> implements scala.Serializable {
  /** Implicit conversion from a pair RDD to MLPairRDDFunctions. */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.mllib.rdd.MLPairRDDFunctions<K, V> fromPairRDD (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, scala.reflect.ClassTag<K> evidence$3, scala.reflect.ClassTag<V> evidence$4)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   MLPairRDDFunctions (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> self, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
  /**
   * Returns the top k (largest) elements for each key from this RDD as defined by the specified
   * implicit Ordering[T].
   * If the number of elements for a certain key is less than k, all of them will be returned.
   * <p>
   * @param num k, the number of top elements to return
   * @param ord the implicit ordering for T
   * @return an RDD that contains the top k values for each key
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, java.lang.Object>> topByKey (int num, scala.math.Ordering<V> ord)  { throw new RuntimeException(); }
}
