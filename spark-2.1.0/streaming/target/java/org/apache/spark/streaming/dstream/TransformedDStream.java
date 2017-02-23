package org.apache.spark.streaming.dstream;
  class TransformedDStream<U extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<U> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   TransformedDStream (scala.collection.Seq<org.apache.spark.streaming.dstream.DStream<?>> parents, scala.Function2<scala.collection.Seq<org.apache.spark.rdd.RDD<?>>, org.apache.spark.streaming.Time, org.apache.spark.rdd.RDD<U>> transformFunc, scala.reflect.ClassTag<U> evidence$1)  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<U>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  /**
   * Wrap a body of code such that the call site and operation scope
   * information are passed to the RDDs created in this body properly.
   * This has been overridden to make sure that <code>displayInnerRDDOps</code> is always <code>true</code>, that is,
   * the inner scopes and callsites of RDDs generated in <code>DStream.transform</code> are always
   * displayed in the UI.
   * @param time (undocumented)
   * @param displayInnerRDDOps (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  protected <U extends java.lang.Object> U createRDDWithLocalProperties (org.apache.spark.streaming.Time time, boolean displayInnerRDDOps, scala.Function0<U> body)  { throw new RuntimeException(); }
}
