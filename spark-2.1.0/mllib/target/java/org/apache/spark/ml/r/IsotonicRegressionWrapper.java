package org.apache.spark.ml.r;
  class IsotonicRegressionWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class IsotonicRegressionWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   IsotonicRegressionWrapperWriter (org.apache.spark.ml.r.IsotonicRegressionWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class IsotonicRegressionWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.IsotonicRegressionWrapper> {
    public   IsotonicRegressionWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.IsotonicRegressionWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.IsotonicRegressionWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, boolean isotonic, int featureIndex, java.lang.String weightCol)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.IsotonicRegressionWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.IsotonicRegressionWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  // not preceding
  private   IsotonicRegressionWrapper (org.apache.spark.ml.PipelineModel pipeline, java.lang.String[] features)  { throw new RuntimeException(); }
  private  org.apache.spark.ml.regression.IsotonicRegressionModel isotonicRegressionModel ()  { throw new RuntimeException(); }
  public  double[] boundaries ()  { throw new RuntimeException(); }
  public  double[] predictions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
