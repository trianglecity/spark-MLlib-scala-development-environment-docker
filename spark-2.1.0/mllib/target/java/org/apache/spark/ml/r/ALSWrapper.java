package org.apache.spark.ml.r;
  class ALSWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class ALSWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   ALSWrapperWriter (org.apache.spark.ml.r.ALSWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class ALSWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.ALSWrapper> {
    public   ALSWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.ALSWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.ALSWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String ratingCol, java.lang.String userCol, java.lang.String itemCol, int rank, double regParam, int maxIter, boolean implicitPrefs, double alpha, boolean nonnegative, int numUserBlocks, int numItemBlocks, int checkpointInterval, int seed)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.ALSWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.ALSWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  org.apache.spark.ml.recommendation.ALSModel alsModel ()  { throw new RuntimeException(); }
  public  java.lang.String ratingCol ()  { throw new RuntimeException(); }
  // not preceding
  private   ALSWrapper (org.apache.spark.ml.recommendation.ALSModel alsModel, java.lang.String ratingCol)  { throw new RuntimeException(); }
  public  java.lang.String userCol ()  { throw new RuntimeException(); }
  public  java.lang.String itemCol ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> userFactors ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> itemFactors ()  { throw new RuntimeException(); }
  public  int rank ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
