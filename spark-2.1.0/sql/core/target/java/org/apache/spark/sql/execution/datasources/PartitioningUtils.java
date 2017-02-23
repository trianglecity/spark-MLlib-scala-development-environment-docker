package org.apache.spark.sql.execution.datasources;
public  class PartitioningUtils {
  static   class PartitionValues implements scala.Product, scala.Serializable {
    public  scala.collection.Seq<java.lang.String> columnNames ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> literals ()  { throw new RuntimeException(); }
    // not preceding
    public   PartitionValues (scala.collection.Seq<java.lang.String> columnNames, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> literals)  { throw new RuntimeException(); }
  }
  static public  class PartitionValues$ extends scala.runtime.AbstractFunction2<scala.collection.Seq<java.lang.String>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal>, org.apache.spark.sql.execution.datasources.PartitioningUtils.PartitionValues> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PartitionValues$ MODULE$ = null;
    public   PartitionValues$ ()  { throw new RuntimeException(); }
  }
  /**
   * Given a group of qualified paths, tries to parse them and returns a partition specification.
   * For example, given:
   * <pre><code>
   *   hdfs://&lt;host&gt;:&lt;port&gt;/path/to/partition/a=1/b=hello/c=3.14
   *   hdfs://&lt;host&gt;:&lt;port&gt;/path/to/partition/a=2/b=world/c=6.28
   * </code></pre>
   * it returns:
   * <pre><code>
   *   PartitionSpec(
   *     partitionColumns = StructType(
   *       StructField(name = "a", dataType = IntegerType, nullable = true),
   *       StructField(name = "b", dataType = StringType, nullable = true),
   *       StructField(name = "c", dataType = DoubleType, nullable = true)),
   *     partitions = Seq(
   *       Partition(
   *         values = Row(1, "hello", 3.14),
   *         path = "hdfs://&lt;host&gt;:&lt;port&gt;/path/to/partition/a=1/b=hello/c=3.14"),
   *       Partition(
   *         values = Row(2, "world", 6.28),
   *         path = "hdfs://&lt;host&gt;:&lt;port&gt;/path/to/partition/a=2/b=world/c=6.28")))
   * </code></pre>
   * @param paths (undocumented)
   * @param typeInference (undocumented)
   * @param basePaths (undocumented)
   * @return (undocumented)
   */
  static   org.apache.spark.sql.execution.datasources.PartitionSpec parsePartitions (scala.collection.Seq<org.apache.hadoop.fs.Path> paths, boolean typeInference, scala.collection.immutable.Set<org.apache.hadoop.fs.Path> basePaths)  { throw new RuntimeException(); }
  /**
   * Parses a single partition, returns column names and values of each partition column, also
   * the path when we stop partition discovery.  For example, given:
   * <pre><code>
   *   path = hdfs://&lt;host&gt;:&lt;port&gt;/path/to/partition/a=42/b=hello/c=3.14
   * </code></pre>
   * it returns the partition:
   * <pre><code>
   *   PartitionValues(
   *     Seq("a", "b", "c"),
   *     Seq(
   *       Literal.create(42, IntegerType),
   *       Literal.create("hello", StringType),
   *       Literal.create(3.14, DoubleType)))
   * </code></pre>
   * and the path when we stop the discovery is:
   * <pre><code>
   *   hdfs://&lt;host&gt;:&lt;port&gt;/path/to/partition
   * </code></pre>
   * @param path (undocumented)
   * @param typeInference (undocumented)
   * @param basePaths (undocumented)
   * @return (undocumented)
   */
  static   scala.Tuple2<scala.Option<org.apache.spark.sql.execution.datasources.PartitioningUtils.PartitionValues>, scala.Option<org.apache.hadoop.fs.Path>> parsePartition (org.apache.hadoop.fs.Path path, boolean typeInference, scala.collection.immutable.Set<org.apache.hadoop.fs.Path> basePaths)  { throw new RuntimeException(); }
  static private  scala.Option<scala.Tuple2<java.lang.String, org.apache.spark.sql.catalyst.expressions.Literal>> parsePartitionColumn (java.lang.String columnSpec, boolean typeInference)  { throw new RuntimeException(); }
  /**
   * Given a partition path fragment, e.g. <code>fieldOne=1/fieldTwo=2</code>, returns a parsed spec
   * for that fragment as a <code>TablePartitionSpec</code>, e.g. <code>Map(("fieldOne", "1"), ("fieldTwo", "2"))</code>.
   * @param pathFragment (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> parsePathFragment (java.lang.String pathFragment)  { throw new RuntimeException(); }
  /**
   * Given a partition path fragment, e.g. <code>fieldOne=1/fieldTwo=2</code>, returns a parsed spec
   * for that fragment as a <code>Seq[(String, String)]</code>, e.g.
   * <code>Seq(("fieldOne", "1"), ("fieldTwo", "2"))</code>.
   * @param pathFragment (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> parsePathFragmentAsSeq (java.lang.String pathFragment)  { throw new RuntimeException(); }
  /**
   * This is the inverse of parsePathFragment().
   * @param spec (undocumented)
   * @param partitionSchema (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getPathFragment (scala.collection.immutable.Map<java.lang.String, java.lang.String> spec, org.apache.spark.sql.types.StructType partitionSchema)  { throw new RuntimeException(); }
  /**
   * Normalize the column names in partition specification, w.r.t. the real partition column names
   * and case sensitivity. e.g., if the partition spec has a column named <code>monTh</code>, and there is a
   * partition column named <code>month</code>, and it's case insensitive, we will normalize <code>monTh</code> to
   * <code>month</code>.
   * @param partitionSpec (undocumented)
   * @param partColNames (undocumented)
   * @param tblName (undocumented)
   * @param resolver (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.collection.immutable.Map<java.lang.String, T> normalizePartitionSpec (scala.collection.immutable.Map<java.lang.String, T> partitionSpec, scala.collection.Seq<java.lang.String> partColNames, java.lang.String tblName, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver)  { throw new RuntimeException(); }
  /**
   * Resolves possible type conflicts between partitions by up-casting "lower" types.  The up-
   * casting order is:
   * <pre><code>
   *   NullType -&gt;
   *   IntegerType -&gt; LongType -&gt;
   *   DoubleType -&gt; StringType
   * </code></pre>
   * @param pathsWithPartitionValues (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitioningUtils.PartitionValues> resolvePartitions (scala.collection.Seq<scala.Tuple2<org.apache.hadoop.fs.Path, org.apache.spark.sql.execution.datasources.PartitioningUtils.PartitionValues>> pathsWithPartitionValues)  { throw new RuntimeException(); }
  static   java.lang.String listConflictingPartitionColumns (scala.collection.Seq<scala.Tuple2<org.apache.hadoop.fs.Path, org.apache.spark.sql.execution.datasources.PartitioningUtils.PartitionValues>> pathWithPartitionValues)  { throw new RuntimeException(); }
  /**
   * Converts a string to a {@link Literal} with automatic type inference.  Currently only supports
   * {@link IntegerType}, {@link LongType}, {@link DoubleType}, {@link DecimalType}, {@link DateType}
   * {@link TimestampType}, and {@link StringType}.
   * @param raw (undocumented)
   * @param typeInference (undocumented)
   * @return (undocumented)
   */
  static   org.apache.spark.sql.catalyst.expressions.Literal inferPartitionColumnValue (java.lang.String raw, boolean typeInference)  { throw new RuntimeException(); }
  static private  scala.collection.Seq<org.apache.spark.sql.types.DataType> upCastingOrder ()  { throw new RuntimeException(); }
  static public  void validatePartitionColumn (org.apache.spark.sql.types.StructType schema, scala.collection.Seq<java.lang.String> partitionColumns, boolean caseSensitive)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType partitionColumnsSchema (org.apache.spark.sql.types.StructType schema, scala.collection.Seq<java.lang.String> partitionColumns, boolean caseSensitive)  { throw new RuntimeException(); }
  static private  scala.Function2<java.lang.String, java.lang.String, java.lang.Object> columnNameEquality (boolean caseSensitive)  { throw new RuntimeException(); }
  /**
   * Given a collection of {@link Literal}s, resolves possible type conflicts by up-casting "lower"
   * types.
   * @param literals (undocumented)
   * @return (undocumented)
   */
  static private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> resolveTypeConflicts (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> literals)  { throw new RuntimeException(); }
}
