package org.apache.spark.mllib.recommendation;
/**
 * Top-level methods for calling Alternating Least Squares (ALS) matrix factorization.
 */
public  class ALS$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ALS$ MODULE$ = null;
  public   ALS$ ()  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of ratings by users for a subset of products.
   * The ratings matrix is approximated as the product of two lower-rank matrices of a given rank
   * (number of features). To solve for these features, ALS is run iteratively with a configurable
   * level of parallelism.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @param lambda     regularization parameter
   * @param blocks     level of parallelism to split computation into
   * @param seed       random seed for initial matrix factorization model
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, long seed)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of ratings by users for a subset of products.
   * The ratings matrix is approximated as the product of two lower-rank matrices of a given rank
   * (number of features). To solve for these features, ALS is run iteratively with a configurable
   * level of parallelism.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @param lambda     regularization parameter
   * @param blocks     level of parallelism to split computation into
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of ratings by users for a subset of products.
   * The ratings matrix is approximated as the product of two lower-rank matrices of a given rank
   * (number of features). To solve for these features, ALS is run iteratively with a level of
   * parallelism automatically based on the number of partitions in <code>ratings</code>.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @param lambda     regularization parameter
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of ratings by users for a subset of products.
   * The ratings matrix is approximated as the product of two lower-rank matrices of a given rank
   * (number of features). To solve for these features, ALS is run iteratively with a level of
   * parallelism automatically based on the number of partitions in <code>ratings</code>.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of 'implicit preferences' given by users
   * to some products, in the form of (userID, productID, preference) pairs. We approximate the
   * ratings matrix as the product of two lower-rank matrices of a given rank (number of features).
   * To solve for these features, we run a given number of iterations of ALS. This is done using
   * a level of parallelism given by <code>blocks</code>.
   * <p>
   * @param ratings    RDD of (userID, productID, rating) pairs
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @param lambda     regularization parameter
   * @param blocks     level of parallelism to split computation into
   * @param alpha      confidence parameter
   * @param seed       random seed for initial matrix factorization model
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, double alpha, long seed)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of 'implicit preferences' of users for a
   * subset of products. The ratings matrix is approximated as the product of two lower-rank
   * matrices of a given rank (number of features). To solve for these features, ALS is run
   * iteratively with a configurable level of parallelism.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @param lambda     regularization parameter
   * @param blocks     level of parallelism to split computation into
   * @param alpha      confidence parameter
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, double alpha)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of 'implicit preferences' of users for a
   * subset of products. The ratings matrix is approximated as the product of two lower-rank
   * matrices of a given rank (number of features). To solve for these features, ALS is run
   * iteratively with a level of parallelism determined automatically based on the number of
   * partitions in <code>ratings</code>.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @param lambda     regularization parameter
   * @param alpha      confidence parameter
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, double alpha)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of 'implicit preferences' of users for a
   * subset of products. The ratings matrix is approximated as the product of two lower-rank
   * matrices of a given rank (number of features). To solve for these features, ALS is run
   * iteratively with a level of parallelism determined automatically based on the number of
   * partitions in <code>ratings</code>.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations)  { throw new RuntimeException(); }
}
