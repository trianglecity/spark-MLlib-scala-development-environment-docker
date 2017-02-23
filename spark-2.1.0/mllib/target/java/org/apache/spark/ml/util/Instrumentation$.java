package org.apache.spark.ml.util;
/**
 * Some common methods for logging information about a training session.
 */
public  class Instrumentation$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Instrumentation$ MODULE$ = null;
  public   Instrumentation$ ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicLong counter ()  { throw new RuntimeException(); }
  /**
   * Creates an instrumentation object for a training session.
   * @param estimator (undocumented)
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public <E extends org.apache.spark.ml.Estimator<?>> org.apache.spark.ml.util.Instrumentation<E> create (E estimator, org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Creates an instrumentation object for a training session.
   * @param estimator (undocumented)
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public <E extends org.apache.spark.ml.Estimator<?>> org.apache.spark.ml.util.Instrumentation<E> create (E estimator, org.apache.spark.rdd.RDD<?> dataset)  { throw new RuntimeException(); }
}
