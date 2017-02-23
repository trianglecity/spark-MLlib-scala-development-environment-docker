package org.apache.spark.mllib.util;
/**
 * Helper methods to load, save and pre-process data used in ML Lib.
 */
// not preceding
public  class MLUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MLUtils$ MODULE$ = null;
  /**
   * Converts vector columns in an input Dataset from the {@link org.apache.spark.mllib.linalg.Vector}
   * type to the new {@link org.apache.spark.ml.linalg.Vector} type under the <code>spark.ml</code> package.
   * @param dataset input dataset
   * @param cols a list of vector columns to be converted. New vector columns will be ignored. If
   *             unspecified, all old vector columns will be converted except nested ones.
   * @return the input <code>DataFrame</code> with old vector columns converted to the new vector type
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> convertVectorColumnsToML (org.apache.spark.sql.Dataset<?> dataset, java.lang.String... cols)  { throw new RuntimeException(); }
  /**
   * Converts vector columns in an input Dataset to the {@link org.apache.spark.mllib.linalg.Vector}
   * type from the new {@link org.apache.spark.ml.linalg.Vector} type under the <code>spark.ml</code> package.
   * @param dataset input dataset
   * @param cols a list of vector columns to be converted. Old vector columns will be ignored. If
   *             unspecified, all new vector columns will be converted except nested ones.
   * @return the input <code>DataFrame</code> with new vector columns converted to the old vector type
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> convertVectorColumnsFromML (org.apache.spark.sql.Dataset<?> dataset, java.lang.String... cols)  { throw new RuntimeException(); }
  /**
   * Converts Matrix columns in an input Dataset from the {@link org.apache.spark.mllib.linalg.Matrix}
   * type to the new {@link org.apache.spark.ml.linalg.Matrix} type under the <code>spark.ml</code> package.
   * @param dataset input dataset
   * @param cols a list of matrix columns to be converted. New matrix columns will be ignored. If
   *             unspecified, all old matrix columns will be converted except nested ones.
   * @return the input <code>DataFrame</code> with old matrix columns converted to the new matrix type
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> convertMatrixColumnsToML (org.apache.spark.sql.Dataset<?> dataset, java.lang.String... cols)  { throw new RuntimeException(); }
  /**
   * Converts matrix columns in an input Dataset to the {@link org.apache.spark.mllib.linalg.Matrix}
   * type from the new {@link org.apache.spark.ml.linalg.Matrix} type under the <code>spark.ml</code> package.
   * @param dataset input dataset
   * @param cols a list of matrix columns to be converted. Old matrix columns will be ignored. If
   *             unspecified, all new matrix columns will be converted except nested ones.
   * @return the input <code>DataFrame</code> with new matrix columns converted to the old matrix type
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> convertMatrixColumnsFromML (org.apache.spark.sql.Dataset<?> dataset, java.lang.String... cols)  { throw new RuntimeException(); }
  public   MLUtils$ ()  { throw new RuntimeException(); }
    double EPSILON ()  { throw new RuntimeException(); }
  /**
   * Loads labeled data in the LIBSVM format into an RDD[LabeledPoint].
   * The LIBSVM format is a text-based format used by LIBSVM and LIBLINEAR.
   * Each line represents a labeled sparse feature vector using the following format:
   * <pre><code>label index1:value1 index2:value2 ...</code></pre>
   * where the indices are one-based and in ascending order.
   * This method parses each line into a {&#64;link org.apache.spark.mllib.regression.LabeledPoint},
   * where the feature indices are converted to zero-based.
   * &#64;param sc Spark context
   * &#64;param path file or directory path in any Hadoop-supported file system URI
   * &#64;param numFeatures number of features, which will be determined from the input data if a
   *                    nonpositive value is given. This is useful when the dataset is already split
   *                    into multiple files and you want to load them separately, because some
   *                    features may not present in certain files, which leads to inconsistent
   *                    feature dimensions.
   * &#64;param minPartitions min number of partitions
   * &#64;return labeled data stored as an RDD[LabeledPoint]
   * @param sc (undocumented)
   * @param path (undocumented)
   * @param numFeatures (undocumented)
   * @param minPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLibSVMFile (org.apache.spark.SparkContext sc, java.lang.String path, int numFeatures, int minPartitions)  { throw new RuntimeException(); }
    int computeNumFeatures (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, int[], double[]>> rdd)  { throw new RuntimeException(); }
    org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, int[], double[]>> parseLibSVMFile (org.apache.spark.SparkContext sc, java.lang.String path, int minPartitions)  { throw new RuntimeException(); }
    scala.Tuple3<java.lang.Object, int[], double[]> parseLibSVMRecord (java.lang.String line)  { throw new RuntimeException(); }
  /**
   * Loads labeled data in the LIBSVM format into an RDD[LabeledPoint], with the default number of
   * partitions.
   * @param sc (undocumented)
   * @param path (undocumented)
   * @param numFeatures (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLibSVMFile (org.apache.spark.SparkContext sc, java.lang.String path, int numFeatures)  { throw new RuntimeException(); }
  /**
   * Loads binary labeled data in the LIBSVM format into an RDD[LabeledPoint], with number of
   * features determined automatically and the default number of partitions.
   * @param sc (undocumented)
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLibSVMFile (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Save labeled data in LIBSVM format.
   * @param data an RDD of LabeledPoint to be saved
   * @param dir directory to save the data
   * @see org.apache.spark.mllib.util.MLUtils#loadLibSVMFile
   */
  public  void saveAsLibSVMFile (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data, java.lang.String dir)  { throw new RuntimeException(); }
  /**
   * Loads vectors saved using <code>RDD[Vector].saveAsTextFile</code>.
   * @param sc Spark context
   * @param path file or directory path in any Hadoop-supported file system URI
   * @param minPartitions min number of partitions
   * @return vectors stored as an RDD[Vector]
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> loadVectors (org.apache.spark.SparkContext sc, java.lang.String path, int minPartitions)  { throw new RuntimeException(); }
  /**
   * Loads vectors saved using <code>RDD[Vector].saveAsTextFile</code> with the default number of partitions.
   * @param sc (undocumented)
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> loadVectors (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads labeled points saved using <code>RDD[LabeledPoint].saveAsTextFile</code>.
   * @param sc Spark context
   * @param path file or directory path in any Hadoop-supported file system URI
   * @param minPartitions min number of partitions
   * @return labeled points stored as an RDD[LabeledPoint]
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLabeledPoints (org.apache.spark.SparkContext sc, java.lang.String path, int minPartitions)  { throw new RuntimeException(); }
  /**
   * Loads labeled points saved using <code>RDD[LabeledPoint].saveAsTextFile</code> with the default number of
   * partitions.
   * @param sc (undocumented)
   * @param dir (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLabeledPoints (org.apache.spark.SparkContext sc, java.lang.String dir)  { throw new RuntimeException(); }
  /**
   * Return a k element array of pairs of RDDs with the first element of each pair
   * containing the training data, a complement of the validation data and the second
   * element, the validation data, containing a unique 1/kth of the data. Where k=numFolds.
   * @param rdd (undocumented)
   * @param numFolds (undocumented)
   * @param seed (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Tuple2<org.apache.spark.rdd.RDD<T>, org.apache.spark.rdd.RDD<T>>[] kFold (org.apache.spark.rdd.RDD<T> rdd, int numFolds, int seed, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Version of <code>kFold()</code> taking a Long seed.
   * @param rdd (undocumented)
   * @param numFolds (undocumented)
   * @param seed (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Tuple2<org.apache.spark.rdd.RDD<T>, org.apache.spark.rdd.RDD<T>>[] kFold (org.apache.spark.rdd.RDD<T> rdd, int numFolds, long seed, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Returns a new vector with <code>1.0</code> (bias) appended to the input vector.
   * @param vector (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector appendBias (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
  /**
   * Converts vector columns in an input Dataset from the {@link org.apache.spark.mllib.linalg.Vector}
   * type to the new {@link org.apache.spark.ml.linalg.Vector} type under the <code>spark.ml</code> package.
   * @param dataset input dataset
   * @param cols a list of vector columns to be converted. New vector columns will be ignored. If
   *             unspecified, all old vector columns will be converted except nested ones.
   * @return the input <code>DataFrame</code> with old vector columns converted to the new vector type
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> convertVectorColumnsToML (org.apache.spark.sql.Dataset<?> dataset, scala.collection.Seq<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * Converts vector columns in an input Dataset to the {@link org.apache.spark.mllib.linalg.Vector}
   * type from the new {@link org.apache.spark.ml.linalg.Vector} type under the <code>spark.ml</code> package.
   * @param dataset input dataset
   * @param cols a list of vector columns to be converted. Old vector columns will be ignored. If
   *             unspecified, all new vector columns will be converted except nested ones.
   * @return the input <code>DataFrame</code> with new vector columns converted to the old vector type
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> convertVectorColumnsFromML (org.apache.spark.sql.Dataset<?> dataset, scala.collection.Seq<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * Converts Matrix columns in an input Dataset from the {@link org.apache.spark.mllib.linalg.Matrix}
   * type to the new {@link org.apache.spark.ml.linalg.Matrix} type under the <code>spark.ml</code> package.
   * @param dataset input dataset
   * @param cols a list of matrix columns to be converted. New matrix columns will be ignored. If
   *             unspecified, all old matrix columns will be converted except nested ones.
   * @return the input <code>DataFrame</code> with old matrix columns converted to the new matrix type
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> convertMatrixColumnsToML (org.apache.spark.sql.Dataset<?> dataset, scala.collection.Seq<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * Converts matrix columns in an input Dataset to the {@link org.apache.spark.mllib.linalg.Matrix}
   * type from the new {@link org.apache.spark.ml.linalg.Matrix} type under the <code>spark.ml</code> package.
   * @param dataset input dataset
   * @param cols a list of matrix columns to be converted. Old matrix columns will be ignored. If
   *             unspecified, all new matrix columns will be converted except nested ones.
   * @return the input <code>DataFrame</code> with new matrix columns converted to the old matrix type
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> convertMatrixColumnsFromML (org.apache.spark.sql.Dataset<?> dataset, scala.collection.Seq<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * Returns the squared Euclidean distance between two vectors. The following formula will be used
   * if it does not introduce too much numerical error:
   * <pre>
   *   \|a - b\|_2^2 = \|a\|_2^2 + \|b\|_2^2 - 2 a^T b.
   * </pre>
   * When both vector norms are given, this is faster than computing the squared distance directly,
   * especially when one of the vectors is a sparse vector.
   * @param v1 the first vector
   * @param norm1 the norm of the first vector, non-negative
   * @param v2 the second vector
   * @param norm2 the norm of the second vector, non-negative
   * @param precision desired relative precision for the squared distance
   * @return squared distance between v1 and v2 within the specified precision
   */
    double fastSquaredDistance (org.apache.spark.mllib.linalg.Vector v1, double norm1, org.apache.spark.mllib.linalg.Vector v2, double norm2, double precision)  { throw new RuntimeException(); }
  /**
   * When <code>x</code> is positive and large, computing <code>math.log(1 + math.exp(x))</code> will lead to arithmetic
   * overflow. This will happen when <code>x > 709.78</code> which is not a very large number.
   * It can be addressed by rewriting the formula into <code>x + math.log1p(math.exp(-x))</code> when <code>x > 0</code>.
   * @param x a floating-point value as input.
   * @return the result of <code>math.log(1 + math.exp(x))</code>.
   */
    double log1pExp (double x)  { throw new RuntimeException(); }
}
