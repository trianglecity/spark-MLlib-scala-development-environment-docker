package org.apache.spark.ml.recommendation;
/**
 * Alternating Least Squares (ALS) matrix factorization.
 * <p>
 * ALS attempts to estimate the ratings matrix <code>R</code> as the product of two lower-rank matrices,
 * <code>X</code> and <code>Y</code>, i.e. <code>X * Yt = R</code>. Typically these approximations are called 'factor' matrices.
 * The general approach is iterative. During each iteration, one of the factor matrices is held
 * constant, while the other is solved for using least squares. The newly-solved factor matrix is
 * then held constant while solving for the other factor matrix.
 * <p>
 * This is a blocked implementation of the ALS factorization algorithm that groups the two sets
 * of factors (referred to as "users" and "products") into blocks and reduces communication by only
 * sending one copy of each user vector to each product block on each iteration, and only for the
 * product blocks that need that user's feature vector. This is achieved by pre-computing some
 * information about the ratings matrix to determine the "out-links" of each user (which blocks of
 * products it will contribute to) and "in-link" information for each product (which of the feature
 * vectors it receives from each user block it will depend on). This allows us to send only an
 * array of feature vectors between each user block and product block, and have the product block
 * find the users' ratings and update the products based on these messages.
 * <p>
 * For implicit preference data, the algorithm used is based on
 * "Collaborative Filtering for Implicit Feedback Datasets", available at
 * http://dx.doi.org/10.1109/ICDM.2008.22, adapted for the blocked approach used here.
 * <p>
 * Essentially instead of finding the low-rank approximations to the rating matrix <code>R</code>,
 * this finds the approximations for a preference matrix <code>P</code> where the elements of <code>P</code> are 1 if
 * r is greater than 0 and 0 if r is less than or equal to 0. The ratings then act as 'confidence'
 * values related to strength of indicated user
 * preferences rather than explicit ratings given to items.
 */
