package org.apache.spark.mllib.fpm;
/**
 * Model trained by {@link FPGrowth}, which holds frequent itemsets.
 * param:  freqItemsets frequent itemset, which is an RDD of <code>FreqItemset</code>
 * @tparam Item item type
 */
public  class FPGrowthModel<Item extends java.lang.Object> implements org.apache.spark.mllib.util.Saveable, scala.Serializable {
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    private  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
    private  java.lang.String thisClassName ()  { throw new RuntimeException(); }
    public  void save (org.apache.spark.mllib.fpm.FPGrowthModel<?> model, java.lang.String path)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.fpm.FPGrowthModel<?> load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
    public <Item extends java.lang.Object> org.apache.spark.mllib.fpm.FPGrowthModel<Item> loadImpl (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> freqItemsets, Item sample, scala.reflect.ClassTag<Item> evidence$2)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.mllib.fpm.FPGrowthModel<?> load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.FPGrowth.FreqItemset<Item>> freqItemsets ()  { throw new RuntimeException(); }
  // not preceding
  public   FPGrowthModel (org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.FPGrowth.FreqItemset<Item>> freqItemsets, scala.reflect.ClassTag<Item> evidence$1)  { throw new RuntimeException(); }
  /**
   * Generates association rules for the {@link Item}s in {@link freqItemsets}.
   * @param confidence minimal confidence of the rules produced
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.AssociationRules.Rule<Item>> generateAssociationRules (double confidence)  { throw new RuntimeException(); }
  /**
   * Save this model to the given path.
   * It only works for Item datatypes supported by DataFrames.
   * <p>
   * This saves:
   *  - human-readable (JSON) model metadata to path/metadata/
   *  - Parquet formatted data to path/data/
   * <p>
   * The model may be loaded using <code>FPGrowthModel.load</code>.
   * <p>
   * @param sc  Spark context used to save model data.
   * @param path  Path specifying the directory in which to save this model.
   *              If the directory already exists, this method throws an exception.
   */
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
}
