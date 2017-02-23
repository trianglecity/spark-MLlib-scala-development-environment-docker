package org.apache.spark.mllib.feature;
/**
 * Maps a sequence of terms to their term frequencies using the hashing trick.
 * <p>
 * param:  numFeatures number of features (default: 2^20^)
 */
public  class HashingTF implements scala.Serializable {
  static   java.lang.String Native ()  { throw new RuntimeException(); }
  static   java.lang.String Murmur3 ()  { throw new RuntimeException(); }
  static private  int seed ()  { throw new RuntimeException(); }
  /**
   * Calculate a hash code value for the term object using the native Scala implementation.
   * This is the default hash algorithm used in Spark 1.6 and earlier.
   * @param term (undocumented)
   * @return (undocumented)
   */
  static   int nativeHash (Object term)  { throw new RuntimeException(); }
  /**
   * Calculate a hash code value for the term object using
   * Austin Appleby's MurmurHash 3 algorithm (MurmurHash3_x86_32).
   * This is the default hash algorithm used from Spark 2.0 onwards.
   * @param term (undocumented)
   * @return (undocumented)
   */
  static   int murmur3Hash (Object term)  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public   HashingTF (int numFeatures)  { throw new RuntimeException(); }
  private  boolean binary ()  { throw new RuntimeException(); }
  private  java.lang.String hashAlgorithm ()  { throw new RuntimeException(); }
  /**
   */
  public   HashingTF ()  { throw new RuntimeException(); }
  /**
   * If true, term frequency vector will be binary such that non-zero term counts will be set to 1
   * (default: false)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.HashingTF setBinary (boolean value)  { throw new RuntimeException(); }
  /**
   * Set the hash algorithm used when mapping term to integer.
   * (default: murmur3)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.HashingTF setHashAlgorithm (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Returns the index of the input term.
   * @param term (undocumented)
   * @return (undocumented)
   */
  public  int indexOf (Object term)  { throw new RuntimeException(); }
  /**
   * Get the hash function corresponding to the current {@link hashAlgorithm} setting.
   * @return (undocumented)
   */
  private  scala.Function1<java.lang.Object, java.lang.Object> getHashFunction ()  { throw new RuntimeException(); }
  /**
   * Transforms the input document into a sparse term frequency vector.
   * @param document (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector transform (scala.collection.Iterable<?> document)  { throw new RuntimeException(); }
  /**
   * Transforms the input document into a sparse term frequency vector (Java version).
   * @param document (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector transform (java.lang.Iterable<?> document)  { throw new RuntimeException(); }
  /**
   * Transforms the input document to term frequency vectors.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public <D extends scala.collection.Iterable<?>> org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> transform (org.apache.spark.rdd.RDD<D> dataset)  { throw new RuntimeException(); }
  /**
   * Transforms the input document to term frequency vectors (Java version).
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public <D extends java.lang.Iterable<?>> org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> transform (org.apache.spark.api.java.JavaRDD<D> dataset)  { throw new RuntimeException(); }
}