public  class ALS extends org.apache.spark.ml.Estimator<org.apache.spark.ml.recommendation.ALSModel> implements org.apache.spark.ml.recommendation.ALSParams, org.apache.spark.ml.util.DefaultParamsWritable {
  /**
   * :: DeveloperApi ::
   * Rating class for better code readability.
   */
  static public  class Rating<ID extends java.lang.Object> implements scala.Product, scala.Serializable {
    public  ID user ()  { throw new RuntimeException(); }
    public  ID item ()  { throw new RuntimeException(); }
    public  float rating ()  { throw new RuntimeException(); }
    // not preceding
    public   Rating (ID user, ID item, float rating)  { throw new RuntimeException(); }
  }
  static public  class Rating$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Rating$ MODULE$ = null;
    public   Rating$ ()  { throw new RuntimeException(); }
  }
  /**
   * In-link block for computing src (user/item) factors. This includes the original src IDs
   * of the elements within this block as well as encoded dst (item/user) indices and corresponding
   * ratings. The dst indices are in the form of (blockId, localIndex), which are not the original
   * dst IDs. To compute src factors, we expect receiving dst factors that match the dst indices.
   * For example, if we have an in-link record
   * <p>
   * {srcId: 0, dstBlockId: 2, dstLocalIndex: 3, rating: 5.0},
   * <p>
   * and assume that the dst factors are stored as dstFactors: Map[Int, Array[Array[Float}], which
   * is a blockId to dst factors map, the corresponding dst factor of the record is dstFactor(2)(3).
   * <p>
   * We use a CSC-like (compressed sparse column) format to store the in-link information. So we can
   * compute src factors one after another using only one normal equation instance.
   * <p>
   * param:  srcIds src ids (ordered)
   * param:  dstPtrs dst pointers. Elements in range [dstPtrs(i), dstPtrs(i+1)) of dst indices and
   *                ratings are associated with srcIds(i).
   * param:  dstEncodedIndices encoded dst indices
   * param:  ratings ratings
   * @see LocalIndexEncoder
   */
  static   class InBlock<ID extends java.lang.Object> implements scala.Product, scala.Serializable {
    public  java.lang.Object srcIds ()  { throw new RuntimeException(); }
    public  int[] dstPtrs ()  { throw new RuntimeException(); }
    public  int[] dstEncodedIndices ()  { throw new RuntimeException(); }
    public  float[] ratings ()  { throw new RuntimeException(); }
    // not preceding
    public   InBlock (java.lang.Object srcIds, int[] dstPtrs, int[] dstEncodedIndices, float[] ratings, scala.reflect.ClassTag<ID> evidence$2)  { throw new RuntimeException(); }
    /** Size of the block. */
    public  int size ()  { throw new RuntimeException(); }
  }
  static public  class InBlock$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InBlock$ MODULE$ = null;
    public   InBlock$ ()  { throw new RuntimeException(); }
  }
  /**
   * A rating block that contains src IDs, dst IDs, and ratings, stored in primitive arrays.
   */
  static   class RatingBlock<ID extends java.lang.Object> implements scala.Product, scala.Serializable {
    public  java.lang.Object srcIds ()  { throw new RuntimeException(); }
    public  java.lang.Object dstIds ()  { throw new RuntimeException(); }
    public  float[] ratings ()  { throw new RuntimeException(); }
    // not preceding
    public   RatingBlock (java.lang.Object srcIds, java.lang.Object dstIds, float[] ratings, scala.reflect.ClassTag<ID> evidence$3)  { throw new RuntimeException(); }
    /** Size of the block. */
    public  int size ()  { throw new RuntimeException(); }
  }
  static public  class RatingBlock$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RatingBlock$ MODULE$ = null;
    public   RatingBlock$ ()  { throw new RuntimeException(); }
  }
  /** Trait for least squares solvers applied to the normal equation. */
  static   interface LeastSquaresNESolver extends scala.Serializable {
    /** Solves a least squares problem with regularization (possibly with other constraints). */
    public  float[] solve (org.apache.spark.ml.recommendation.ALS.NormalEquation ne, double lambda)  ;
  }
  /** Cholesky solver for least square problems. */
  static   class CholeskySolver implements org.apache.spark.ml.recommendation.ALS.LeastSquaresNESolver {
    public   CholeskySolver ()  { throw new RuntimeException(); }
    /**
     * Solves a least squares problem with L2 regularization:
     * <p>
     *   min norm(A x - b)^2^ + lambda * norm(x)^2^
     * <p>
     * @param ne a {@link NormalEquation} instance that contains AtA, Atb, and n (number of instances)
     * @param lambda regularization constant
     * @return the solution x
     */
    public  float[] solve (org.apache.spark.ml.recommendation.ALS.NormalEquation ne, double lambda)  { throw new RuntimeException(); }
  }
  /** NNLS solver. */
  static   class NNLSSolver implements org.apache.spark.ml.recommendation.ALS.LeastSquaresNESolver {
    public   NNLSSolver ()  { throw new RuntimeException(); }
    private  int rank ()  { throw new RuntimeException(); }
    private  org.apache.spark.mllib.optimization.NNLS.Workspace workspace ()  { throw new RuntimeException(); }
    private  double[] ata ()  { throw new RuntimeException(); }
    private  boolean initialized ()  { throw new RuntimeException(); }
    private  void initialize (int rank)  { throw new RuntimeException(); }
    /**
     * Solves a nonnegative least squares problem with L2 regularization:
     * <p>
     *   min_x_  norm(A x - b)^2^ + lambda * n * norm(x)^2^
     *   subject to x >= 0
     * @param ne (undocumented)
     * @param lambda (undocumented)
     * @return (undocumented)
     */
    public  float[] solve (org.apache.spark.ml.recommendation.ALS.NormalEquation ne, double lambda)  { throw new RuntimeException(); }
    /**
     * Given a triangular matrix in the order of fillXtX above, compute the full symmetric square
     * matrix that it represents, storing it into destMatrix.
     * @param triAtA (undocumented)
     * @param lambda (undocumented)
     */
    private  void fillAtA (double[] triAtA, double lambda)  { throw new RuntimeException(); }
  }
  /**
   * Representing a normal equation to solve the following weighted least squares problem:
   * <p>
   * minimize \sum,,i,, c,,i,, (a,,i,,^T^ x - b,,i,,)^2^ + lambda * x^T^ x.
   * <p>
   * Its normal equation is given by
   * <p>
   * \sum,,i,, c,,i,, (a,,i,, a,,i,,^T^ x - b,,i,, a,,i,,) + lambda * x = 0.
   */
  static   class NormalEquation implements scala.Serializable {
    public  int k ()  { throw new RuntimeException(); }
    // not preceding
    public   NormalEquation (int k)  { throw new RuntimeException(); }
    /** Number of entries in the upper triangular part of a k-by-k matrix. */
    public  int triK ()  { throw new RuntimeException(); }
    /** A^T^ * A */
    public  double[] ata ()  { throw new RuntimeException(); }
    /** A^T^ * b */
    public  double[] atb ()  { throw new RuntimeException(); }
    private  double[] da ()  { throw new RuntimeException(); }
    private  java.lang.String upper ()  { throw new RuntimeException(); }
    private  void copyToDouble (float[] a)  { throw new RuntimeException(); }
    /** Adds an observation. */
    public  org.apache.spark.ml.recommendation.ALS.NormalEquation add (float[] a, double b, double c)  { throw new RuntimeException(); }
    /** Merges another normal equation object. */
    public  org.apache.spark.ml.recommendation.ALS.NormalEquation merge (org.apache.spark.ml.recommendation.ALS.NormalEquation other)  { throw new RuntimeException(); }
    /** Resets everything to zero, which should be called after each solve. */
    public  void reset ()  { throw new RuntimeException(); }
  }
  /**
   * Builder for {@link RatingBlock}. <code>mutable.ArrayBuilder</code> is used to avoid boxing/unboxing.
   */
  static   class RatingBlockBuilder<ID extends java.lang.Object> implements scala.Serializable {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   RatingBlockBuilder (scala.reflect.ClassTag<ID> evidence$4)  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuilder<ID> srcIds ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuilder<ID> dstIds ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuilder<java.lang.Object> ratings ()  { throw new RuntimeException(); }
    public  int size ()  { throw new RuntimeException(); }
    /** Adds a rating. */
    public  org.apache.spark.ml.recommendation.ALS.RatingBlockBuilder<ID> add (org.apache.spark.ml.recommendation.ALS.Rating<ID> r)  { throw new RuntimeException(); }
    /** Merges another {@link RatingBlockBuilder}. */
    public  org.apache.spark.ml.recommendation.ALS.RatingBlockBuilder<ID> merge (org.apache.spark.ml.recommendation.ALS.RatingBlock<ID> other)  { throw new RuntimeException(); }
    /** Builds a {@link RatingBlock}. */
    public  org.apache.spark.ml.recommendation.ALS.RatingBlock<ID> build ()  { throw new RuntimeException(); }
  }
  /**
   * Builder for uncompressed in-blocks of (srcId, dstEncodedIndex, rating) tuples.
   * <p>
   * param:  encoder encoder for dst indices
   */
  static   class UncompressedInBlockBuilder<ID extends java.lang.Object> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   UncompressedInBlockBuilder (org.apache.spark.ml.recommendation.ALS.LocalIndexEncoder encoder, scala.reflect.ClassTag<ID> evidence$6, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuilder<ID> srcIds ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuilder<java.lang.Object> dstEncodedIndices ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuilder<java.lang.Object> ratings ()  { throw new RuntimeException(); }
    /**
     * Adds a dst block of (srcId, dstLocalIndex, rating) tuples.
     * <p>
     * @param dstBlockId dst block ID
     * @param srcIds original src IDs
     * @param dstLocalIndices dst local indices
     * @param ratings ratings
     * @return (undocumented)
     */
    public  org.apache.spark.ml.recommendation.ALS.UncompressedInBlockBuilder<ID> add (int dstBlockId, java.lang.Object srcIds, int[] dstLocalIndices, float[] ratings)  { throw new RuntimeException(); }
    /** Builds a {@link UncompressedInBlock}. */
    public  org.apache.spark.ml.recommendation.ALS.UncompressedInBlock<ID> build ()  { throw new RuntimeException(); }
  }
  /**
   * A block of (srcId, dstEncodedIndex, rating) tuples stored in primitive arrays.
   */
  static   class UncompressedInBlock<ID extends java.lang.Object> {
    public  java.lang.Object srcIds ()  { throw new RuntimeException(); }
    public  int[] dstEncodedIndices ()  { throw new RuntimeException(); }
    public  float[] ratings ()  { throw new RuntimeException(); }
    // not preceding
    public   UncompressedInBlock (java.lang.Object srcIds, int[] dstEncodedIndices, float[] ratings, scala.reflect.ClassTag<ID> evidence$7, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
    /** Size the of block. */
    public  int length ()  { throw new RuntimeException(); }
    /**
     * Compresses the block into an {@link InBlock}. The algorithm is the same as converting a
     * sparse matrix from coordinate list (COO) format into compressed sparse column (CSC) format.
     * Sorting is done using Spark's built-in Timsort to avoid generating too many objects.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.recommendation.ALS.InBlock<ID> compress ()  { throw new RuntimeException(); }
    private  void sort ()  { throw new RuntimeException(); }
  }
  /**
   * A wrapper that holds a primitive key.
   * <p>
   * @see UncompressedInBlockSort
   */
  static private  class KeyWrapper<ID extends java.lang.Object> implements scala.math.Ordered<org.apache.spark.ml.recommendation.ALS.KeyWrapper<ID>> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   KeyWrapper (scala.reflect.ClassTag<ID> evidence$8, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
    public  ID key ()  { throw new RuntimeException(); }
    public  int compare (org.apache.spark.ml.recommendation.ALS.KeyWrapper<ID> that)  { throw new RuntimeException(); }
    public  org.apache.spark.ml.recommendation.ALS.KeyWrapper<ID> setKey (ID key)  { throw new RuntimeException(); }
  }
  /**
   * {@link SortDataFormat} of {@link UncompressedInBlock} used by {@link Sorter}.
   */
  static private  class UncompressedInBlockSort<ID extends java.lang.Object> extends org.apache.spark.util.collection.SortDataFormat<org.apache.spark.ml.recommendation.ALS.KeyWrapper<ID>, org.apache.spark.ml.recommendation.ALS.UncompressedInBlock<ID>> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   UncompressedInBlockSort (scala.reflect.ClassTag<ID> evidence$9, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
    public  org.apache.spark.ml.recommendation.ALS.KeyWrapper<ID> newKey ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.recommendation.ALS.KeyWrapper<ID> getKey (org.apache.spark.ml.recommendation.ALS.UncompressedInBlock<ID> data, int pos, org.apache.spark.ml.recommendation.ALS.KeyWrapper<ID> reuse)  { throw new RuntimeException(); }
    public  org.apache.spark.ml.recommendation.ALS.KeyWrapper<ID> getKey (org.apache.spark.ml.recommendation.ALS.UncompressedInBlock<ID> data, int pos)  { throw new RuntimeException(); }
    private <T extends java.lang.Object> void swapElements (java.lang.Object data, int pos0, int pos1)  { throw new RuntimeException(); }
    public  void swap (org.apache.spark.ml.recommendation.ALS.UncompressedInBlock<ID> data, int pos0, int pos1)  { throw new RuntimeException(); }
    public  void copyRange (org.apache.spark.ml.recommendation.ALS.UncompressedInBlock<ID> src, int srcPos, org.apache.spark.ml.recommendation.ALS.UncompressedInBlock<ID> dst, int dstPos, int length)  { throw new RuntimeException(); }
    public  org.apache.spark.ml.recommendation.ALS.UncompressedInBlock<ID> allocate (int length)  { throw new RuntimeException(); }
    public  void copyElement (org.apache.spark.ml.recommendation.ALS.UncompressedInBlock<ID> src, int srcPos, org.apache.spark.ml.recommendation.ALS.UncompressedInBlock<ID> dst, int dstPos)  { throw new RuntimeException(); }
  }
  /**
   * Encoder for storing (blockId, localIndex) into a single integer.
   * <p>
   * We use the leading bits (including the sign bit) to store the block id and the rest to store
   * the local index. This is based on the assumption that users/items are approximately evenly
   * partitioned. With this assumption, we should be able to encode two billion distinct values.
   * <p>
   * param:  numBlocks number of blocks
   */
  static   class LocalIndexEncoder implements scala.Serializable {
    public   LocalIndexEncoder (int numBlocks)  { throw new RuntimeException(); }
    /** Encodes a (blockId, localIndex) into a single integer. */
    public  int encode (int blockId, int localIndex)  { throw new RuntimeException(); }
    /** Gets the block id from an encoded index. */
    public  int blockId (int encoded)  { throw new RuntimeException(); }
    /** Gets the local index from an encoded index. */
    public  int localIndex (int encoded)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.recommendation.ALS load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Implementation of the ALS algorithm.
   * @param ratings (undocumented)
   * @param rank (undocumented)
   * @param numUserBlocks (undocumented)
   * @param numItemBlocks (undocumented)
   * @param maxIter (undocumented)
   * @param regParam (undocumented)
   * @param implicitPrefs (undocumented)
   * @param alpha (undocumented)
   * @param nonnegative (undocumented)
   * @param intermediateRDDStorageLevel (undocumented)
   * @param finalRDDStorageLevel (undocumented)
   * @param checkpointInterval (undocumented)
   * @param seed (undocumented)
   * @param evidence$1 (undocumented)
   * @param ord (undocumented)
   * @return (undocumented)
   */
  static public <ID extends java.lang.Object> scala.Tuple2<org.apache.spark.rdd.RDD<scala.Tuple2<ID, float[]>>, org.apache.spark.rdd.RDD<scala.Tuple2<ID, float[]>>> train (org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<ID>> ratings, int rank, int numUserBlocks, int numItemBlocks, int maxIter, double regParam, boolean implicitPrefs, double alpha, boolean nonnegative, org.apache.spark.storage.StorageLevel intermediateRDDStorageLevel, org.apache.spark.storage.StorageLevel finalRDDStorageLevel, int checkpointInterval, long seed, scala.reflect.ClassTag<ID> evidence$1, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
  /**
   * Initializes factors randomly given the in-link blocks.
   * <p>
   * @param inBlocks in-link blocks
   * @param rank rank
   * @return initialized factor blocks
   * @param seed (undocumented)
   */
  static private <ID extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, float[][]>> initialize (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.ml.recommendation.ALS.InBlock<ID>>> inBlocks, int rank, long seed)  { throw new RuntimeException(); }
  /**
   * Partitions raw ratings into blocks.
   * <p>
   * @param ratings raw ratings
   * @param srcPart partitioner for src IDs
   * @param dstPart partitioner for dst IDs
   * @return an RDD of rating blocks in the form of ((srcBlockId, dstBlockId), ratingBlock)
   * @param evidence$5 (undocumented)
   */
  static private <ID extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.ml.recommendation.ALS.RatingBlock<ID>>> partitionRatings (org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<ID>> ratings, org.apache.spark.Partitioner srcPart, org.apache.spark.Partitioner dstPart, scala.reflect.ClassTag<ID> evidence$5)  { throw new RuntimeException(); }
  /**
   * Creates in-blocks and out-blocks from rating blocks.
   * <p>
   * @param prefix prefix for in/out-block names
   * @param ratingBlocks rating blocks
   * @param srcPart partitioner for src IDs
   * @param dstPart partitioner for dst IDs
   * @return (in-blocks, out-blocks)
   * @param storageLevel (undocumented)
   * @param evidence$10 (undocumented)
   * @param srcOrd (undocumented)
   */
  static private <ID extends java.lang.Object> scala.Tuple2<org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.ml.recommendation.ALS.InBlock<ID>>>, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, int[][]>>> makeBlocks (java.lang.String prefix, org.apache.spark.rdd.RDD<scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.ml.recommendation.ALS.RatingBlock<ID>>> ratingBlocks, org.apache.spark.Partitioner srcPart, org.apache.spark.Partitioner dstPart, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<ID> evidence$10, scala.math.Ordering<ID> srcOrd)  { throw new RuntimeException(); }
  /**
   * Compute dst factors by constructing and solving least square problems.
   * <p>
   * @param srcFactorBlocks src factors
   * @param srcOutBlocks src out-blocks
   * @param dstInBlocks dst in-blocks
   * @param rank rank
   * @param regParam regularization constant
   * @param srcEncoder encoder for src local indices
   * @param implicitPrefs whether to use implicit preference
   * @param alpha the alpha constant in the implicit preference formulation
   * @param solver solver for least squares problems
   * @return dst factors
   */
  static private <ID extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, float[][]>> computeFactors (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, float[][]>> srcFactorBlocks, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, int[][]>> srcOutBlocks, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.ml.recommendation.ALS.InBlock<ID>>> dstInBlocks, int rank, double regParam, org.apache.spark.ml.recommendation.ALS.LocalIndexEncoder srcEncoder, boolean implicitPrefs, double alpha, org.apache.spark.ml.recommendation.ALS.LeastSquaresNESolver solver)  { throw new RuntimeException(); }
  /**
   * Computes the Gramian matrix of user or item factors, which is only used in implicit preference.
   * Caching of the input factors is handled in {@link ALS#train}.
   * @param factorBlocks (undocumented)
   * @param rank (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.ml.recommendation.ALS.NormalEquation computeYtY (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, float[][]>> factorBlocks, int rank)  { throw new RuntimeException(); }
  /**
   * Private function to clean up all of the shuffles files from the dependencies and their parents.
   * @param sc (undocumented)
   * @param deps (undocumented)
   * @param blocking (undocumented)
   */
  static  <T extends java.lang.Object> void cleanShuffleDependencies (org.apache.spark.SparkContext sc, scala.collection.Seq<org.apache.spark.Dependency<?>> deps, boolean blocking)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<?>[] params ()  { throw new RuntimeException(); }
  static public  java.lang.String explainParam (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public  java.lang.String explainParams ()  { throw new RuntimeException(); }
  static public final  boolean isSet (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public final  boolean isDefined (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public  boolean hasParam (java.lang.String paramName)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.Object> getParam (java.lang.String paramName)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params set (java.lang.String param, Object value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.ParamPair<?> paramPair)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> scala.Option<T> get (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Params clear (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> T getOrDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> T $ (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> org.apache.spark.ml.param.Params setDefault (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params setDefault (scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> scala.Option<T> getDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> boolean hasDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends org.apache.spark.ml.param.Params> T defaultCopy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.ParamMap extractParamMap (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.ParamMap extractParamMap ()  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.ml.param.Params> T copyValues (T to, org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.ml.param.Params> org.apache.spark.ml.param.ParamMap copyValues$default$2 ()  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getPredictionCol ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.String> userCol ()  { throw new RuntimeException(); }
  static public  java.lang.String getUserCol ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.String> itemCol ()  { throw new RuntimeException(); }
  static public  java.lang.String getItemCol ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.expressions.UserDefinedFunction checkedCast ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  static public final  int getMaxIter ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  static public final  double getRegParam ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam checkpointInterval ()  { throw new RuntimeException(); }
  static public final  int getCheckpointInterval ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  static public final  long getSeed ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.IntParam rank ()  { throw new RuntimeException(); }
  static public  int getRank ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.IntParam numUserBlocks ()  { throw new RuntimeException(); }
  static public  int getNumUserBlocks ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.IntParam numItemBlocks ()  { throw new RuntimeException(); }
  static public  int getNumItemBlocks ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.BooleanParam implicitPrefs ()  { throw new RuntimeException(); }
  static public  boolean getImplicitPrefs ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.DoubleParam alpha ()  { throw new RuntimeException(); }
  static public  double getAlpha ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.String> ratingCol ()  { throw new RuntimeException(); }
  static public  java.lang.String getRatingCol ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.BooleanParam nonnegative ()  { throw new RuntimeException(); }
  static public  boolean getNonnegative ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.String> intermediateStorageLevel ()  { throw new RuntimeException(); }
  static public  java.lang.String getIntermediateStorageLevel ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.String> finalStorageLevel ()  { throw new RuntimeException(); }
  static public  java.lang.String getFinalStorageLevel ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   ALS (java.lang.String uid)  { throw new RuntimeException(); }
  public   ALS ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setRank (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setNumUserBlocks (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setNumItemBlocks (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setImplicitPrefs (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setAlpha (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setUserCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setItemCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setRatingCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setRegParam (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setNonnegative (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setCheckpointInterval (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setSeed (long value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.recommendation.ALS setIntermediateStorageLevel (java.lang.String value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.recommendation.ALS setFinalStorageLevel (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets both numUserBlocks and numItemBlocks to the specific value.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.recommendation.ALS setNumBlocks (int value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.recommendation.ALSModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.recommendation.ALS copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
