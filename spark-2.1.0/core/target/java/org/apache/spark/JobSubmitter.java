package org.apache.spark;
/**
 * Handle via which a "run" function passed to a {@link ComplexFutureAction}
 * can submit jobs for execution.
 */
public  interface JobSubmitter {
  /**
   * Submit a job for execution and return a FutureAction holding the result.
   * This is a wrapper around the same functionality provided by SparkContext
   * to enable cancellation.
   * @param rdd (undocumented)
   * @param processPartition (undocumented)
   * @param partitions (undocumented)
   * @param resultHandler (undocumented)
   * @param resultFunc (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object, U extends java.lang.Object, R extends java.lang.Object> org.apache.spark.FutureAction<R> submitJob (org.apache.spark.rdd.RDD<T> rdd, scala.Function1<scala.collection.Iterator<T>, U> processPartition, scala.collection.Seq<java.lang.Object> partitions, scala.Function2<java.lang.Object, U, scala.runtime.BoxedUnit> resultHandler, scala.Function0<R> resultFunc)  ;
}
