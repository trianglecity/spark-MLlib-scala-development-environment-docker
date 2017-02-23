package org.apache.spark.ml.r;
  class MultilayerPerceptronClassifierWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class MultilayerPerceptronClassifierWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.MultilayerPerceptronClassifierWrapper> {
    public   MultilayerPerceptronClassifierWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.MultilayerPerceptronClassifierWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class MultilayerPerceptronClassifierWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   MultilayerPerceptronClassifierWrapperWriter (org.apache.spark.ml.r.MultilayerPerceptronClassifierWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  java.lang.String PREDICTED_LABEL_INDEX_COL ()  { throw new RuntimeException(); }
  static public  java.lang.String PREDICTED_LABEL_COL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.MultilayerPerceptronClassifierWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int blockSize, int[] layers, java.lang.String solver, int maxIter, double tol, double stepSize, java.lang.String seed, double[] initialWeights)  { throw new RuntimeException(); }
  /**
   * Returns an {@link MLReader} instance for this class.
   * @return (undocumented)
   */
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.MultilayerPerceptronClassifierWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.MultilayerPerceptronClassifierWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  // not preceding
  private   MultilayerPerceptronClassifierWrapper (org.apache.spark.ml.PipelineModel pipeline)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel mlpModel ()  { throw new RuntimeException(); }
  public  double[] weights ()  { throw new RuntimeException(); }
  public  int[] layers ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Returns an {@link MLWriter} instance for this ML instance.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
