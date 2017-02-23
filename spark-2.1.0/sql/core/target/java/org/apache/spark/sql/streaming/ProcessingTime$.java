package org.apache.spark.sql.streaming;
/**
 * :: Experimental ::
 * Used to create {@link ProcessingTime} triggers for {@link StreamingQuery}s.
 * <p>
 * @since 2.0.0
 */
public  class ProcessingTime$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ProcessingTime$ MODULE$ = null;
  public   ProcessingTime$ ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.streaming.ProcessingTime apply (java.lang.String interval)  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.streaming.ProcessingTime apply (scala.concurrent.duration.Duration interval)  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.streaming.ProcessingTime create (java.lang.String interval)  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.streaming.ProcessingTime create (long interval, java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
}
