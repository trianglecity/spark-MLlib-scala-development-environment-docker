package org.apache.spark.ml.r;
  class GBTRegressorWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class GBTRegressorWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   GBTRegressorWrapperWriter (org.apache.spark.ml.r.GBTRegressorWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class GBTRegressorWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.GBTRegressorWrapper> {
    public   GBTRegressorWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.GBTRegressorWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.GBTRegressorWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int maxDepth, int maxBins, int maxIter, double stepSize, int minInstancesPerNode, double minInfoGain, int checkpointInterval, java.lang.String lossType, java.lang.String seed, double subsamplingRate, int maxMemoryInMB, boolean cacheNodeIds)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.GBTRegressorWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.GBTRegressorWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String formula ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  // not preceding
  private   GBTRegressorWrapper (org.apache.spark.ml.PipelineModel pipeline, java.lang.String formula, java.lang.String[] features)  { throw new RuntimeException(); }
  private  org.apache.spark.ml.regression.GBTRegressionModel gbtrModel ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector featureImportances ()  { throw new RuntimeException(); }
  public  int numTrees ()  { throw new RuntimeException(); }
  public  double[] treeWeights ()  { throw new RuntimeException(); }
  public  java.lang.String summary ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
