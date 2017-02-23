package org.apache.spark.ml.clustering;
public  class LDAParams$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LDAParams$ MODULE$ = null;
  public   LDAParams$ ()  { throw new RuntimeException(); }
  /**
   * Equivalent to {@link DefaultParamsReader.getAndSetParams()}, but handles {@link LDA} and {@link LDAModel}
   * formats saved with Spark 1.6, which differ from the formats in Spark 2.0+.
   * <p>
   * @param model    {@link LDA} or {@link LDAModel} instance.  This instance will be modified with
   *                 {@link Param} values extracted from metadata.
   * @param metadata Loaded model metadata
   */
  public  void getAndSetParams (org.apache.spark.ml.clustering.LDAParams model, org.apache.spark.ml.util.DefaultParamsReader.Metadata metadata)  { throw new RuntimeException(); }
}
