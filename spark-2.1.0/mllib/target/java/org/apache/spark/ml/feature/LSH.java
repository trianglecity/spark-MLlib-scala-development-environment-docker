package org.apache.spark.ml.feature;
/**
 * Locality Sensitive Hashing for different metrics space. Support basic transformation with a new
 * hash column, approximate nearest neighbor search with a dataset and a key, and approximate
 * similarity join of two datasets.
 * <p>
 * This LSH class implements OR-amplification: more than 1 hash functions can be chosen, and each
 * input vector are hashed by all hash functions. Two input vectors are defined to be in the same
 * bucket as long as ANY one of the hash value matches.
 * <p>
 * References:
 * (1) Gionis, Aristides, Piotr Indyk, and Rajeev Motwani. "Similarity search in high dimensions
 * via hashing." VLDB 7 Sep. 1999: 518-529.
 * (2) Wang, Jingdong et al. "Hashing for similarity search: A survey." arXiv preprint
 * arXiv:1408.2927 (2014).
 */
 abstract class LSH<T extends org.apache.spark.ml.feature.LSHModel<T>> extends org.apache.spark.ml.Estimator<T> implements org.apache.spark.ml.feature.LSHParams, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.feature.LSHModel), List(TypeTree().setOriginal(Ident(TypeName("T"))))))))
  public   LSH ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.LSH<T> setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.LSH<T> setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.LSH<T> setNumHashTables (int value)  { throw new RuntimeException(); }
  /**
   * Validate and create a new instance of concrete LSHModel. Because different LSHModel may have
   * different initial setting, developer needs to define how their LSHModel is created instead of
   * using reflection in this abstract class.
   * @param inputDim The dimension of the input dataset
   * @return A new LSHModel instance without any params
   */
  protected abstract  T createRawLSHModel (int inputDim)  ;
  public  T fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
}
