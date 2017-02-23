package org.apache.spark.mllib.feature;
/**
 * Chi Squared selector model.
 * <p>
 * param:  selectedFeatures list of indices to select (filter).
 */
public  class ChiSqSelectorModel implements org.apache.spark.mllib.feature.VectorTransformer, org.apache.spark.mllib.util.Saveable {
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    private  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
    /** Model data for import/export */
    public  class Data implements scala.Product, scala.Serializable {
      public  int feature ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (int feature)  { throw new RuntimeException(); }
    }
    public  class Data extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.mllib.feature.ChiSqSelectorModel.SaveLoadV1_0.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
      java.lang.String thisClassName ()  { throw new RuntimeException(); }
    public  void save (org.apache.spark.SparkContext sc, org.apache.spark.mllib.feature.ChiSqSelectorModel model, java.lang.String path)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.feature.ChiSqSelectorModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.mllib.feature.ChiSqSelectorModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  int[] selectedFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public   ChiSqSelectorModel (int[] selectedFeatures)  { throw new RuntimeException(); }
  private  int[] filterIndices ()  { throw new RuntimeException(); }
  /**
   * @deprecated not intended for subclasses to use. Since 2.1.0. 
  */
  protected  boolean isSorted (int[] array)  { throw new RuntimeException(); }
  /**
   * Applies transformation on a vector.
   * <p>
   * @param vector vector to be transformed.
   * @return transformed vector.
   */
  public  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
  /**
   * Returns a vector with features filtered.
   * Preserves the order of filtered features the same as their indices are stored.
   * Might be moved to Vector as .slice
   * @param features vector
   * @return (undocumented)
   */
  private  org.apache.spark.mllib.linalg.Vector compress (org.apache.spark.mllib.linalg.Vector features)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
}
