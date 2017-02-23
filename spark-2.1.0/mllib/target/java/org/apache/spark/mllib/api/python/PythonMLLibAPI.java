package org.apache.spark.mllib.api.python;
/**
 * The Java stubs necessary for the Python mllib bindings. It is called by Py4J on the Python side.
 */
  class PythonMLLibAPI implements scala.Serializable {
  public   PythonMLLibAPI ()  { throw new RuntimeException(); }
  /**
   * Loads and serializes labeled points saved with <code>RDD#saveAsTextFile</code>.
   * @param jsc Java SparkContext
   * @param path file or directory path in any Hadoop-supported file system URI
   * @param minPartitions min number of partitions
   * @return serialized labeled points stored in a JavaRDD of byte array
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> loadLabeledPoints (org.apache.spark.api.java.JavaSparkContext jsc, java.lang.String path, int minPartitions)  { throw new RuntimeException(); }
  /**
   * Loads and serializes vectors saved with <code>RDD#saveAsTextFile</code>.
   * @param jsc Java SparkContext
   * @param path file or directory path in any Hadoop-supported file system URI
   * @return serialized vectors in a RDD
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> loadVectors (org.apache.spark.api.java.JavaSparkContext jsc, java.lang.String path)  { throw new RuntimeException(); }
  private  java.util.List<java.lang.Object> trainRegressionModel (org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<? extends org.apache.spark.mllib.regression.GeneralizedLinearModel> learner, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
  /**
   * Return the Updater from string
   * @param regType (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.Updater getUpdaterFromString (java.lang.String regType)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib BisectingKMeans.run()
   * @param data (undocumented)
   * @param k (undocumented)
   * @param maxIterations (undocumented)
   * @param minDivisibleClusterSize (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeansModel trainBisectingKMeans (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, double minDivisibleClusterSize, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib LinearRegressionWithSGD.train()
   * @param data (undocumented)
   * @param numIterations (undocumented)
   * @param stepSize (undocumented)
   * @param miniBatchFraction (undocumented)
   * @param initialWeights (undocumented)
   * @param regParam (undocumented)
   * @param regType (undocumented)
   * @param intercept (undocumented)
   * @param validateData (undocumented)
   * @param convergenceTol (undocumented)
   * @return (undocumented)
   */
  public  java.util.List<java.lang.Object> trainLinearRegressionModelWithSGD (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, int numIterations, double stepSize, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights, double regParam, java.lang.String regType, boolean intercept, boolean validateData, double convergenceTol)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib LassoWithSGD.train()
   * @param data (undocumented)
   * @param numIterations (undocumented)
   * @param stepSize (undocumented)
   * @param regParam (undocumented)
   * @param miniBatchFraction (undocumented)
   * @param initialWeights (undocumented)
   * @param intercept (undocumented)
   * @param validateData (undocumented)
   * @param convergenceTol (undocumented)
   * @return (undocumented)
   */
  public  java.util.List<java.lang.Object> trainLassoModelWithSGD (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, int numIterations, double stepSize, double regParam, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights, boolean intercept, boolean validateData, double convergenceTol)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RidgeRegressionWithSGD.train()
   * @param data (undocumented)
   * @param numIterations (undocumented)
   * @param stepSize (undocumented)
   * @param regParam (undocumented)
   * @param miniBatchFraction (undocumented)
   * @param initialWeights (undocumented)
   * @param intercept (undocumented)
   * @param validateData (undocumented)
   * @param convergenceTol (undocumented)
   * @return (undocumented)
   */
  public  java.util.List<java.lang.Object> trainRidgeModelWithSGD (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, int numIterations, double stepSize, double regParam, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights, boolean intercept, boolean validateData, double convergenceTol)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib SVMWithSGD.train()
   * @param data (undocumented)
   * @param numIterations (undocumented)
   * @param stepSize (undocumented)
   * @param regParam (undocumented)
   * @param miniBatchFraction (undocumented)
   * @param initialWeights (undocumented)
   * @param regType (undocumented)
   * @param intercept (undocumented)
   * @param validateData (undocumented)
   * @param convergenceTol (undocumented)
   * @return (undocumented)
   */
  public  java.util.List<java.lang.Object> trainSVMModelWithSGD (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, int numIterations, double stepSize, double regParam, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights, java.lang.String regType, boolean intercept, boolean validateData, double convergenceTol)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib LogisticRegressionWithSGD.train()
   * @param data (undocumented)
   * @param numIterations (undocumented)
   * @param stepSize (undocumented)
   * @param miniBatchFraction (undocumented)
   * @param initialWeights (undocumented)
   * @param regParam (undocumented)
   * @param regType (undocumented)
   * @param intercept (undocumented)
   * @param validateData (undocumented)
   * @param convergenceTol (undocumented)
   * @return (undocumented)
   */
  public  java.util.List<java.lang.Object> trainLogisticRegressionModelWithSGD (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, int numIterations, double stepSize, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights, double regParam, java.lang.String regType, boolean intercept, boolean validateData, double convergenceTol)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib LogisticRegressionWithLBFGS.train()
   * @param data (undocumented)
   * @param numIterations (undocumented)
   * @param initialWeights (undocumented)
   * @param regParam (undocumented)
   * @param regType (undocumented)
   * @param intercept (undocumented)
   * @param corrections (undocumented)
   * @param tolerance (undocumented)
   * @param validateData (undocumented)
   * @param numClasses (undocumented)
   * @return (undocumented)
   */
  public  java.util.List<java.lang.Object> trainLogisticRegressionModelWithLBFGS (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, int numIterations, org.apache.spark.mllib.linalg.Vector initialWeights, double regParam, java.lang.String regType, boolean intercept, int corrections, double tolerance, boolean validateData, int numClasses)  { throw new RuntimeException(); }
  /**
   * Java stub for NaiveBayes.train()
   * @param data (undocumented)
   * @param lambda (undocumented)
   * @return (undocumented)
   */
  public  java.util.List<java.lang.Object> trainNaiveBayesModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, double lambda)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib IsotonicRegression.run()
   * @param data (undocumented)
   * @param isotonic (undocumented)
   * @return (undocumented)
   */
  public  java.util.List<java.lang.Object> trainIsotonicRegressionModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data, boolean isotonic)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib KMeans.run()
   * @param data (undocumented)
   * @param k (undocumented)
   * @param maxIterations (undocumented)
   * @param runs (undocumented)
   * @param initializationMode (undocumented)
   * @param seed (undocumented)
   * @param initializationSteps (undocumented)
   * @param epsilon (undocumented)
   * @param initialModel (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeansModel trainKMeansModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, int runs, java.lang.String initializationMode, java.lang.Long seed, int initializationSteps, double epsilon, java.util.ArrayList<org.apache.spark.mllib.linalg.Vector> initialModel)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib KMeansModel.computeCost()
   * @param data (undocumented)
   * @param centers (undocumented)
   * @return (undocumented)
   */
  public  double computeCostKmeansModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data, java.util.ArrayList<org.apache.spark.mllib.linalg.Vector> centers)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib GaussianMixture.run()
   * Returns a list containing weights, mean and covariance of each mixture component.
   * @param data (undocumented)
   * @param k (undocumented)
   * @param convergenceTol (undocumented)
   * @param maxIterations (undocumented)
   * @param seed (undocumented)
   * @param initialModelWeights (undocumented)
   * @param initialModelMu (undocumented)
   * @param initialModelSigma (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.api.python.GaussianMixtureModelWrapper trainGaussianMixtureModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data, int k, double convergenceTol, int maxIterations, java.lang.Long seed, java.util.ArrayList<java.lang.Object> initialModelWeights, java.util.ArrayList<org.apache.spark.mllib.linalg.Vector> initialModelMu, java.util.ArrayList<org.apache.spark.mllib.linalg.Matrix> initialModelSigma)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib GaussianMixtureModel.predictSoft()
   * @param data (undocumented)
   * @param wt (undocumented)
   * @param mu (undocumented)
   * @param si (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> predictSoftGMM (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data, org.apache.spark.mllib.linalg.Vector wt, java.lang.Object[] mu, java.lang.Object[] si)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib PowerIterationClustering.run(). This stub returns a
   * handle to the Java object instead of the content of the Java object.  Extra care
   * needs to be taken in the Python code to ensure it gets freed on exit; see the
   * Py4J documentation.
   * @param data an RDD of (i, j, s,,ij,,) tuples representing the affinity matrix.
   * @param k number of clusters.
   * @param maxIterations maximum number of iterations of the power iteration loop.
   * @param initMode the initialization mode. This can be either "random" to use
   *                 a random vector as vertex properties, or "degree" to use
   *                 normalized sum similarities. Default: random.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.PowerIterationClusteringModel trainPowerIterationClusteringModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, java.lang.String initMode)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib ALS.train().  This stub returns a handle
   * to the Java object instead of the content of the Java object.  Extra care
   * needs to be taken in the Python code to ensure it gets freed on exit; see
   * the Py4J documentation.
   * @param ratingsJRDD (undocumented)
   * @param rank (undocumented)
   * @param iterations (undocumented)
   * @param lambda (undocumented)
   * @param blocks (undocumented)
   * @param nonnegative (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainALSModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.recommendation.Rating> ratingsJRDD, int rank, int iterations, double lambda, int blocks, boolean nonnegative, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib ALS.trainImplicit().  This stub returns a
   * handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on
   * exit; see the Py4J documentation.
   * @param ratingsJRDD (undocumented)
   * @param rank (undocumented)
   * @param iterations (undocumented)
   * @param lambda (undocumented)
   * @param blocks (undocumented)
   * @param alpha (undocumented)
   * @param nonnegative (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicitALSModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.recommendation.Rating> ratingsJRDD, int rank, int iterations, double lambda, int blocks, double alpha, boolean nonnegative, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib LDA.run()
   * @param data (undocumented)
   * @param k (undocumented)
   * @param maxIterations (undocumented)
   * @param docConcentration (undocumented)
   * @param topicConcentration (undocumented)
   * @param seed (undocumented)
   * @param checkpointInterval (undocumented)
   * @param optimizer (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.api.python.LDAModelWrapper trainLDAModel (org.apache.spark.api.java.JavaRDD<java.util.List<java.lang.Object>> data, int k, int maxIterations, double docConcentration, double topicConcentration, java.lang.Long seed, int checkpointInterval, java.lang.String optimizer)  { throw new RuntimeException(); }
  /**
   * Load a LDA model
   * @param jsc (undocumented)
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.api.python.LDAModelWrapper loadLDAModel (org.apache.spark.api.java.JavaSparkContext jsc, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib FPGrowth.train().  This stub returns a handle
   * to the Java object instead of the content of the Java object.  Extra care
   * needs to be taken in the Python code to ensure it gets freed on exit; see
   * the Py4J documentation.
   * @param data (undocumented)
   * @param minSupport (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.fpm.FPGrowthModel<java.lang.Object> trainFPGrowthModel (org.apache.spark.api.java.JavaRDD<java.lang.Iterable<java.lang.Object>> data, double minSupport, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib PrefixSpan.train().  This stub returns a handle
   * to the Java object instead of the content of the Java object.  Extra care
   * needs to be taken in the Python code to ensure it gets freed on exit; see
   * the Py4J documentation.
   * @param data (undocumented)
   * @param minSupport (undocumented)
   * @param maxPatternLength (undocumented)
   * @param localProjDBSize (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.api.python.PrefixSpanModelWrapper trainPrefixSpanModel (org.apache.spark.api.java.JavaRDD<java.util.ArrayList<java.util.ArrayList<java.lang.Object>>> data, double minSupport, int maxPatternLength, int localProjDBSize)  { throw new RuntimeException(); }
  /**
   * Java stub for Normalizer.transform()
   * @param p (undocumented)
   * @param vector (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector normalizeVector (double p, org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
  /**
   * Java stub for Normalizer.transform()
   * @param p (undocumented)
   * @param rdd (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> normalizeVector (double p, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> rdd)  { throw new RuntimeException(); }
  /**
   * Java stub for StandardScaler.fit(). This stub returns a
   * handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on
   * exit; see the Py4J documentation.
   * @param withMean (undocumented)
   * @param withStd (undocumented)
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.StandardScalerModel fitStandardScaler (boolean withMean, boolean withStd, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Java stub for ChiSqSelector.fit(). This stub returns a
   * handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on
   * exit; see the Py4J documentation.
   * @param selectorType (undocumented)
   * @param numTopFeatures (undocumented)
   * @param percentile (undocumented)
   * @param fpr (undocumented)
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.ChiSqSelectorModel fitChiSqSelector (java.lang.String selectorType, int numTopFeatures, double percentile, double fpr, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data)  { throw new RuntimeException(); }
  /**
   * Java stub for PCA.fit(). This stub returns a
   * handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on
   * exit; see the Py4J documentation.
   * @param k (undocumented)
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.PCAModel fitPCA (int k, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Java stub for IDF.fit(). This stub returns a
   * handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on
   * exit; see the Py4J documentation.
   * @param minDocFreq (undocumented)
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.IDFModel fitIDF (int minDocFreq, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> dataset)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib Word2Vec fit(). This stub returns a
   * handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on
   * exit; see the Py4J documentation.
   * @param dataJRDD input JavaRDD
   * @param vectorSize size of vector
   * @param learningRate initial learning rate
   * @param numPartitions number of partitions
   * @param numIterations number of iterations
   * @param seed initial seed for random generator
   * @param windowSize size of window
   * @return A handle to java Word2VecModelWrapper instance at python side
   * @param minCount (undocumented)
   */
  public  org.apache.spark.mllib.api.python.Word2VecModelWrapper trainWord2VecModel (org.apache.spark.api.java.JavaRDD<java.util.ArrayList<java.lang.String>> dataJRDD, int vectorSize, double learningRate, int numPartitions, int numIterations, java.lang.Long seed, int minCount, int windowSize)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib DecisionTree.train().
   * This stub returns a handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on exit;
   * see the Py4J documentation.
   * @param data  Training data
   * @param categoricalFeaturesInfo  Categorical features info, as Java map
   * @param algoStr (undocumented)
   * @param numClasses (undocumented)
   * @param impurityStr (undocumented)
   * @param maxDepth (undocumented)
   * @param maxBins (undocumented)
   * @param minInstancesPerNode (undocumented)
   * @param minInfoGain (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainDecisionTreeModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, java.lang.String algoStr, int numClasses, java.util.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, java.lang.String impurityStr, int maxDepth, int maxBins, int minInstancesPerNode, double minInfoGain)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomForest.train().
   * This stub returns a handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on exit;
   * see the Py4J documentation.
   * @param data (undocumented)
   * @param algoStr (undocumented)
   * @param numClasses (undocumented)
   * @param categoricalFeaturesInfo (undocumented)
   * @param numTrees (undocumented)
   * @param featureSubsetStrategy (undocumented)
   * @param impurityStr (undocumented)
   * @param maxDepth (undocumented)
   * @param maxBins (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.model.RandomForestModel trainRandomForestModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, java.lang.String algoStr, int numClasses, java.util.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, int numTrees, java.lang.String featureSubsetStrategy, java.lang.String impurityStr, int maxDepth, int maxBins, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib GradientBoostedTrees.train().
   * This stub returns a handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on exit;
   * see the Py4J documentation.
   * @param data (undocumented)
   * @param algoStr (undocumented)
   * @param categoricalFeaturesInfo (undocumented)
   * @param lossStr (undocumented)
   * @param numIterations (undocumented)
   * @param learningRate (undocumented)
   * @param maxDepth (undocumented)
   * @param maxBins (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel trainGradientBoostedTreesModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, java.lang.String algoStr, java.util.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, java.lang.String lossStr, int numIterations, double learningRate, int maxDepth, int maxBins)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector elementwiseProductVector (org.apache.spark.mllib.linalg.Vector scalingVector, org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> elementwiseProductVector (org.apache.spark.mllib.linalg.Vector scalingVector, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> vector)  { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.colStats(X: RDD[Vector]).
   * TODO figure out return type.
   * @param rdd (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.MultivariateStatisticalSummary colStats (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> rdd)  { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.corr(X: RDD[Vector], method: String).
   * Returns the correlation matrix serialized into a byte array understood by deserializers in
   * pyspark.
   * @param x (undocumented)
   * @param method (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix corr (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> x, java.lang.String method)  { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.corr(x: RDD[Double], y: RDD[Double], method: String).
   * @param x (undocumented)
   * @param y (undocumented)
   * @param method (undocumented)
   * @return (undocumented)
   */
  public  double corr (org.apache.spark.api.java.JavaRDD<java.lang.Object> x, org.apache.spark.api.java.JavaRDD<java.lang.Object> y, java.lang.String method)  { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.chiSqTest()
   * @param observed (undocumented)
   * @param expected (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSqTest (org.apache.spark.mllib.linalg.Vector observed, org.apache.spark.mllib.linalg.Vector expected)  { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.chiSqTest(observed: Matrix)
   * @param observed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSqTest (org.apache.spark.mllib.linalg.Matrix observed)  { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.chiSqTest(RDD[LabelPoint])
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult[] chiSqTest (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data)  { throw new RuntimeException(); }
  private  java.lang.String getCorrNameOrDefault (java.lang.String method)  { throw new RuntimeException(); }
  private  long getSeedOrDefault (java.lang.Long seed)  { throw new RuntimeException(); }
  private  int getNumPartitionsOrDefault (java.lang.Integer numPartitions, org.apache.spark.api.java.JavaSparkContext jsc)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.uniformRDD()
   * @param jsc (undocumented)
   * @param size (undocumented)
   * @param numPartitions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> uniformRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, java.lang.Integer numPartitions, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.normalRDD()
   * @param jsc (undocumented)
   * @param size (undocumented)
   * @param numPartitions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> normalRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, java.lang.Integer numPartitions, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.logNormalRDD()
   * @param jsc (undocumented)
   * @param mean (undocumented)
   * @param std (undocumented)
   * @param size (undocumented)
   * @param numPartitions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> logNormalRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, double std, long size, java.lang.Integer numPartitions, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.poissonRDD()
   * @param jsc (undocumented)
   * @param mean (undocumented)
   * @param size (undocumented)
   * @param numPartitions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> poissonRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size, java.lang.Integer numPartitions, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.exponentialRDD()
   * @param jsc (undocumented)
   * @param mean (undocumented)
   * @param size (undocumented)
   * @param numPartitions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> exponentialRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size, java.lang.Integer numPartitions, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.gammaRDD()
   * @param jsc (undocumented)
   * @param shape (undocumented)
   * @param scale (undocumented)
   * @param size (undocumented)
   * @param numPartitions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> gammaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double shape, double scale, long size, java.lang.Integer numPartitions, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.uniformVectorRDD()
   * @param jsc (undocumented)
   * @param numRows (undocumented)
   * @param numCols (undocumented)
   * @param numPartitions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> uniformVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, java.lang.Integer numPartitions, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.normalVectorRDD()
   * @param jsc (undocumented)
   * @param numRows (undocumented)
   * @param numCols (undocumented)
   * @param numPartitions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> normalVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, java.lang.Integer numPartitions, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.logNormalVectorRDD()
   * @param jsc (undocumented)
   * @param mean (undocumented)
   * @param std (undocumented)
   * @param numRows (undocumented)
   * @param numCols (undocumented)
   * @param numPartitions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> logNormalVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, double std, long numRows, int numCols, java.lang.Integer numPartitions, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.poissonVectorRDD()
   * @param jsc (undocumented)
   * @param mean (undocumented)
   * @param numRows (undocumented)
   * @param numCols (undocumented)
   * @param numPartitions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> poissonVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols, java.lang.Integer numPartitions, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.exponentialVectorRDD()
   * @param jsc (undocumented)
   * @param mean (undocumented)
   * @param numRows (undocumented)
   * @param numCols (undocumented)
   * @param numPartitions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> exponentialVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols, java.lang.Integer numPartitions, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.gammaVectorRDD()
   * @param jsc (undocumented)
   * @param shape (undocumented)
   * @param scale (undocumented)
   * @param numRows (undocumented)
   * @param numCols (undocumented)
   * @param numPartitions (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> gammaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double shape, double scale, long numRows, int numCols, java.lang.Integer numPartitions, java.lang.Long seed)  { throw new RuntimeException(); }
  /**
   * Java stub for the constructor of Python mllib RankingMetrics
   * @param predictionAndLabels (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.evaluation.RankingMetrics<java.lang.Object> newRankingMetrics (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictionAndLabels)  { throw new RuntimeException(); }
  /**
   * Java stub for the estimate method of KernelDensity
   * @param sample (undocumented)
   * @param bandwidth (undocumented)
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  double[] estimateKernelDensity (org.apache.spark.api.java.JavaRDD<java.lang.Object> sample, double bandwidth, java.util.ArrayList<java.lang.Object> points)  { throw new RuntimeException(); }
  /**
   * Java stub for the update method of StreamingKMeansModel.
   * @param clusterCenters (undocumented)
   * @param clusterWeights (undocumented)
   * @param data (undocumented)
   * @param decayFactor (undocumented)
   * @param timeUnit (undocumented)
   * @return (undocumented)
   */
  public  java.util.List<java.lang.Object> updateStreamingKMeansModel (java.util.List<org.apache.spark.mllib.linalg.Vector> clusterCenters, java.util.List<java.lang.Object> clusterWeights, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data, double decayFactor, java.lang.String timeUnit)  { throw new RuntimeException(); }
  /**
   * Wrapper around the generateLinearInput method of LinearDataGenerator.
   * @param intercept (undocumented)
   * @param weights (undocumented)
   * @param xMean (undocumented)
   * @param xVariance (undocumented)
   * @param nPoints (undocumented)
   * @param seed (undocumented)
   * @param eps (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.LabeledPoint[] generateLinearInputWrapper (double intercept, java.util.List<java.lang.Object> weights, java.util.List<java.lang.Object> xMean, java.util.List<java.lang.Object> xVariance, int nPoints, int seed, double eps)  { throw new RuntimeException(); }
  /**
   * Wrapper around the generateLinearRDD method of LinearDataGenerator.
   * @param sc (undocumented)
   * @param nexamples (undocumented)
   * @param nfeatures (undocumented)
   * @param eps (undocumented)
   * @param nparts (undocumented)
   * @param intercept (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> generateLinearRDDWrapper (org.apache.spark.api.java.JavaSparkContext sc, int nexamples, int nfeatures, double eps, int nparts, double intercept)  { throw new RuntimeException(); }
  /**
   * Java stub for Statistics.kolmogorovSmirnovTest()
   * @param data (undocumented)
   * @param distName (undocumented)
   * @param params (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult kolmogorovSmirnovTest (org.apache.spark.api.java.JavaRDD<java.lang.Object> data, java.lang.String distName, java.util.List<java.lang.Object> params)  { throw new RuntimeException(); }
  /**
   * Wrapper around RowMatrix constructor.
   * @param rows (undocumented)
   * @param numRows (undocumented)
   * @param numCols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.RowMatrix createRowMatrix (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> rows, long numRows, int numCols)  { throw new RuntimeException(); }
  /**
   * Wrapper around IndexedRowMatrix constructor.
   * @param rows (undocumented)
   * @param numRows (undocumented)
   * @param numCols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix createIndexedRowMatrix (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> rows, long numRows, int numCols)  { throw new RuntimeException(); }
  /**
   * Wrapper around CoordinateMatrix constructor.
   * @param rows (undocumented)
   * @param numRows (undocumented)
   * @param numCols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.CoordinateMatrix createCoordinateMatrix (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> rows, long numRows, long numCols)  { throw new RuntimeException(); }
  /**
   * Wrapper around BlockMatrix constructor.
   * @param blocks (undocumented)
   * @param rowsPerBlock (undocumented)
   * @param colsPerBlock (undocumented)
   * @param numRows (undocumented)
   * @param numCols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix createBlockMatrix (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> blocks, int rowsPerBlock, int colsPerBlock, long numRows, long numCols)  { throw new RuntimeException(); }
  /**
   * Return the rows of an IndexedRowMatrix.
   * @param indexedRowMatrix (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getIndexedRows (org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix indexedRowMatrix)  { throw new RuntimeException(); }
  /**
   * Return the entries of a CoordinateMatrix.
   * @param coordinateMatrix (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getMatrixEntries (org.apache.spark.mllib.linalg.distributed.CoordinateMatrix coordinateMatrix)  { throw new RuntimeException(); }
  /**
   * Return the sub-matrix blocks of a BlockMatrix.
   * @param blockMatrix (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getMatrixBlocks (org.apache.spark.mllib.linalg.distributed.BlockMatrix blockMatrix)  { throw new RuntimeException(); }
  /**
   * Python-friendly version of {@link MLUtils.convertVectorColumnsToML()}.
   * @param dataset (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> convertVectorColumnsToML (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataset, java.util.ArrayList<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * Python-friendly version of {@link MLUtils.convertVectorColumnsFromML()}
   * @param dataset (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> convertVectorColumnsFromML (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataset, java.util.ArrayList<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * Python-friendly version of {@link MLUtils.convertMatrixColumnsToML()}.
   * @param dataset (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> convertMatrixColumnsToML (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataset, java.util.ArrayList<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * Python-friendly version of {@link MLUtils.convertMatrixColumnsFromML()}
   * @param dataset (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> convertMatrixColumnsFromML (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataset, java.util.ArrayList<java.lang.String> cols)  { throw new RuntimeException(); }
}
