package org.apache.spark.ml.feature;
/**
 * Model produced by {@link LSH}.
 */
 abstract class LSHModel<T extends org.apache.spark.ml.feature.LSHModel<T>> extends org.apache.spark.ml.Model<T> implements org.apache.spark.ml.feature.LSHParams, org.apache.spark.ml.util.MLWritable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.feature.LSHModel), List(TypeTree().setOriginal(Ident(TypeName("T"))))))))
  public   LSHModel ()  { throw new RuntimeException(); }
  /**
   * The hash function of LSH, mapping an input feature vector to multiple hash vectors.
   * @return The mapping of LSH function.
   */
  protected abstract  scala.Function1<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector[]> hashFunction ()  ;
  /**
   * Calculate the distance between two different keys using the distance metric corresponding
   * to the hashFunction.
   * @param x One input vector in the metric space.
   * @param y One input vector in the metric space.
   * @return The distance between x and y.
   */
  protected abstract  double keyDistance (org.apache.spark.ml.linalg.Vector x, org.apache.spark.ml.linalg.Vector y)  ;
  /**
   * Calculate the distance between two different hash Vectors.
   * <p>
   * @param x One of the hash vector.
   * @param y Another hash vector.
   * @return The distance between hash vectors x and y.
   */
  protected abstract  double hashDistance (scala.collection.Seq<org.apache.spark.ml.linalg.Vector> x, scala.collection.Seq<org.apache.spark.ml.linalg.Vector> y)  ;
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
    org.apache.spark.sql.Dataset<?> approxNearestNeighbors (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.linalg.Vector key, int numNearestNeighbors, boolean singleProbe, java.lang.String distCol)  { throw new RuntimeException(); }
  /**
   * Given a large dataset and an item, approximately find at most k items which have the closest
   * distance to the item. If the {@link outputCol} is missing, the method will transform the data; if
   * the {@link outputCol} exists, it will use the {@link outputCol}. This allows caching of the
   * transformed data when necessary.
   * <p>
   * @note This method is experimental and will likely change behavior in the next release.
   * <p>
   * @param dataset The dataset to search for nearest neighbors of the key.
   * @param key Feature vector representing the item to search for.
   * @param numNearestNeighbors The maximum number of nearest neighbors.
   * @param distCol Output column for storing the distance between each result row and the key.
   * @return A dataset containing at most k items closest to the key. A column "distCol" is added
   *         to show the distance between each row and the key.
   */
  public  org.apache.spark.sql.Dataset<?> approxNearestNeighbors (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.linalg.Vector key, int numNearestNeighbors, java.lang.String distCol)  { throw new RuntimeException(); }
  /**
   * Overloaded method for approxNearestNeighbors. Use "distCol" as default distCol.
   * @param dataset (undocumented)
   * @param key (undocumented)
   * @param numNearestNeighbors (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<?> approxNearestNeighbors (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.linalg.Vector key, int numNearestNeighbors)  { throw new RuntimeException(); }
  /**
   * Preprocess step for approximate similarity join. Transform and explode the {@link outputCol} to
   * two explodeCols: entry and value. "entry" is the index in hash vector, and "value" is the
   * value of corresponding value of the index in the vector.
   * <p>
   * @param dataset The dataset to transform and explode.
   * @param explodeCols The alias for the exploded columns, must be a seq of two strings.
   * @return A dataset containing idCol, inputCol and explodeCols.
   * @param inputName (undocumented)
   */
  private  org.apache.spark.sql.Dataset<?> processDataset (org.apache.spark.sql.Dataset<?> dataset, java.lang.String inputName, scala.collection.Seq<java.lang.String> explodeCols)  { throw new RuntimeException(); }
  /**
   * Recreate a column using the same column name but different attribute id. Used in approximate
   * similarity join.
   * @param dataset The dataset where a column need to recreate.
   * @param colName The name of the column to recreate.
   * @param tmpColName A temporary column name which does not conflict with existing columns.
   * @return
   */
  private  org.apache.spark.sql.Dataset<?> recreateCol (org.apache.spark.sql.Dataset<?> dataset, java.lang.String colName, java.lang.String tmpColName)  { throw new RuntimeException(); }
  /**
   * Join two dataset to approximately find all pairs of rows whose distance are smaller than
   * the threshold. If the {@link outputCol} is missing, the method will transform the data; if the
   * {@link outputCol} exists, it will use the {@link outputCol}. This allows caching of the transformed
   * data when necessary.
   * <p>
   * @param datasetA One of the datasets to join.
   * @param datasetB Another dataset to join.
   * @param threshold The threshold for the distance of row pairs.
   * @param distCol Output column for storing the distance between each result row and the key.
   * @return A joined dataset containing pairs of rows. The original rows are in columns
   *         "datasetA" and "datasetB", and a distCol is added to show the distance of each pair.
   */
  public  org.apache.spark.sql.Dataset<?> approxSimilarityJoin (org.apache.spark.sql.Dataset<?> datasetA, org.apache.spark.sql.Dataset<?> datasetB, double threshold, java.lang.String distCol)  { throw new RuntimeException(); }
  /**
   * Overloaded method for approxSimilarityJoin. Use "distCol" as default distCol.
   * @param datasetA (undocumented)
   * @param datasetB (undocumented)
   * @param threshold (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<?> approxSimilarityJoin (org.apache.spark.sql.Dataset<?> datasetA, org.apache.spark.sql.Dataset<?> datasetB, double threshold)  { throw new RuntimeException(); }
}
