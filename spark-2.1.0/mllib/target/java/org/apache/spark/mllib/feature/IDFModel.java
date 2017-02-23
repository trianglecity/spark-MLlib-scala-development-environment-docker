package org.apache.spark.mllib.feature;
/**
 * Represents an IDF model that can transform term frequency vectors.
 */
public  class IDFModel implements scala.Serializable {
  public  org.apache.spark.mllib.linalg.Vector idf ()  { throw new RuntimeException(); }
  // not preceding
     IDFModel (org.apache.spark.mllib.linalg.Vector idf)  { throw new RuntimeException(); }
  /**
   * Transforms term frequency (TF) vectors to TF-IDF vectors.
   * <p>
   * If <code>minDocFreq</code> was set for the IDF calculation,
   * the terms which occur in fewer than <code>minDocFreq</code>
   * documents will have an entry of 0.
   * <p>
   * @param dataset an RDD of term frequency vectors
   * @return an RDD of TF-IDF vectors
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> transform (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> dataset)  { throw new RuntimeException(); }
  /**
   * Transforms a term frequency (TF) vector to a TF-IDF vector
   * <p>
   * @param v a term frequency vector
   * @return a TF-IDF vector
   */
  public  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector v)  { throw new RuntimeException(); }
  /**
   * Transforms term frequency (TF) vectors to TF-IDF vectors (Java version).
   * @param dataset a JavaRDD of term frequency vectors
   * @return a JavaRDD of TF-IDF vectors
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> transform (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> dataset)  { throw new RuntimeException(); }
}
