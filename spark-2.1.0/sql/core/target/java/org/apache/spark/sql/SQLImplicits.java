package org.apache.spark.sql;
/**
 * A collection of implicit methods for converting common Scala objects into {@link Dataset}s.
 * <p>
 * @since 1.6.0
 */
public abstract class SQLImplicits {
  public   SQLImplicits ()  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.sql.SQLContext _sqlContext ()  ;
  /**
   * Converts $"col name" into a {@link Column}.
   * <p>
   * @since 2.0.0
   */
  public  class StringToColumn {
    public  scala.StringContext sc ()  { throw new RuntimeException(); }
    // not preceding
    public   StringToColumn (scala.StringContext sc)  { throw new RuntimeException(); }
  }
  /** @since 1.6.0 */
  public <T extends scala.Product> org.apache.spark.sql.Encoder<T> newProductEncoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$1)  { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newIntEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newLongEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newDoubleEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newFloatEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newByteEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newShortEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Object> newBooleanEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.0 */
  public  org.apache.spark.sql.Encoder<java.lang.String> newStringEncoder ()  { throw new RuntimeException(); }
  /** @since 2.0.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Integer> newBoxedIntEncoder ()  { throw new RuntimeException(); }
  /** @since 2.0.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Long> newBoxedLongEncoder ()  { throw new RuntimeException(); }
  /** @since 2.0.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Double> newBoxedDoubleEncoder ()  { throw new RuntimeException(); }
  /** @since 2.0.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Float> newBoxedFloatEncoder ()  { throw new RuntimeException(); }
  /** @since 2.0.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Byte> newBoxedByteEncoder ()  { throw new RuntimeException(); }
  /** @since 2.0.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Short> newBoxedShortEncoder ()  { throw new RuntimeException(); }
  /** @since 2.0.0 */
  public  org.apache.spark.sql.Encoder<java.lang.Boolean> newBoxedBooleanEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newIntSeqEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newLongSeqEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newDoubleSeqEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newFloatSeqEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newByteSeqEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newShortSeqEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newBooleanSeqEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.String>> newStringSeqEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public <A extends scala.Product> org.apache.spark.sql.Encoder<scala.collection.Seq<A>> newProductSeqEncoder (scala.reflect.api.TypeTags.TypeTag<A> evidence$2)  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<int[]> newIntArrayEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<long[]> newLongArrayEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<double[]> newDoubleArrayEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<float[]> newFloatArrayEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<byte[]> newByteArrayEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<short[]> newShortArrayEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<boolean[]> newBooleanArrayEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public  org.apache.spark.sql.Encoder<java.lang.String[]> newStringArrayEncoder ()  { throw new RuntimeException(); }
  /** @since 1.6.1 */
  public <A extends scala.Product> org.apache.spark.sql.Encoder<java.lang.Object> newProductArrayEncoder (scala.reflect.api.TypeTags.TypeTag<A> evidence$3)  { throw new RuntimeException(); }
  /**
   * Creates a {@link Dataset} from an RDD.
   * <p>
   * @since 1.6.0
   * @param rdd (undocumented)
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.DatasetHolder<T> rddToDatasetHolder (org.apache.spark.rdd.RDD<T> rdd, org.apache.spark.sql.Encoder<T> evidence$4)  { throw new RuntimeException(); }
  /**
   * Creates a {@link Dataset} from a local Seq.
   * @since 1.6.0
   * @param s (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.DatasetHolder<T> localSeqToDatasetHolder (scala.collection.Seq<T> s, org.apache.spark.sql.Encoder<T> evidence$5)  { throw new RuntimeException(); }
  /**
   * An implicit conversion that turns a Scala <code>Symbol</code> into a {@link Column}.
   * @since 1.3.0
   * @param s (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.ColumnName symbolToColumn (scala.Symbol s)  { throw new RuntimeException(); }
}
