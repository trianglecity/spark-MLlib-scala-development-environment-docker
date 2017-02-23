package org.apache.spark.mllib.classification;
/**
 * Model for Naive Bayes Classifiers.
 * <p>
 * param:  labels list of labels
 * param:  pi log of class priors, whose dimension is C, number of labels
 * param:  theta log of class conditional probabilities, whose dimension is C-by-D,
 *              where D is number of features
 * param:  modelType The type of NB model to fit  can be "multinomial" or "bernoulli"
 */
public  class NaiveBayesModel implements org.apache.spark.mllib.classification.ClassificationModel, scala.Serializable, org.apache.spark.mllib.util.Saveable {
  static public  class SaveLoadV2_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV2_0$ MODULE$ = null;
    public   SaveLoadV2_0$ ()  { throw new RuntimeException(); }
    public  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
    /** Hard-code class name string in case it changes in the future */
    public  java.lang.String thisClassName ()  { throw new RuntimeException(); }
    /** Model data for model import/export */
    public  class Data implements scala.Product, scala.Serializable {
      public  double[] labels ()  { throw new RuntimeException(); }
      public  double[] pi ()  { throw new RuntimeException(); }
      public  double[][] theta ()  { throw new RuntimeException(); }
      public  java.lang.String modelType ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (double[] labels, double[] pi, double[][] theta, java.lang.String modelType)  { throw new RuntimeException(); }
    }
    public  class Data extends scala.runtime.AbstractFunction4<double[], double[], double[][], java.lang.String, org.apache.spark.mllib.classification.NaiveBayesModel.SaveLoadV2_0.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    public  void save (org.apache.spark.SparkContext sc, java.lang.String path, org.apache.spark.mllib.classification.NaiveBayesModel.SaveLoadV2_0.Data data)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.classification.NaiveBayesModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    public  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
    /** Hard-code class name string in case it changes in the future */
    public  java.lang.String thisClassName ()  { throw new RuntimeException(); }
    /** Model data for model import/export */
    public  class Data implements scala.Product, scala.Serializable {
      public  double[] labels ()  { throw new RuntimeException(); }
      public  double[] pi ()  { throw new RuntimeException(); }
      public  double[][] theta ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (double[] labels, double[] pi, double[][] theta)  { throw new RuntimeException(); }
    }
    public  class Data extends scala.runtime.AbstractFunction3<double[], double[], double[][], org.apache.spark.mllib.classification.NaiveBayesModel.SaveLoadV1_0.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    public  void save (org.apache.spark.SparkContext sc, java.lang.String path, org.apache.spark.mllib.classification.NaiveBayesModel.SaveLoadV1_0.Data data)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.classification.NaiveBayesModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.mllib.classification.NaiveBayesModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  double[] labels ()  { throw new RuntimeException(); }
  public  double[] pi ()  { throw new RuntimeException(); }
  public  double[][] theta ()  { throw new RuntimeException(); }
  public  java.lang.String modelType ()  { throw new RuntimeException(); }
  // not preceding
     NaiveBayesModel (double[] labels, double[] pi, double[][] theta, java.lang.String modelType)  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.linalg.DenseVector piVector ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.linalg.DenseMatrix thetaMatrix ()  { throw new RuntimeException(); }
     NaiveBayesModel (double[] labels, double[] pi, double[][] theta)  { throw new RuntimeException(); }
  /** A Java-friendly constructor that takes three Iterable parameters. */
     NaiveBayesModel (java.lang.Iterable<java.lang.Object> labels, java.lang.Iterable<java.lang.Object> pi, java.lang.Iterable<java.lang.Iterable<java.lang.Object>> theta)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.mllib.linalg.DenseMatrix> thetaMinusNegTheta ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.mllib.linalg.DenseVector> negThetaSum ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> testData)  { throw new RuntimeException(); }
  public  double predict (org.apache.spark.mllib.linalg.Vector testData)  { throw new RuntimeException(); }
  /**
   * Predict values for the given data set using the model trained.
   * <p>
   * @param testData RDD representing data points to be predicted
   * @return an RDD[Vector] where each entry contains the predicted posterior class probabilities,
   *         in the same order as class labels
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> predictProbabilities (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> testData)  { throw new RuntimeException(); }
  /**
   * Predict posterior class probabilities for a single data point using the model trained.
   * <p>
   * @param testData array representing a single data point
   * @return predicted posterior class probabilities from the trained model,
   *         in the same order as class labels
   */
  public  org.apache.spark.mllib.linalg.Vector predictProbabilities (org.apache.spark.mllib.linalg.Vector testData)  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.linalg.DenseVector multinomialCalculation (org.apache.spark.mllib.linalg.Vector testData)  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.linalg.DenseVector bernoulliCalculation (org.apache.spark.mllib.linalg.Vector testData)  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.linalg.DenseVector posteriorProbabilities (org.apache.spark.mllib.linalg.DenseVector logProb)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
}
