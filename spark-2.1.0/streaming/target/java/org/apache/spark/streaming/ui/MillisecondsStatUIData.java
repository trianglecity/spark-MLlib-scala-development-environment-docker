package org.apache.spark.streaming.ui;
/**
 * A helper class for "scheduling delay", "processing time" and "total delay" to generate data that
 * will be used in the timeline and histogram graphs.
 * <p>
 * param:  data (batchTime, milliseconds). "milliseconds" is something like "processing time".
 */
  class MillisecondsStatUIData {
  public   MillisecondsStatUIData (scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> data)  { throw new RuntimeException(); }
  /**
   * Converting the original data as per <code>unit</code>.
   * @param unit (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> timelineData (java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  /**
   * Converting the original data as per <code>unit</code>.
   * @param unit (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> histogramData (java.util.concurrent.TimeUnit unit)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> avg ()  { throw new RuntimeException(); }
  public  java.lang.String formattedAvg ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> max ()  { throw new RuntimeException(); }
}
