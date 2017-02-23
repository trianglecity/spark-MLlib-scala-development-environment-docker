package org.apache.spark.mllib.fpm;
/**
 * Model fitted by {@link PrefixSpan}
 * param:  freqSequences frequent sequences
 * @tparam Item item type
 */
public  class PrefixSpanModel<Item extends java.lang.Object> implements org.apache.spark.mllib.util.Saveable, scala.Serializable {
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    private  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
    private  java.lang.String thisClassName ()  { throw new RuntimeException(); }
    public  void save (org.apache.spark.mllib.fpm.PrefixSpanModel<?> model, java.lang.String path)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.fpm.PrefixSpanModel<?> load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
    public <Item extends java.lang.Object> org.apache.spark.mllib.fpm.PrefixSpanModel<Item> loadImpl (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> freqSequences, Item sample, scala.reflect.ClassTag<Item> evidence$2)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.mllib.fpm.PrefixSpanModel<?> load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.PrefixSpan.FreqSequence<Item>> freqSequences ()  { throw new RuntimeException(); }
  // not preceding
  public   PrefixSpanModel (org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.PrefixSpan.FreqSequence<Item>> freqSequences)  { throw new RuntimeException(); }
  /**
   * Save this model to the given path.
   * It only works for Item datatypes supported by DataFrames.
   * <p>
   * This saves:
   *  - human-readable (JSON) model metadata to path/metadata/
   *  - Parquet formatted data to path/data/
   * <p>
   * The model may be loaded using <code>PrefixSpanModel.load</code>.
   * <p>
   * @param sc  Spark context used to save model data.
   * @param path  Path specifying the directory in which to save this model.
   *              If the directory already exists, this method throws an exception.
   */
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
}
