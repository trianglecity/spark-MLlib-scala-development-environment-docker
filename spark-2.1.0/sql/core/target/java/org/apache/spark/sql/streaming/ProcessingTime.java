package org.apache.spark.sql.streaming;
/**
 * :: Experimental ::
 * A trigger that runs a query periodically based on the processing time. If <code>interval</code> is 0,
 * the query will run as fast as possible.
 * <p>
 * Scala Example:
 * <pre><code>
 *   df.write.trigger(ProcessingTime("10 seconds"))
 *
 *   import scala.concurrent.duration._
 *   df.write.trigger(ProcessingTime(10.seconds))
 * </code></pre>
 * <p>
 * Java Example:
 * <pre><code>
 *   df.write.trigger(ProcessingTime.create("10 seconds"))
 *
 *   import java.util.concurrent.TimeUnit
 *   df.write.trigger(ProcessingTime.create(10, TimeUnit.SECONDS))
 * </code></pre>
 * <p>
 * @since 2.0.0
 */
public  class ProcessingTime implements org.apache.spark.sql.streaming.Trigger, scala.Product, scala.Serializable {
  /**
   * Create a {@link ProcessingTime}. If <code>interval</code> is 0, the query will run as fast as possible.
   * <p>
   * Example:
   * <pre><code>
   *   df.write.trigger(ProcessingTime("10 seconds"))
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @param interval (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.streaming.ProcessingTime apply (java.lang.String interval)  { throw new RuntimeException(); }
  /**
   * Create a {@link ProcessingTime}. If <code>interval</code> is 0, the query will run as fast as possible.
   * <p>
   * Example:
   * <pre><code>
   *   import scala.concurrent.duration._
   *   df.write.trigger(ProcessingTime(10.seconds))
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @param interval (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.streaming.ProcessingTime apply (scala.concurrent.duration.Duration interval)  { throw new RuntimeException(); }
  /**
   * Create a {@link ProcessingTime}. If <code>interval</code> is 0, the query will run as fast as possible.
   * <p>
   * Example:
   * <pre><code>
   *   df.write.trigger(ProcessingTime.create("10 seconds"))
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @param interval (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.streaming.ProcessingTime create (java.lang.String interval)  { throw new RuntimeException(); }
  /**
   * Create a {@link ProcessingTime}. If <code>interval</code> is 0, the query will run as fast as possible.
   * <p>
   * Example:
   * <pre><code>
   *   import java.util.concurrent.TimeUnit
   *   df.write.trigger(ProcessingTime.create(10, TimeUnit.SECONDS))
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @param interval (undocumented)
   * @param unit (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.streaming.ProcessingTime create (long interval, java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long intervalMs ()  { throw new RuntimeException(); }
  // not preceding
  public   ProcessingTime (long intervalMs)  { throw new RuntimeException(); }
}
