package org.apache.spark.ml.r;
  class RandomForestRegressorWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class RandomForestRegressorWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   RandomForestRegressorWrapperWriter (org.apache.spark.ml.r.RandomForestRegressorWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class RandomForestRegressorWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.RandomForestRegressorWrapper> {
    public   RandomForestRegressorWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.RandomForestRegressorWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.RandomForestRegressorWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, int maxDepth, int maxBins, int numTrees, java.lang.String impurity, int minInstancesPerNode, double minInfoGain, int checkpointInterval, java.lang.String featureSubsetStrategy, java.lang.String seed, double subsamplingRate, int maxMemoryInMB, boolean cacheNodeIds)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.RandomForestRegressorWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.RandomForestRegressorWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String formula ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  // not preceding
  private   RandomForestRegressorWrapper (org.apache.spark.ml.PipelineModel pipeline, java.lang.String formula, java.lang.String[] features)  { throw new RuntimeException(); }
  private  org.apache.spark.ml.regression.RandomForestRegressionModel rfrModel ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector featureImportances ()  { throw new RuntimeException(); }
  public  int numTrees ()  { throw new RuntimeException(); }
  public  double[] treeWeights ()  { throw new RuntimeException(); }
  public  java.lang.String summary ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
