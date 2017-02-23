package org.apache.spark.status.api.v1;
/**
 * Helper for getting distributions from nested metric types.
 */
 abstract class MetricHelper<I extends java.lang.Object, O extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   MetricHelper (scala.collection.Seq<org.apache.spark.ui.jobs.UIData.TaskMetricsUIData> rawMetrics, double[] quantiles)  { throw new RuntimeException(); }
  public abstract  I getSubmetrics (org.apache.spark.ui.jobs.UIData.TaskMetricsUIData raw)  ;
  public abstract  O build ()  ;
  public  scala.collection.Seq<I> data ()  { throw new RuntimeException(); }
  /** applies the given function to all input metrics, and returns the quantiles */
  public  scala.collection.IndexedSeq<java.lang.Object> submetricQuantiles (scala.Function1<I, java.lang.Object> f)  { throw new RuntimeException(); }
}
