package org.apache.spark.ml.r;
  class GeneralizedLinearRegressionWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class GeneralizedLinearRegressionWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    public   GeneralizedLinearRegressionWrapperWriter (org.apache.spark.ml.r.GeneralizedLinearRegressionWrapper instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class GeneralizedLinearRegressionWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.GeneralizedLinearRegressionWrapper> {
    public   GeneralizedLinearRegressionWrapperReader ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.r.GeneralizedLinearRegressionWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.r.GeneralizedLinearRegressionWrapper fit (java.lang.String formula, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String family, java.lang.String link, double tol, int maxIter, java.lang.String weightCol, double regParam)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.GeneralizedLinearRegressionWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.GeneralizedLinearRegressionWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String[] rFeatures ()  { throw new RuntimeException(); }
  public  double[] rCoefficients ()  { throw new RuntimeException(); }
  public  double rDispersion ()  { throw new RuntimeException(); }
  public  double rNullDeviance ()  { throw new RuntimeException(); }
  public  double rDeviance ()  { throw new RuntimeException(); }
  public  long rResidualDegreeOfFreedomNull ()  { throw new RuntimeException(); }
  public  long rResidualDegreeOfFreedom ()  { throw new RuntimeException(); }
  public  double rAic ()  { throw new RuntimeException(); }
  public  int rNumIterations ()  { throw new RuntimeException(); }
  public  boolean isLoaded ()  { throw new RuntimeException(); }
  // not preceding
  private   GeneralizedLinearRegressionWrapper (org.apache.spark.ml.PipelineModel pipeline, java.lang.String[] rFeatures, double[] rCoefficients, double rDispersion, double rNullDeviance, double rDeviance, long rResidualDegreeOfFreedomNull, long rResidualDegreeOfFreedom, double rAic, int rNumIterations, boolean isLoaded)  { throw new RuntimeException(); }
  private  org.apache.spark.ml.regression.GeneralizedLinearRegressionModel glm ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> rDevianceResiduals ()  { throw new RuntimeException(); }
  public  java.lang.String rFamily ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> residuals (java.lang.String residualsType)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
