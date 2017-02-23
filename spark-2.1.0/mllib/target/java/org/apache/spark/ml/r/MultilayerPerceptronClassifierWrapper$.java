package org.apache.spark.ml.r;
public  class MultilayerPerceptronClassifierWrapper$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.r.MultilayerPerceptronClassifierWrapper> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MultilayerPerceptronClassifierWrapper$ MODULE$ = null;
  public   MultilayerPerceptronClassifierWrapper$ ()  { throw new RuntimeException(); }
  public  java.lang.String PREDICTED_LABEL_INDEX_COL ()  { throw new RuntimeException(); }
  public  java.lang.String PREDICTED_LABEL_COL ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.MultilayerPerceptronClassifierWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int blockSize, int[] layers, java.lang.String solver, int maxIter, double tol, double stepSize, java.lang.String seed, double[] initialWeights)  { throw new RuntimeException(); }
  /**
   * Returns an {@link MLReader} instance for this class.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.MultilayerPerceptronClassifierWrapper> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.MultilayerPerceptronClassifierWrapper load (java.lang.String path)  { throw new RuntimeException(); }
}
