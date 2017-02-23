package org.apache.spark.sql;
/**
 * A Dataset is a strongly typed collection of domain-specific objects that can be transformed
 * in parallel using functional or relational operations. Each Dataset also has an untyped view
 * called a <code>DataFrame</code>, which is a Dataset of {@link Row}.
 * <p>
 * Operations available on Datasets are divided into transformations and actions. Transformations
 * are the ones that produce new Datasets, and actions are the ones that trigger computation and
 * return results. Example transformations include map, filter, select, and aggregate (<code>groupBy</code>).
 * Example actions count, show, or writing data out to file systems.
 * <p>
 * Datasets are "lazy", i.e. computations are only triggered when an action is invoked. Internally,
 * a Dataset represents a logical plan that describes the computation required to produce the data.
 * When an action is invoked, Spark's query optimizer optimizes the logical plan and generates a
 * physical plan for efficient execution in a parallel and distributed manner. To explore the
 * logical plan as well as optimized physical plan, use the <code>explain</code> function.
 * <p>
 * To efficiently support domain-specific objects, an {@link Encoder} is required. The encoder maps
 * the domain specific type <code>T</code> to Spark's internal type system. For example, given a class <code>Person</code>
 * with two fields, <code>name</code> (string) and <code>age</code> (int), an encoder is used to tell Spark to generate
 * code at runtime to serialize the <code>Person</code> object into a binary structure. This binary structure
 * often has much lower memory footprint as well as are optimized for efficiency in data processing
 * (e.g. in a columnar format). To understand the internal binary representation for data, use the
 * <code>schema</code> function.
 * <p>
 * There are typically two ways to create a Dataset. The most common way is by pointing Spark
 * to some files on storage systems, using the <code>read</code> function available on a <code>SparkSession</code>.
 * <pre><code>
 *   val people = spark.read.parquet("...").as[Person]  // Scala
 *   Dataset&lt;Person&gt; people = spark.read().parquet("...").as(Encoders.bean(Person.class)); // Java
 * </code></pre>
 * <p>
 * Datasets can also be created through transformations available on existing Datasets. For example,
 * the following creates a new Dataset by applying a filter on the existing one:
 * <pre><code>
 *   val names = people.map(_.name)  // in Scala; names is a Dataset[String]
 *   Dataset&lt;String&gt; names = people.map((Person p) -&gt; p.name, Encoders.STRING)); // in Java 8
 * </code></pre>
 * <p>
 * Dataset operations can also be untyped, through various domain-specific-language (DSL)
 * functions defined in: Dataset (this class), {@link Column}, and {@link functions}. These operations
 * are very similar to the operations available in the data frame abstraction in R or Python.
 * <p>
 * To select a column from the Dataset, use <code>apply</code> method in Scala and <code>col</code> in Java.
 * <pre><code>
 *   val ageCol = people("age")  // in Scala
 *   Column ageCol = people.col("age"); // in Java
 * </code></pre>
 * <p>
 * Note that the {@link Column} type can also be manipulated through its various functions.
 * <pre><code>
 *   // The following creates a new column that increases everybody's age by 10.
 *   people("age") + 10  // in Scala
 *   people.col("age").plus(10);  // in Java
 * </code></pre>
 * <p>
 * A more concrete example in Scala:
 * <pre><code>
 *   // To create Dataset[Row] using SparkSession
 *   val people = spark.read.parquet("...")
 *   val department = spark.read.parquet("...")
 *
 *   people.filter("age &gt; 30")
 *     .join(department, people("deptId") === department("id"))
 *     .groupBy(department("name"), "gender")
 *     .agg(avg(people("salary")), max(people("age")))
 * </code></pre>
 * <p>
 * and in Java:
 * <pre><code>
 *   // To create Dataset&lt;Row&gt; using SparkSession
 *   Dataset&lt;Row&gt; people = spark.read().parquet("...");
 *   Dataset&lt;Row&gt; department = spark.read().parquet("...");
 *
 *   people.filter("age".gt(30))
 *     .join(department, people.col("deptId").equalTo(department("id")))
 *     .groupBy(department.col("name"), "gender")
 *     .agg(avg(people.col("salary")), max(people.col("age")));
 * </code></pre>
 * <p>
 * @groupname basic Basic Dataset functions
 * @groupname action Actions
 * @groupname untypedrel Untyped transformations
 * @groupname typedrel Typed transformations
 * <p>
 * @since 1.6.0
 */
public  class Dataset<T extends java.lang.Object> implements scala.Serializable {
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> ofRows (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan)  { throw new RuntimeException(); }
  /**
   * Converts this strongly typed collection of data to generic <code>DataFrame</code> with columns renamed.
   * This can be quite convenient in conversion from an RDD of tuples into a <code>DataFrame</code> with
   * meaningful names. For example:
   * <pre><code>
   *   val rdd: RDD[(Int, String)] = ...
   *   rdd.toDF()  // this implicit conversion creates a DataFrame with column name `_1` and `_2`
   *   rdd.toDF("id", "name")  // this creates a DataFrame with column name "id" and "name"
   * </code></pre>
   * <p>
   * @group basic
   * @since 2.0.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> toDF (java.lang.String... colNames)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset with each partition sorted by the given expressions.
   * <p>
   * This is the same operation as "SORT BY" in SQL (Hive QL).
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param sortCol (undocumented)
   * @param sortCols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> sortWithinPartitions (java.lang.String sortCol, java.lang.String... sortCols)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset with each partition sorted by the given expressions.
   * <p>
   * This is the same operation as "SORT BY" in SQL (Hive QL).
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param sortExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> sortWithinPartitions (org.apache.spark.sql.Column... sortExprs)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset sorted by the specified column, all in ascending order.
   * <pre><code>
   *   // The following 3 are equivalent
   *   ds.sort("sortcol")
   *   ds.sort($"sortcol")
   *   ds.sort($"sortcol".asc)
   * </code></pre>
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param sortCol (undocumented)
   * @param sortCols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> sort (java.lang.String sortCol, java.lang.String... sortCols)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset sorted by the given expressions. For example:
   * <pre><code>
   *   ds.sort($"col1", $"col2".desc)
   * </code></pre>
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param sortExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> sort (org.apache.spark.sql.Column... sortExprs)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset sorted by the given expressions.
   * This is an alias of the <code>sort</code> function.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param sortCol (undocumented)
   * @param sortCols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> orderBy (java.lang.String sortCol, java.lang.String... sortCols)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset sorted by the given expressions.
   * This is an alias of the <code>sort</code> function.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param sortExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> orderBy (org.apache.spark.sql.Column... sortExprs)  { throw new RuntimeException(); }
  /**
   * Selects a set of column based expressions.
   * <pre><code>
   *   ds.select($"colA", $"colB" + 1)
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> select (org.apache.spark.sql.Column... cols)  { throw new RuntimeException(); }
  /**
   * Selects a set of columns. This is a variant of <code>select</code> that can only select
   * existing columns using column names (i.e. cannot construct expressions).
   * <p>
   * <pre><code>
   *   // The following two are equivalent:
   *   ds.select("colA", "colB")
   *   ds.select($"colA", $"colB")
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param col (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> select (java.lang.String col, java.lang.String... cols)  { throw new RuntimeException(); }
  /**
   * Selects a set of SQL expressions. This is a variant of <code>select</code> that accepts
   * SQL expressions.
   * <p>
   * <pre><code>
   *   // The following are equivalent:
   *   ds.selectExpr("colA", "colB as newName", "abs(colC)")
   *   ds.select(expr("colA"), expr("colB as newName"), expr("abs(colC)"))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> selectExpr (java.lang.String... exprs)  { throw new RuntimeException(); }
  /**
   * Groups the Dataset using the specified columns, so we can run aggregation on them. See
   * {@link RelationalGroupedDataset} for all the available aggregate functions.
   * <p>
   * <pre><code>
   *   // Compute the average for all numeric columns grouped by department.
   *   ds.groupBy($"department").avg()
   *
   *   // Compute the max age and average salary, grouped by department and gender.
   *   ds.groupBy($"department", $"gender").agg(Map(
   *     "salary" -&gt; "avg",
   *     "age" -&gt; "max"
   *   ))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset groupBy (org.apache.spark.sql.Column... cols)  { throw new RuntimeException(); }
  /**
   * Create a multi-dimensional rollup for the current Dataset using the specified columns,
   * so we can run aggregation on them.
   * See {@link RelationalGroupedDataset} for all the available aggregate functions.
   * <p>
   * <pre><code>
   *   // Compute the average for all numeric columns rolluped by department and group.
   *   ds.rollup($"department", $"group").avg()
   *
   *   // Compute the max age and average salary, rolluped by department and gender.
   *   ds.rollup($"department", $"gender").agg(Map(
   *     "salary" -&gt; "avg",
   *     "age" -&gt; "max"
   *   ))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset rollup (org.apache.spark.sql.Column... cols)  { throw new RuntimeException(); }
  /**
   * Create a multi-dimensional cube for the current Dataset using the specified columns,
   * so we can run aggregation on them.
   * See {@link RelationalGroupedDataset} for all the available aggregate functions.
   * <p>
   * <pre><code>
   *   // Compute the average for all numeric columns cubed by department and group.
   *   ds.cube($"department", $"group").avg()
   *
   *   // Compute the max age and average salary, cubed by department and gender.
   *   ds.cube($"department", $"gender").agg(Map(
   *     "salary" -&gt; "avg",
   *     "age" -&gt; "max"
   *   ))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset cube (org.apache.spark.sql.Column... cols)  { throw new RuntimeException(); }
  /**
   * Groups the Dataset using the specified columns, so that we can run aggregation on them.
   * See {@link RelationalGroupedDataset} for all the available aggregate functions.
   * <p>
   * This is a variant of groupBy that can only group by existing columns using column names
   * (i.e. cannot construct expressions).
   * <p>
   * <pre><code>
   *   // Compute the average for all numeric columns grouped by department.
   *   ds.groupBy("department").avg()
   *
   *   // Compute the max age and average salary, grouped by department and gender.
   *   ds.groupBy($"department", $"gender").agg(Map(
   *     "salary" -&gt; "avg",
   *     "age" -&gt; "max"
   *   ))
   * </code></pre>
   * @group untypedrel
   * @since 2.0.0
   * @param col1 (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset groupBy (java.lang.String col1, java.lang.String... cols)  { throw new RuntimeException(); }
  /**
   * Create a multi-dimensional rollup for the current Dataset using the specified columns,
   * so we can run aggregation on them.
   * See {@link RelationalGroupedDataset} for all the available aggregate functions.
   * <p>
   * This is a variant of rollup that can only group by existing columns using column names
   * (i.e. cannot construct expressions).
   * <p>
   * <pre><code>
   *   // Compute the average for all numeric columns rolluped by department and group.
   *   ds.rollup("department", "group").avg()
   *
   *   // Compute the max age and average salary, rolluped by department and gender.
   *   ds.rollup($"department", $"gender").agg(Map(
   *     "salary" -&gt; "avg",
   *     "age" -&gt; "max"
   *   ))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param col1 (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset rollup (java.lang.String col1, java.lang.String... cols)  { throw new RuntimeException(); }
  /**
   * Create a multi-dimensional cube for the current Dataset using the specified columns,
   * so we can run aggregation on them.
   * See {@link RelationalGroupedDataset} for all the available aggregate functions.
   * <p>
   * This is a variant of cube that can only group by existing columns using column names
   * (i.e. cannot construct expressions).
   * <p>
   * <pre><code>
   *   // Compute the average for all numeric columns cubed by department and group.
   *   ds.cube("department", "group").avg()
   *
   *   // Compute the max age and average salary, cubed by department and gender.
   *   ds.cube($"department", $"gender").agg(Map(
   *     "salary" -&gt; "avg",
   *     "age" -&gt; "max"
   *   ))
   * </code></pre>
   * @group untypedrel
   * @since 2.0.0
   * @param col1 (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset cube (java.lang.String col1, java.lang.String... cols)  { throw new RuntimeException(); }
  /**
   * Aggregates on the entire Dataset without groups.
   * <pre><code>
   *   // ds.agg(...) is a shorthand for ds.groupBy().agg(...)
   *   ds.agg(max($"age"), avg($"salary"))
   *   ds.groupBy().agg(max($"age"), avg($"salary"))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param expr (undocumented)
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> agg (org.apache.spark.sql.Column expr, org.apache.spark.sql.Column... exprs)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset with columns dropped.
   * This is a no-op if schema doesn't contain column name(s).
   * <p>
   * This method can only be used to drop top level columns. the colName string is treated literally
   * without further interpretation.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> drop (java.lang.String... colNames)  { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} with duplicate rows removed, considering only
   * the subset of columns.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param col1 (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> dropDuplicates (java.lang.String col1, java.lang.String... cols)  { throw new RuntimeException(); }
  /**
   * Computes statistics for numeric and string columns, including count, mean, stddev, min, and
   * max. If no columns are given, this function computes statistics for all numerical or string
   * columns.
   * <p>
   * This function is meant for exploratory data analysis, as we make no guarantee about the
   * backward compatibility of the schema of the resulting Dataset. If you want to
   * programmatically compute summary statistics, use the <code>agg</code> function instead.
   * <p>
   * <pre><code>
   *   ds.describe("age", "height").show()
   *
   *   // output:
   *   // summary age   height
   *   // count   10.0  10.0
   *   // mean    53.3  178.05
   *   // stddev  11.6  15.7
   *   // min     18.0  163.0
   *   // max     92.0  192.0
   * </code></pre>
   * <p>
   * @group action
   * @since 1.6.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> describe (java.lang.String... cols)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset partitioned by the given partitioning expressions into
   * <code>numPartitions</code>. The resulting Dataset is hash partitioned.
   * <p>
   * This is the same operation as "DISTRIBUTE BY" in SQL (Hive QL).
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param numPartitions (undocumented)
   * @param partitionExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> repartition (int numPartitions, org.apache.spark.sql.Column... partitionExprs)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset partitioned by the given partitioning expressions, using
   * <code>spark.sql.shuffle.partitions</code> as number of partitions.
   * The resulting Dataset is hash partitioned.
   * <p>
   * This is the same operation as "DISTRIBUTE BY" in SQL (Hive QL).
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param partitionExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> repartition (org.apache.spark.sql.Column... partitionExprs)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.QueryExecution queryExecution ()  { throw new RuntimeException(); }
  // not preceding
     Dataset (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.QueryExecution queryExecution, org.apache.spark.sql.Encoder<T> encoder)  { throw new RuntimeException(); }
  public   Dataset (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan, org.apache.spark.sql.Encoder<T> encoder)  { throw new RuntimeException(); }
  public   Dataset (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan, org.apache.spark.sql.Encoder<T> encoder)  { throw new RuntimeException(); }
    org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan ()  { throw new RuntimeException(); }
  /**
   * Currently {@link ExpressionEncoder} is the only implementation of {@link Encoder}, here we turn the
   * passed in encoder to {@link ExpressionEncoder} explicitly, and mark it implicit so that we can use
   * it when constructing new Dataset objects that have the same object type (that will be
   * possibly resolved to a different schema).
   * @return (undocumented)
   */
    org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> exprEnc ()  { throw new RuntimeException(); }
  /**
   * Encoder is used mostly as a container of serde expressions in Dataset.  We build logical
   * plans by these serde expressions and execute it within the query framework.  However, for
   * performance reasons we may want to use encoder as a function to deserialize internal rows to
   * custom objects, e.g. collect.  Here we resolve and bind the encoder so that we can call its
   * <code>fromRow</code> method later.
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> boundEnc ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<T> classTag ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
    org.apache.spark.sql.catalyst.expressions.NamedExpression resolve (java.lang.String colName)  { throw new RuntimeException(); }
    scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> numericColumns ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> aggregatableColumns ()  { throw new RuntimeException(); }
  /**
   * Compose the string representing rows for output
   * <p>
   * @param _numRows Number of rows to show
   * @param truncate If set to more than 0, truncates strings to <code>truncate</code> characters and
   *                   all cells will be aligned right.
   * @return (undocumented)
   */
    java.lang.String showString (int _numRows, int truncate)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Converts this strongly typed collection of data to generic Dataframe. In contrast to the
   * strongly typed objects that Dataset operations work on, a Dataframe returns generic {@link Row}
   * objects that allow fields to be accessed by ordinal or name.
   * <p>
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> toDF ()  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Returns a new Dataset where each record has been mapped on to the specified type. The
   * method used to map columns depend on the type of <code>U</code>:
   *  - When <code>U</code> is a class, fields for the class will be mapped to columns of the same name
   *    (case sensitivity is determined by <code>spark.sql.caseSensitive</code>).
   *  - When <code>U</code> is a tuple, the columns will be be mapped by ordinal (i.e. the first column will
   *    be assigned to <code>_1</code>).
   *  - When <code>U</code> is a primitive type (i.e. String, Int, etc), then the first column of the
   *    <code>DataFrame</code> will be used.
   * <p>
   * If the schema of the Dataset does not match the desired <code>U</code> type, you can use <code>select</code>
   * along with <code>alias</code> or <code>as</code> to rearrange or rename as required.
   * <p>
   * @group basic
   * @since 1.6.0
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> as (org.apache.spark.sql.Encoder<U> evidence$2)  { throw new RuntimeException(); }
  /**
   * Converts this strongly typed collection of data to generic <code>DataFrame</code> with columns renamed.
   * This can be quite convenient in conversion from an RDD of tuples into a <code>DataFrame</code> with
   * meaningful names. For example:
   * <pre><code>
   *   val rdd: RDD[(Int, String)] = ...
   *   rdd.toDF()  // this implicit conversion creates a DataFrame with column name `_1` and `_2`
   *   rdd.toDF("id", "name")  // this creates a DataFrame with column name "id" and "name"
   * </code></pre>
   * <p>
   * @group basic
   * @since 2.0.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> toDF (scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
  /**
   * Returns the schema of this Dataset.
   * <p>
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  /**
   * Prints the schema to the console in a nice tree format.
   * <p>
   * @group basic
   * @since 1.6.0
   */
  public  void printSchema ()  { throw new RuntimeException(); }
  /**
   * Prints the plans (logical and physical) to the console for debugging purposes.
   * <p>
   * @group basic
   * @since 1.6.0
   * @param extended (undocumented)
   */
  public  void explain (boolean extended)  { throw new RuntimeException(); }
  /**
   * Prints the physical plan to the console for debugging purposes.
   * <p>
   * @group basic
   * @since 1.6.0
   */
  public  void explain ()  { throw new RuntimeException(); }
  /**
   * Returns all column names and their data types as an array.
   * <p>
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  scala.Tuple2<java.lang.String, java.lang.String>[] dtypes ()  { throw new RuntimeException(); }
  /**
   * Returns all column names as an array.
   * <p>
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  java.lang.String[] columns ()  { throw new RuntimeException(); }
  /**
   * Returns true if the <code>collect</code> and <code>take</code> methods can be run locally
   * (without any Spark executors).
   * <p>
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  boolean isLocal ()  { throw new RuntimeException(); }
  /**
   * Returns true if this Dataset contains one or more sources that continuously
   * return data as it arrives. A Dataset that reads data from a streaming source
   * must be executed as a <code>StreamingQuery</code> using the <code>start()</code> method in
   * <code>DataStreamWriter</code>. Methods that return a single answer, e.g. <code>count()</code> or
   * <code>collect()</code>, will throw an {@link AnalysisException} when there is a streaming
   * source present.
   * <p>
   * @group streaming
   * @since 2.0.0
   * @return (undocumented)
   */
  public  boolean isStreaming ()  { throw new RuntimeException(); }
  /**
   * Eagerly checkpoint a Dataset and return the new Dataset. Checkpointing can be used to truncate
   * the logical plan of this Dataset, which is especially useful in iterative algorithms where the
   * plan may grow exponentially. It will be saved to files inside the checkpoint
   * directory set with <code>SparkContext#setCheckpointDir</code>.
   * <p>
   * @group basic
   * @since 2.1.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> checkpoint ()  { throw new RuntimeException(); }
  /**
   * Returns a checkpointed version of this Dataset. Checkpointing can be used to truncate the
   * logical plan of this Dataset, which is especially useful in iterative algorithms where the
   * plan may grow exponentially. It will be saved to files inside the checkpoint
   * directory set with <code>SparkContext#setCheckpointDir</code>.
   * <p>
   * @group basic
   * @since 2.1.0
   * @param eager (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> checkpoint (boolean eager)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Defines an event time watermark for this {@link Dataset}. A watermark tracks a point in time
   * before which we assume no more late data is going to arrive.
   * <p>
   * Spark will use this watermark for several purposes:
   *  - To know when a given time window aggregation can be finalized and thus can be emitted when
   *    using output modes that do not allow updates.
   *  - To minimize the amount of state that we need to keep for on-going aggregations.
   * <p>
   *  The current watermark is computed by looking at the <code>MAX(eventTime)</code> seen across
   *  all of the partitions in the query minus a user specified <code>delayThreshold</code>.  Due to the cost
   *  of coordinating this value across partitions, the actual watermark used is only guaranteed
   *  to be at least <code>delayThreshold</code> behind the actual event time.  In some cases we may still
   *  process records that arrive more than <code>delayThreshold</code> late.
   * <p>
   * @param eventTime the name of the column that contains the event time of the row.
   * @param delayThreshold the minimum delay to wait to data to arrive late, relative to the latest
   *                       record that has been processed in the form of an interval
   *                       (e.g. "1 minute" or "5 hours").
   * <p>
   * @group streaming
   * @since 2.1.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> withWatermark (java.lang.String eventTime, java.lang.String delayThreshold)  { throw new RuntimeException(); }
  /**
   * Displays the Dataset in a tabular form. Strings more than 20 characters will be truncated,
   * and all cells will be aligned right. For example:
   * <pre><code>
   *   year  month AVG('Adj Close) MAX('Adj Close)
   *   1980  12    0.503218        0.595103
   *   1981  01    0.523289        0.570307
   *   1982  02    0.436504        0.475256
   *   1983  03    0.410516        0.442194
   *   1984  04    0.450090        0.483521
   * </code></pre>
   * <p>
   * @param numRows Number of rows to show
   * <p>
   * @group action
   * @since 1.6.0
   */
  public  void show (int numRows)  { throw new RuntimeException(); }
  /**
   * Displays the top 20 rows of Dataset in a tabular form. Strings more than 20 characters
   * will be truncated, and all cells will be aligned right.
   * <p>
   * @group action
   * @since 1.6.0
   */
  public  void show ()  { throw new RuntimeException(); }
  /**
   * Displays the top 20 rows of Dataset in a tabular form.
   * <p>
   * @param truncate Whether truncate long strings. If true, strings more than 20 characters will
   *                 be truncated and all cells will be aligned right
   * <p>
   * @group action
   * @since 1.6.0
   */
  public  void show (boolean truncate)  { throw new RuntimeException(); }
  /**
   * Displays the Dataset in a tabular form. For example:
   * <pre><code>
   *   year  month AVG('Adj Close) MAX('Adj Close)
   *   1980  12    0.503218        0.595103
   *   1981  01    0.523289        0.570307
   *   1982  02    0.436504        0.475256
   *   1983  03    0.410516        0.442194
   *   1984  04    0.450090        0.483521
   * </code></pre>
   * @param numRows Number of rows to show
   * @param truncate Whether truncate long strings. If true, strings more than 20 characters will
   *              be truncated and all cells will be aligned right
   * <p>
   * @group action
   * @since 1.6.0
   */
  public  void show (int numRows, boolean truncate)  { throw new RuntimeException(); }
  /**
   * Displays the Dataset in a tabular form. For example:
   * <pre><code>
   *   year  month AVG('Adj Close) MAX('Adj Close)
   *   1980  12    0.503218        0.595103
   *   1981  01    0.523289        0.570307
   *   1982  02    0.436504        0.475256
   *   1983  03    0.410516        0.442194
   *   1984  04    0.450090        0.483521
   * </code></pre>
   * <p>
   * @param numRows Number of rows to show
   * @param truncate If set to more than 0, truncates strings to <code>truncate</code> characters and
   *                    all cells will be aligned right.
   * @group action
   * @since 1.6.0
   */
  public  void show (int numRows, int truncate)  { throw new RuntimeException(); }
  /**
   * Returns a {@link DataFrameNaFunctions} for working with missing data.
   * <pre><code>
   *   // Dropping rows containing any null values.
   *   ds.na.drop()
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameNaFunctions na ()  { throw new RuntimeException(); }
  /**
   * Returns a {@link DataFrameStatFunctions} for working statistic functions support.
   * <pre><code>
   *   // Finding frequent items in column with name 'a'.
   *   ds.stat.freqItems(Seq("a"))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameStatFunctions stat ()  { throw new RuntimeException(); }
  /**
   * Join with another <code>DataFrame</code>.
   * <p>
   * Behaves as an INNER JOIN and requires a subsequent join predicate.
   * <p>
   * @param right Right side of the join operation.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> join (org.apache.spark.sql.Dataset<?> right)  { throw new RuntimeException(); }
  /**
   * Inner equi-join with another <code>DataFrame</code> using the given column.
   * <p>
   * Different from other join functions, the join column will only appear once in the output,
   * i.e. similar to SQL's <code>JOIN USING</code> syntax.
   * <p>
   * <pre><code>
   *   // Joining df1 and df2 using the column "user_id"
   *   df1.join(df2, "user_id")
   * </code></pre>
   * <p>
   * @param right Right side of the join operation.
   * @param usingColumn Name of the column to join on. This column must exist on both sides.
   * <p>
   * @note If you perform a self-join using this function without aliasing the input
   * <code>DataFrame</code>s, you will NOT be able to reference any columns after the join, since
   * there is no way to disambiguate which side of the join you would like to reference.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> join (org.apache.spark.sql.Dataset<?> right, java.lang.String usingColumn)  { throw new RuntimeException(); }
  /**
   * Inner equi-join with another <code>DataFrame</code> using the given columns.
   * <p>
   * Different from other join functions, the join columns will only appear once in the output,
   * i.e. similar to SQL's <code>JOIN USING</code> syntax.
   * <p>
   * <pre><code>
   *   // Joining df1 and df2 using the columns "user_id" and "user_name"
   *   df1.join(df2, Seq("user_id", "user_name"))
   * </code></pre>
   * <p>
   * @param right Right side of the join operation.
   * @param usingColumns Names of the columns to join on. This columns must exist on both sides.
   * <p>
   * @note If you perform a self-join using this function without aliasing the input
   * <code>DataFrame</code>s, you will NOT be able to reference any columns after the join, since
   * there is no way to disambiguate which side of the join you would like to reference.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> join (org.apache.spark.sql.Dataset<?> right, scala.collection.Seq<java.lang.String> usingColumns)  { throw new RuntimeException(); }
  /**
   * Equi-join with another <code>DataFrame</code> using the given columns.
   * <p>
   * Different from other join functions, the join columns will only appear once in the output,
   * i.e. similar to SQL's <code>JOIN USING</code> syntax.
   * <p>
   * @param right Right side of the join operation.
   * @param usingColumns Names of the columns to join on. This columns must exist on both sides.
   * @param joinType One of: <code>inner</code>, <code>outer</code>, <code>left_outer</code>, <code>right_outer</code>, <code>leftsemi</code>.
   * <p>
   * @note If you perform a self-join using this function without aliasing the input
   * <code>DataFrame</code>s, you will NOT be able to reference any columns after the join, since
   * there is no way to disambiguate which side of the join you would like to reference.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> join (org.apache.spark.sql.Dataset<?> right, scala.collection.Seq<java.lang.String> usingColumns, java.lang.String joinType)  { throw new RuntimeException(); }
  /**
   * Inner join with another <code>DataFrame</code>, using the given join expression.
   * <p>
   * <pre><code>
   *   // The following two are equivalent:
   *   df1.join(df2, $"df1Key" === $"df2Key")
   *   df1.join(df2).where($"df1Key" === $"df2Key")
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param right (undocumented)
   * @param joinExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> join (org.apache.spark.sql.Dataset<?> right, org.apache.spark.sql.Column joinExprs)  { throw new RuntimeException(); }
  /**
   * Join with another <code>DataFrame</code>, using the given join expression. The following performs
   * a full outer join between <code>df1</code> and <code>df2</code>.
   * <p>
   * <pre><code>
   *   // Scala:
   *   import org.apache.spark.sql.functions._
   *   df1.join(df2, $"df1Key" === $"df2Key", "outer")
   *
   *   // Java:
   *   import static org.apache.spark.sql.functions.*;
   *   df1.join(df2, col("df1Key").equalTo(col("df2Key")), "outer");
   * </code></pre>
   * <p>
   * @param right Right side of the join.
   * @param joinExprs Join expression.
   * @param joinType One of: <code>inner</code>, <code>outer</code>, <code>left_outer</code>, <code>right_outer</code>, <code>leftsemi</code>.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> join (org.apache.spark.sql.Dataset<?> right, org.apache.spark.sql.Column joinExprs, java.lang.String joinType)  { throw new RuntimeException(); }
  /**
   * Explicit cartesian join with another <code>DataFrame</code>.
   * <p>
   * @param right Right side of the join operation.
   * <p>
   * @note Cartesian joins are very expensive without an extra filter that can be pushed down.
   * <p>
   * @group untypedrel
   * @since 2.1.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> crossJoin (org.apache.spark.sql.Dataset<?> right)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Joins this Dataset returning a <code>Tuple2</code> for each pair where <code>condition</code> evaluates to
   * true.
   * <p>
   * This is similar to the relation <code>join</code> function with one important difference in the
   * result schema. Since <code>joinWith</code> preserves objects present on either side of the join, the
   * result schema is similarly nested into a tuple under the column names <code>_1</code> and <code>_2</code>.
   * <p>
   * This type of join can be useful both for preserving type-safety with the original object
   * types as well as working with relational data where either side of the join has column
   * names in common.
   * <p>
   * @param other Right side of the join.
   * @param condition Join expression.
   * @param joinType One of: <code>inner</code>, <code>outer</code>, <code>left_outer</code>, <code>right_outer</code>, <code>leftsemi</code>.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple2<T, U>> joinWith (org.apache.spark.sql.Dataset<U> other, org.apache.spark.sql.Column condition, java.lang.String joinType)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Using inner equi-join to join this Dataset returning a <code>Tuple2</code> for each pair
   * where <code>condition</code> evaluates to true.
   * <p>
   * @param other Right side of the join.
   * @param condition Join expression.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple2<T, U>> joinWith (org.apache.spark.sql.Dataset<U> other, org.apache.spark.sql.Column condition)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset with each partition sorted by the given expressions.
   * <p>
   * This is the same operation as "SORT BY" in SQL (Hive QL).
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param sortCol (undocumented)
   * @param sortCols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> sortWithinPartitions (java.lang.String sortCol, scala.collection.Seq<java.lang.String> sortCols)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset with each partition sorted by the given expressions.
   * <p>
   * This is the same operation as "SORT BY" in SQL (Hive QL).
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param sortExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> sortWithinPartitions (scala.collection.Seq<org.apache.spark.sql.Column> sortExprs)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset sorted by the specified column, all in ascending order.
   * <pre><code>
   *   // The following 3 are equivalent
   *   ds.sort("sortcol")
   *   ds.sort($"sortcol")
   *   ds.sort($"sortcol".asc)
   * </code></pre>
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param sortCol (undocumented)
   * @param sortCols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> sort (java.lang.String sortCol, scala.collection.Seq<java.lang.String> sortCols)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset sorted by the given expressions. For example:
   * <pre><code>
   *   ds.sort($"col1", $"col2".desc)
   * </code></pre>
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param sortExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> sort (scala.collection.Seq<org.apache.spark.sql.Column> sortExprs)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset sorted by the given expressions.
   * This is an alias of the <code>sort</code> function.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param sortCol (undocumented)
   * @param sortCols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> orderBy (java.lang.String sortCol, scala.collection.Seq<java.lang.String> sortCols)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset sorted by the given expressions.
   * This is an alias of the <code>sort</code> function.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param sortExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> orderBy (scala.collection.Seq<org.apache.spark.sql.Column> sortExprs)  { throw new RuntimeException(); }
  /**
   * Selects column based on the column name and return it as a {@link Column}.
   * <p>
   * @note The column name can also reference to a nested column like <code>a.b</code>.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param colName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Column apply (java.lang.String colName)  { throw new RuntimeException(); }
  /**
   * Selects column based on the column name and return it as a {@link Column}.
   * <p>
   * @note The column name can also reference to a nested column like <code>a.b</code>.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param colName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Column col (java.lang.String colName)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset with an alias set.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param alias (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> as (java.lang.String alias)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Returns a new Dataset with an alias set.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param alias (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> as (scala.Symbol alias)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset with an alias set. Same as <code>as</code>.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param alias (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> alias (java.lang.String alias)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Returns a new Dataset with an alias set. Same as <code>as</code>.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param alias (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> alias (scala.Symbol alias)  { throw new RuntimeException(); }
  /**
   * Selects a set of column based expressions.
   * <pre><code>
   *   ds.select($"colA", $"colB" + 1)
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> select (scala.collection.Seq<org.apache.spark.sql.Column> cols)  { throw new RuntimeException(); }
  /**
   * Selects a set of columns. This is a variant of <code>select</code> that can only select
   * existing columns using column names (i.e. cannot construct expressions).
   * <p>
   * <pre><code>
   *   // The following two are equivalent:
   *   ds.select("colA", "colB")
   *   ds.select($"colA", $"colB")
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param col (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> select (java.lang.String col, scala.collection.Seq<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * Selects a set of SQL expressions. This is a variant of <code>select</code> that accepts
   * SQL expressions.
   * <p>
   * <pre><code>
   *   // The following are equivalent:
   *   ds.selectExpr("colA", "colB as newName", "abs(colC)")
   *   ds.select(expr("colA"), expr("colB as newName"), expr("abs(colC)"))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> selectExpr (scala.collection.Seq<java.lang.String> exprs)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Returns a new Dataset by computing the given {@link Column} expression for each element.
   * <p>
   * <pre><code>
   *   val ds = Seq(1, 2, 3).toDS()
   *   val newDS = ds.select(expr("value + 1").as[Int])
   * </code></pre>
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param c1 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object> org.apache.spark.sql.Dataset<U1> select (org.apache.spark.sql.TypedColumn<T, U1> c1)  { throw new RuntimeException(); }
  /**
   * Internal helper function for building typed selects that return tuples. For simplicity and
   * code reuse, we do this without the help of the type system and then use helper functions
   * that cast appropriately for the user facing interface.
   * @param columns (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.Dataset<?> selectUntyped (scala.collection.Seq<org.apache.spark.sql.TypedColumn<?, ?>> columns)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Returns a new Dataset by computing the given {@link Column} expressions for each element.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param c1 (undocumented)
   * @param c2 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object, U2 extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple2<U1, U2>> select (org.apache.spark.sql.TypedColumn<T, U1> c1, org.apache.spark.sql.TypedColumn<T, U2> c2)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Returns a new Dataset by computing the given {@link Column} expressions for each element.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param c1 (undocumented)
   * @param c2 (undocumented)
   * @param c3 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object, U2 extends java.lang.Object, U3 extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple3<U1, U2, U3>> select (org.apache.spark.sql.TypedColumn<T, U1> c1, org.apache.spark.sql.TypedColumn<T, U2> c2, org.apache.spark.sql.TypedColumn<T, U3> c3)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Returns a new Dataset by computing the given {@link Column} expressions for each element.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param c1 (undocumented)
   * @param c2 (undocumented)
   * @param c3 (undocumented)
   * @param c4 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object, U2 extends java.lang.Object, U3 extends java.lang.Object, U4 extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple4<U1, U2, U3, U4>> select (org.apache.spark.sql.TypedColumn<T, U1> c1, org.apache.spark.sql.TypedColumn<T, U2> c2, org.apache.spark.sql.TypedColumn<T, U3> c3, org.apache.spark.sql.TypedColumn<T, U4> c4)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Returns a new Dataset by computing the given {@link Column} expressions for each element.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param c1 (undocumented)
   * @param c2 (undocumented)
   * @param c3 (undocumented)
   * @param c4 (undocumented)
   * @param c5 (undocumented)
   * @return (undocumented)
   */
  public <U1 extends java.lang.Object, U2 extends java.lang.Object, U3 extends java.lang.Object, U4 extends java.lang.Object, U5 extends java.lang.Object> org.apache.spark.sql.Dataset<scala.Tuple5<U1, U2, U3, U4, U5>> select (org.apache.spark.sql.TypedColumn<T, U1> c1, org.apache.spark.sql.TypedColumn<T, U2> c2, org.apache.spark.sql.TypedColumn<T, U3> c3, org.apache.spark.sql.TypedColumn<T, U4> c4, org.apache.spark.sql.TypedColumn<T, U5> c5)  { throw new RuntimeException(); }
  /**
   * Filters rows using the given condition.
   * <pre><code>
   *   // The following are equivalent:
   *   peopleDs.filter($"age" &gt; 15)
   *   peopleDs.where($"age" &gt; 15)
   * </code></pre>
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param condition (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> filter (org.apache.spark.sql.Column condition)  { throw new RuntimeException(); }
  /**
   * Filters rows using the given SQL expression.
   * <pre><code>
   *   peopleDs.filter("age &gt; 15")
   * </code></pre>
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param conditionExpr (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> filter (java.lang.String conditionExpr)  { throw new RuntimeException(); }
  /**
   * Filters rows using the given condition. This is an alias for <code>filter</code>.
   * <pre><code>
   *   // The following are equivalent:
   *   peopleDs.filter($"age" &gt; 15)
   *   peopleDs.where($"age" &gt; 15)
   * </code></pre>
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param condition (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> where (org.apache.spark.sql.Column condition)  { throw new RuntimeException(); }
  /**
   * Filters rows using the given SQL expression.
   * <pre><code>
   *   peopleDs.where("age &gt; 15")
   * </code></pre>
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param conditionExpr (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> where (java.lang.String conditionExpr)  { throw new RuntimeException(); }
  /**
   * Groups the Dataset using the specified columns, so we can run aggregation on them. See
   * {@link RelationalGroupedDataset} for all the available aggregate functions.
   * <p>
   * <pre><code>
   *   // Compute the average for all numeric columns grouped by department.
   *   ds.groupBy($"department").avg()
   *
   *   // Compute the max age and average salary, grouped by department and gender.
   *   ds.groupBy($"department", $"gender").agg(Map(
   *     "salary" -&gt; "avg",
   *     "age" -&gt; "max"
   *   ))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset groupBy (scala.collection.Seq<org.apache.spark.sql.Column> cols)  { throw new RuntimeException(); }
  /**
   * Create a multi-dimensional rollup for the current Dataset using the specified columns,
   * so we can run aggregation on them.
   * See {@link RelationalGroupedDataset} for all the available aggregate functions.
   * <p>
   * <pre><code>
   *   // Compute the average for all numeric columns rolluped by department and group.
   *   ds.rollup($"department", $"group").avg()
   *
   *   // Compute the max age and average salary, rolluped by department and gender.
   *   ds.rollup($"department", $"gender").agg(Map(
   *     "salary" -&gt; "avg",
   *     "age" -&gt; "max"
   *   ))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset rollup (scala.collection.Seq<org.apache.spark.sql.Column> cols)  { throw new RuntimeException(); }
  /**
   * Create a multi-dimensional cube for the current Dataset using the specified columns,
   * so we can run aggregation on them.
   * See {@link RelationalGroupedDataset} for all the available aggregate functions.
   * <p>
   * <pre><code>
   *   // Compute the average for all numeric columns cubed by department and group.
   *   ds.cube($"department", $"group").avg()
   *
   *   // Compute the max age and average salary, cubed by department and gender.
   *   ds.cube($"department", $"gender").agg(Map(
   *     "salary" -&gt; "avg",
   *     "age" -&gt; "max"
   *   ))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset cube (scala.collection.Seq<org.apache.spark.sql.Column> cols)  { throw new RuntimeException(); }
  /**
   * Groups the Dataset using the specified columns, so that we can run aggregation on them.
   * See {@link RelationalGroupedDataset} for all the available aggregate functions.
   * <p>
   * This is a variant of groupBy that can only group by existing columns using column names
   * (i.e. cannot construct expressions).
   * <p>
   * <pre><code>
   *   // Compute the average for all numeric columns grouped by department.
   *   ds.groupBy("department").avg()
   *
   *   // Compute the max age and average salary, grouped by department and gender.
   *   ds.groupBy($"department", $"gender").agg(Map(
   *     "salary" -&gt; "avg",
   *     "age" -&gt; "max"
   *   ))
   * </code></pre>
   * @group untypedrel
   * @since 2.0.0
   * @param col1 (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset groupBy (java.lang.String col1, scala.collection.Seq<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Scala-specific)
   * Reduces the elements of this Dataset using the specified binary function. The given <code>func</code>
   * must be commutative and associative or the result may be non-deterministic.
   * <p>
   * @group action
   * @since 1.6.0
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  T reduce (scala.Function2<T, T, T> func)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Java-specific)
   * Reduces the elements of this Dataset using the specified binary function. The given <code>func</code>
   * must be commutative and associative or the result may be non-deterministic.
   * <p>
   * @group action
   * @since 1.6.0
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  T reduce (org.apache.spark.api.java.function.ReduceFunction<T> func)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Scala-specific)
   * Returns a {@link KeyValueGroupedDataset} where the data is grouped by the given key <code>func</code>.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param func (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.sql.KeyValueGroupedDataset<K, T> groupByKey (scala.Function1<T, K> func, org.apache.spark.sql.Encoder<K> evidence$3)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Java-specific)
   * Returns a {@link KeyValueGroupedDataset} where the data is grouped by the given key <code>func</code>.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param func (undocumented)
   * @param encoder (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.sql.KeyValueGroupedDataset<K, T> groupByKey (org.apache.spark.api.java.function.MapFunction<T, K> func, org.apache.spark.sql.Encoder<K> encoder)  { throw new RuntimeException(); }
  /**
   * Create a multi-dimensional rollup for the current Dataset using the specified columns,
   * so we can run aggregation on them.
   * See {@link RelationalGroupedDataset} for all the available aggregate functions.
   * <p>
   * This is a variant of rollup that can only group by existing columns using column names
   * (i.e. cannot construct expressions).
   * <p>
   * <pre><code>
   *   // Compute the average for all numeric columns rolluped by department and group.
   *   ds.rollup("department", "group").avg()
   *
   *   // Compute the max age and average salary, rolluped by department and gender.
   *   ds.rollup($"department", $"gender").agg(Map(
   *     "salary" -&gt; "avg",
   *     "age" -&gt; "max"
   *   ))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param col1 (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset rollup (java.lang.String col1, scala.collection.Seq<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * Create a multi-dimensional cube for the current Dataset using the specified columns,
   * so we can run aggregation on them.
   * See {@link RelationalGroupedDataset} for all the available aggregate functions.
   * <p>
   * This is a variant of cube that can only group by existing columns using column names
   * (i.e. cannot construct expressions).
   * <p>
   * <pre><code>
   *   // Compute the average for all numeric columns cubed by department and group.
   *   ds.cube("department", "group").avg()
   *
   *   // Compute the max age and average salary, cubed by department and gender.
   *   ds.cube($"department", $"gender").agg(Map(
   *     "salary" -&gt; "avg",
   *     "age" -&gt; "max"
   *   ))
   * </code></pre>
   * @group untypedrel
   * @since 2.0.0
   * @param col1 (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RelationalGroupedDataset cube (java.lang.String col1, scala.collection.Seq<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Aggregates on the entire Dataset without groups.
   * <pre><code>
   *   // ds.agg(...) is a shorthand for ds.groupBy().agg(...)
   *   ds.agg("age" -&gt; "max", "salary" -&gt; "avg")
   *   ds.groupBy().agg("age" -&gt; "max", "salary" -&gt; "avg")
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param aggExpr (undocumented)
   * @param aggExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> agg (scala.Tuple2<java.lang.String, java.lang.String> aggExpr, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> aggExprs)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Aggregates on the entire Dataset without groups.
   * <pre><code>
   *   // ds.agg(...) is a shorthand for ds.groupBy().agg(...)
   *   ds.agg(Map("age" -&gt; "max", "salary" -&gt; "avg"))
   *   ds.groupBy().agg(Map("age" -&gt; "max", "salary" -&gt; "avg"))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> agg (scala.collection.immutable.Map<java.lang.String, java.lang.String> exprs)  { throw new RuntimeException(); }
  /**
   * (Java-specific) Aggregates on the entire Dataset without groups.
   * <pre><code>
   *   // ds.agg(...) is a shorthand for ds.groupBy().agg(...)
   *   ds.agg(Map("age" -&gt; "max", "salary" -&gt; "avg"))
   *   ds.groupBy().agg(Map("age" -&gt; "max", "salary" -&gt; "avg"))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> agg (java.util.Map<java.lang.String, java.lang.String> exprs)  { throw new RuntimeException(); }
  /**
   * Aggregates on the entire Dataset without groups.
   * <pre><code>
   *   // ds.agg(...) is a shorthand for ds.groupBy().agg(...)
   *   ds.agg(max($"age"), avg($"salary"))
   *   ds.groupBy().agg(max($"age"), avg($"salary"))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param expr (undocumented)
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> agg (org.apache.spark.sql.Column expr, scala.collection.Seq<org.apache.spark.sql.Column> exprs)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset by taking the first <code>n</code> rows. The difference between this function
   * and <code>head</code> is that <code>head</code> is an action and returns an array (by triggering query execution)
   * while <code>limit</code> returns a new Dataset.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param n (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> limit (int n)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset containing union of rows in this Dataset and another Dataset.
   * This is equivalent to <code>UNION ALL</code> in SQL.
   * <p>
   * To do a SQL-style set union (that does deduplication of elements), use this function followed
   * by a {@link distinct}.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param other (undocumented)
   * @return (undocumented)
   *
   * @deprecated use union(). Since 2.0.0. 
  */
  public  org.apache.spark.sql.Dataset<T> unionAll (org.apache.spark.sql.Dataset<T> other)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset containing union of rows in this Dataset and another Dataset.
   * This is equivalent to <code>UNION ALL</code> in SQL.
   * <p>
   * To do a SQL-style set union (that does deduplication of elements), use this function followed
   * by a {@link distinct}.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> union (org.apache.spark.sql.Dataset<T> other)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset containing rows only in both this Dataset and another Dataset.
   * This is equivalent to <code>INTERSECT</code> in SQL.
   * <p>
   * @note Equality checking is performed directly on the encoded representation of the data
   * and thus is not affected by a custom <code>equals</code> function defined on <code>T</code>.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> intersect (org.apache.spark.sql.Dataset<T> other)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset containing rows in this Dataset but not in another Dataset.
   * This is equivalent to <code>EXCEPT</code> in SQL.
   * <p>
   * @note Equality checking is performed directly on the encoded representation of the data
   * and thus is not affected by a custom <code>equals</code> function defined on <code>T</code>.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> except (org.apache.spark.sql.Dataset<T> other)  { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} by sampling a fraction of rows, using a user-supplied seed.
   * <p>
   * @param withReplacement Sample with replacement or not.
   * @param fraction Fraction of rows to generate.
   * @param seed Seed for sampling.
   * <p>
   * @note This is NOT guaranteed to provide exactly the fraction of the count
   * of the given {@link Dataset}.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> sample (boolean withReplacement, double fraction, long seed)  { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} by sampling a fraction of rows, using a random seed.
   * <p>
   * @param withReplacement Sample with replacement or not.
   * @param fraction Fraction of rows to generate.
   * <p>
   * @note This is NOT guaranteed to provide exactly the fraction of the total count
   * of the given {@link Dataset}.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> sample (boolean withReplacement, double fraction)  { throw new RuntimeException(); }
  /**
   * Randomly splits this Dataset with the provided weights.
   * <p>
   * @param weights weights for splits, will be normalized if they don't sum to 1.
   * @param seed Seed for sampling.
   * <p>
   * For Java API, use {@link randomSplitAsList}.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T>[] randomSplit (double[] weights, long seed)  { throw new RuntimeException(); }
  /**
   * Returns a Java list that contains randomly split Dataset with the provided weights.
   * <p>
   * @param weights weights for splits, will be normalized if they don't sum to 1.
   * @param seed Seed for sampling.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @return (undocumented)
   */
  public  java.util.List<org.apache.spark.sql.Dataset<T>> randomSplitAsList (double[] weights, long seed)  { throw new RuntimeException(); }
  /**
   * Randomly splits this Dataset with the provided weights.
   * <p>
   * @param weights weights for splits, will be normalized if they don't sum to 1.
   * @group typedrel
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T>[] randomSplit (double[] weights)  { throw new RuntimeException(); }
  /**
   * Randomly splits this Dataset with the provided weights. Provided for the Python Api.
   * <p>
   * @param weights weights for splits, will be normalized if they don't sum to 1.
   * @param seed Seed for sampling.
   * @return (undocumented)
   */
    org.apache.spark.sql.Dataset<T>[] randomSplit (scala.collection.immutable.List<java.lang.Object> weights, long seed)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Returns a new Dataset where each row has been expanded to zero or more
   * rows by the provided function. This is similar to a <code>LATERAL VIEW</code> in HiveQL. The columns of
   * the input row are implicitly joined with each row that is output by the function.
   * <p>
   * Given that this is deprecated, as an alternative, you can explode columns either using
   * <code>functions.explode()</code> or <code>flatMap()</code>. The following example uses these alternatives to count
   * the number of books that contain a given word:
   * <p>
   * <pre><code>
   *   case class Book(title: String, words: String)
   *   val ds: Dataset[Book]
   *
   *   val allWords = ds.select('title, explode(split('words, " ")).as("word"))
   *
   *   val bookCountPerWord = allWords.groupBy("word").agg(countDistinct("title"))
   * </code></pre>
   * <p>
   * Using <code>flatMap()</code> this can similarly be exploded as:
   * <p>
   * <pre><code>
   *   ds.flatMap(_.words.split(" "))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param input (undocumented)
   * @param f (undocumented)
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   *
   * @deprecated use flatMap() or select() with functions.explode() instead. Since 2.0.0. 
  */
  public <A extends scala.Product> org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> explode (scala.collection.Seq<org.apache.spark.sql.Column> input, scala.Function1<org.apache.spark.sql.Row, scala.collection.TraversableOnce<A>> f, scala.reflect.api.TypeTags.TypeTag<A> evidence$4)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Returns a new Dataset where a single column has been expanded to zero
   * or more rows by the provided function. This is similar to a <code>LATERAL VIEW</code> in HiveQL. All
   * columns of the input row are implicitly joined with each value that is output by the function.
   * <p>
   * Given that this is deprecated, as an alternative, you can explode columns either using
   * <code>functions.explode()</code>:
   * <p>
   * <pre><code>
   *   ds.select(explode(split('words, " ")).as("word"))
   * </code></pre>
   * <p>
   * or <code>flatMap()</code>:
   * <p>
   * <pre><code>
   *   ds.flatMap(_.words.split(" "))
   * </code></pre>
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param inputColumn (undocumented)
   * @param outputColumn (undocumented)
   * @param f (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   *
   * @deprecated use flatMap() or select() with functions.explode() instead. Since 2.0.0. 
  */
  public <A extends java.lang.Object, B extends java.lang.Object> org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> explode (java.lang.String inputColumn, java.lang.String outputColumn, scala.Function1<A, scala.collection.TraversableOnce<B>> f, scala.reflect.api.TypeTags.TypeTag<B> evidence$5)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset by adding a column or replacing the existing column that has
   * the same name.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param colName (undocumented)
   * @param col (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> withColumn (java.lang.String colName, org.apache.spark.sql.Column col)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset by adding a column with metadata.
   * @param colName (undocumented)
   * @param col (undocumented)
   * @param metadata (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> withColumn (java.lang.String colName, org.apache.spark.sql.Column col, org.apache.spark.sql.types.Metadata metadata)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset with a column renamed.
   * This is a no-op if schema doesn't contain existingName.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param existingName (undocumented)
   * @param newName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> withColumnRenamed (java.lang.String existingName, java.lang.String newName)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset with a column dropped. This is a no-op if schema doesn't contain
   * column name.
   * <p>
   * This method can only be used to drop top level columns. the colName string is treated
   * literally without further interpretation.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param colName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> drop (java.lang.String colName)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset with columns dropped.
   * This is a no-op if schema doesn't contain column name(s).
   * <p>
   * This method can only be used to drop top level columns. the colName string is treated literally
   * without further interpretation.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> drop (scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset with a column dropped.
   * This version of drop accepts a {@link Column} rather than a name.
   * This is a no-op if the Dataset doesn't have a column
   * with an equivalent expression.
   * <p>
   * @group untypedrel
   * @since 2.0.0
   * @param col (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> drop (org.apache.spark.sql.Column col)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset that contains only the unique rows from this Dataset.
   * This is an alias for <code>distinct</code>.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> dropDuplicates ()  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Returns a new Dataset with duplicate rows removed, considering only
   * the subset of columns.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> dropDuplicates (scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset with duplicate rows removed, considering only
   * the subset of columns.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param colNames (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> dropDuplicates (java.lang.String[] colNames)  { throw new RuntimeException(); }
  /**
   * Returns a new {@link Dataset} with duplicate rows removed, considering only
   * the subset of columns.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param col1 (undocumented)
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> dropDuplicates (java.lang.String col1, scala.collection.Seq<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * Computes statistics for numeric and string columns, including count, mean, stddev, min, and
   * max. If no columns are given, this function computes statistics for all numerical or string
   * columns.
   * <p>
   * This function is meant for exploratory data analysis, as we make no guarantee about the
   * backward compatibility of the schema of the resulting Dataset. If you want to
   * programmatically compute summary statistics, use the <code>agg</code> function instead.
   * <p>
   * <pre><code>
   *   ds.describe("age", "height").show()
   *
   *   // output:
   *   // summary age   height
   *   // count   10.0  10.0
   *   // mean    53.3  178.05
   *   // stddev  11.6  15.7
   *   // min     18.0  163.0
   *   // max     92.0  192.0
   * </code></pre>
   * <p>
   * @group action
   * @since 1.6.0
   * @param cols (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> describe (scala.collection.Seq<java.lang.String> cols)  { throw new RuntimeException(); }
  /**
   * Returns the first <code>n</code> rows.
   * <p>
   * @note this method should only be used if the resulting array is expected to be small, as
   * all the data is loaded into the driver's memory.
   * <p>
   * @group action
   * @since 1.6.0
   * @param n (undocumented)
   * @return (undocumented)
   */
  public  java.lang.Object head (int n)  { throw new RuntimeException(); }
  /**
   * Returns the first row.
   * @group action
   * @since 1.6.0
   * @return (undocumented)
   */
  public  T head ()  { throw new RuntimeException(); }
  /**
   * Returns the first row. Alias for head().
   * @group action
   * @since 1.6.0
   * @return (undocumented)
   */
  public  T first ()  { throw new RuntimeException(); }
  /**
   * Concise syntax for chaining custom transformations.
   * <pre><code>
   *   def featurize(ds: Dataset[T]): Dataset[U] = ...
   *
   *   ds
   *     .transform(featurize)
   *     .transform(...)
   * </code></pre>
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param t (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> transform (scala.Function1<org.apache.spark.sql.Dataset<T>, org.apache.spark.sql.Dataset<U>> t)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Scala-specific)
   * Returns a new Dataset that only contains elements where <code>func</code> returns <code>true</code>.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> filter (scala.Function1<T, java.lang.Object> func)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Java-specific)
   * Returns a new Dataset that only contains elements where <code>func</code> returns <code>true</code>.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> filter (org.apache.spark.api.java.function.FilterFunction<T> func)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Scala-specific)
   * Returns a new Dataset that contains the result of applying <code>func</code> to each element.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param func (undocumented)
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> map (scala.Function1<T, U> func, org.apache.spark.sql.Encoder<U> evidence$6)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Java-specific)
   * Returns a new Dataset that contains the result of applying <code>func</code> to each element.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param func (undocumented)
   * @param encoder (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> map (org.apache.spark.api.java.function.MapFunction<T, U> func, org.apache.spark.sql.Encoder<U> encoder)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Scala-specific)
   * Returns a new Dataset that contains the result of applying <code>func</code> to each partition.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param func (undocumented)
   * @param evidence$7 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> mapPartitions (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> func, org.apache.spark.sql.Encoder<U> evidence$7)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Java-specific)
   * Returns a new Dataset that contains the result of applying <code>f</code> to each partition.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param f (undocumented)
   * @param encoder (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> mapPartitions (org.apache.spark.api.java.function.MapPartitionsFunction<T, U> f, org.apache.spark.sql.Encoder<U> encoder)  { throw new RuntimeException(); }
  /**
   * Returns a new <code>DataFrame</code> that contains the result of applying a serialized R function
   * <code>func</code> to each partition.
   * @param func (undocumented)
   * @param packageNames (undocumented)
   * @param broadcastVars (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> mapPartitionsInR (byte[] func, byte[] packageNames, org.apache.spark.broadcast.Broadcast<java.lang.Object>[] broadcastVars, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Scala-specific)
   * Returns a new Dataset by first applying a function to all elements of this Dataset,
   * and then flattening the results.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param func (undocumented)
   * @param evidence$8 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> flatMap (scala.Function1<T, scala.collection.TraversableOnce<U>> func, org.apache.spark.sql.Encoder<U> evidence$8)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * (Java-specific)
   * Returns a new Dataset by first applying a function to all elements of this Dataset,
   * and then flattening the results.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param f (undocumented)
   * @param encoder (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> flatMap (org.apache.spark.api.java.function.FlatMapFunction<T, U> f, org.apache.spark.sql.Encoder<U> encoder)  { throw new RuntimeException(); }
  /**
   * Applies a function <code>f</code> to all rows.
   * <p>
   * @group action
   * @since 1.6.0
   * @param f (undocumented)
   */
  public  void foreach (scala.Function1<T, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /**
   * (Java-specific)
   * Runs <code>func</code> on each element of this Dataset.
   * <p>
   * @group action
   * @since 1.6.0
   * @param func (undocumented)
   */
  public  void foreach (org.apache.spark.api.java.function.ForeachFunction<T> func)  { throw new RuntimeException(); }
  /**
   * Applies a function <code>f</code> to each partition of this Dataset.
   * <p>
   * @group action
   * @since 1.6.0
   * @param f (undocumented)
   */
  public  void foreachPartition (scala.Function1<scala.collection.Iterator<T>, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /**
   * (Java-specific)
   * Runs <code>func</code> on each partition of this Dataset.
   * <p>
   * @group action
   * @since 1.6.0
   * @param func (undocumented)
   */
  public  void foreachPartition (org.apache.spark.api.java.function.ForeachPartitionFunction<T> func)  { throw new RuntimeException(); }
  /**
   * Returns the first <code>n</code> rows in the Dataset.
   * <p>
   * Running take requires moving data into the application's driver process, and doing so with
   * a very large <code>n</code> can crash the driver process with OutOfMemoryError.
   * <p>
   * @group action
   * @since 1.6.0
   * @param n (undocumented)
   * @return (undocumented)
   */
  public  java.lang.Object take (int n)  { throw new RuntimeException(); }
  /**
   * Returns the first <code>n</code> rows in the Dataset as a list.
   * <p>
   * Running take requires moving data into the application's driver process, and doing so with
   * a very large <code>n</code> can crash the driver process with OutOfMemoryError.
   * <p>
   * @group action
   * @since 1.6.0
   * @param n (undocumented)
   * @return (undocumented)
   */
  public  java.util.List<T> takeAsList (int n)  { throw new RuntimeException(); }
  /**
   * Returns an array that contains all of {@link Row}s in this Dataset.
   * <p>
   * Running collect requires moving all the data into the application's driver process, and
   * doing so on a very large dataset can crash the driver process with OutOfMemoryError.
   * <p>
   * For Java API, use {@link collectAsList}.
   * <p>
   * @group action
   * @since 1.6.0
   * @return (undocumented)
   */
  public  java.lang.Object collect ()  { throw new RuntimeException(); }
  /**
   * Returns a Java list that contains all of {@link Row}s in this Dataset.
   * <p>
   * Running collect requires moving all the data into the application's driver process, and
   * doing so on a very large dataset can crash the driver process with OutOfMemoryError.
   * <p>
   * @group action
   * @since 1.6.0
   * @return (undocumented)
   */
  public  java.util.List<T> collectAsList ()  { throw new RuntimeException(); }
  private  java.lang.Object collect (boolean needCallback)  { throw new RuntimeException(); }
  /**
   * Return an iterator that contains all of {@link Row}s in this Dataset.
   * <p>
   * The iterator will consume as much memory as the largest partition in this Dataset.
   * <p>
   * @note this results in multiple Spark jobs, and if the input Dataset is the result
   * of a wide transformation (e.g. join with different partitioners), to avoid
   * recomputing the input Dataset should be cached first.
   * <p>
   * @group action
   * @since 2.0.0
   * @return (undocumented)
   */
  public  java.util.Iterator<T> toLocalIterator ()  { throw new RuntimeException(); }
  /**
   * Returns the number of rows in the Dataset.
   * @group action
   * @since 1.6.0
   * @return (undocumented)
   */
  public  long count ()  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset that has exactly <code>numPartitions</code> partitions.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> repartition (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset partitioned by the given partitioning expressions into
   * <code>numPartitions</code>. The resulting Dataset is hash partitioned.
   * <p>
   * This is the same operation as "DISTRIBUTE BY" in SQL (Hive QL).
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param numPartitions (undocumented)
   * @param partitionExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> repartition (int numPartitions, scala.collection.Seq<org.apache.spark.sql.Column> partitionExprs)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset partitioned by the given partitioning expressions, using
   * <code>spark.sql.shuffle.partitions</code> as number of partitions.
   * The resulting Dataset is hash partitioned.
   * <p>
   * This is the same operation as "DISTRIBUTE BY" in SQL (Hive QL).
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @param partitionExprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> repartition (scala.collection.Seq<org.apache.spark.sql.Column> partitionExprs)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset that has exactly <code>numPartitions</code> partitions.
   * Similar to coalesce defined on an <code>RDD</code>, this operation results in a narrow dependency, e.g.
   * if you go from 1000 partitions to 100 partitions, there will not be a shuffle, instead each of
   * the 100 new partitions will claim 10 of the current partitions.
   * <p>
   * @group typedrel
   * @since 1.6.0
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> coalesce (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Returns a new Dataset that contains only the unique rows from this Dataset.
   * This is an alias for <code>dropDuplicates</code>.
   * <p>
   * @note Equality checking is performed directly on the encoded representation of the data
   * and thus is not affected by a custom <code>equals</code> function defined on <code>T</code>.
   * <p>
   * @group typedrel
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> distinct ()  { throw new RuntimeException(); }
  /**
   * Persist this Dataset with the default storage level (<code>MEMORY_AND_DISK</code>).
   * <p>
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> persist ()  { throw new RuntimeException(); }
  /**
   * Persist this Dataset with the default storage level (<code>MEMORY_AND_DISK</code>).
   * <p>
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> cache ()  { throw new RuntimeException(); }
  /**
   * Persist this Dataset with the given storage level.
   * @param newLevel One of: <code>MEMORY_ONLY</code>, <code>MEMORY_AND_DISK</code>, <code>MEMORY_ONLY_SER</code>,
   *                 <code>MEMORY_AND_DISK_SER</code>, <code>DISK_ONLY</code>, <code>MEMORY_ONLY_2</code>,
   *                 <code>MEMORY_AND_DISK_2</code>, etc.
   * <p>
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  /**
   * Get the Dataset's current storage level, or StorageLevel.NONE if not persisted.
   * <p>
   * @group basic
   * @since 2.1.0
   * @return (undocumented)
   */
  public  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
  /**
   * Mark the Dataset as non-persistent, and remove all blocks for it from memory and disk.
   * <p>
   * @param blocking Whether to block until all blocks are deleted.
   * <p>
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> unpersist (boolean blocking)  { throw new RuntimeException(); }
  /**
   * Mark the Dataset as non-persistent, and remove all blocks for it from memory and disk.
   * <p>
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<T> unpersist ()  { throw new RuntimeException(); }
  /**
   * Represents the content of the Dataset as an <code>RDD</code> of {@link T}.
   * <p>
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<T> rdd ()  { throw new RuntimeException(); }
  /**
   * Returns the content of the Dataset as a <code>JavaRDD</code> of {@link T}s.
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> toJavaRDD ()  { throw new RuntimeException(); }
  /**
   * Returns the content of the Dataset as a <code>JavaRDD</code> of {@link T}s.
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<T> javaRDD ()  { throw new RuntimeException(); }
  /**
   * Registers this Dataset as a temporary table using the given name. The lifetime of this
   * temporary table is tied to the {@link SparkSession} that was used to create this Dataset.
   * <p>
   * @group basic
   * @since 1.6.0
   * @param tableName (undocumented)
   *
   * @deprecated Use createOrReplaceTempView(viewName) instead. Since 2.0.0. 
  */
  public  void registerTempTable (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Creates a local temporary view using the given name. The lifetime of this
   * temporary view is tied to the {@link SparkSession} that was used to create this Dataset.
   * <p>
   * Local temporary view is session-scoped. Its lifetime is the lifetime of the session that
   * created it, i.e. it will be automatically dropped when the session terminates. It's not
   * tied to any databases, i.e. we can't use <code>db1.view1</code> to reference a local temporary view.
   * <p>
   * @throws AnalysisException if the view name already exists
   * <p>
   * @group basic
   * @since 2.0.0
   * @param viewName (undocumented)
   */
  public  void createTempView (java.lang.String viewName) throws org.apache.spark.sql.AnalysisException { throw new RuntimeException(); }
  /**
   * Creates a local temporary view using the given name. The lifetime of this
   * temporary view is tied to the {@link SparkSession} that was used to create this Dataset.
   * <p>
   * @group basic
   * @since 2.0.0
   * @param viewName (undocumented)
   */
  public  void createOrReplaceTempView (java.lang.String viewName)  { throw new RuntimeException(); }
  /**
   * Creates a global temporary view using the given name. The lifetime of this
   * temporary view is tied to this Spark application.
   * <p>
   * Global temporary view is cross-session. Its lifetime is the lifetime of the Spark application,
   * i.e. it will be automatically dropped when the application terminates. It's tied to a system
   * preserved database <code>_global_temp</code>, and we must use the qualified name to refer a global temp
   * view, e.g. <code>SELECT * FROM _global_temp.view1</code>.
   * <p>
   * @throws AnalysisException if the view name already exists
   * <p>
   * @group basic
   * @since 2.1.0
   * @param viewName (undocumented)
   */
  public  void createGlobalTempView (java.lang.String viewName) throws org.apache.spark.sql.AnalysisException { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.command.CreateViewCommand createTempViewCommand (java.lang.String viewName, boolean replace, boolean global)  { throw new RuntimeException(); }
  /**
   * Interface for saving the content of the non-streaming Dataset out into external storage.
   * <p>
   * @group basic
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameWriter<T> write ()  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Interface for saving the content of the streaming Dataset out into external storage.
   * <p>
   * @group basic
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamWriter<T> writeStream ()  { throw new RuntimeException(); }
  /**
   * Returns the content of the Dataset as a Dataset of JSON strings.
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<java.lang.String> toJSON ()  { throw new RuntimeException(); }
  /**
   * Returns a best-effort snapshot of the files that compose this Dataset. This method simply
   * asks each constituent BaseRelation for its respective files and takes the union of all results.
   * Depending on the source relations, this may not find all input files. Duplicates are removed.
   * <p>
   * @group basic
   * @since 2.0.0
   * @return (undocumented)
   */
  public  java.lang.String[] inputFiles ()  { throw new RuntimeException(); }
  /**
   * Converts a JavaRDD to a PythonRDD.
   * @return (undocumented)
   */
    org.apache.spark.api.java.JavaRDD<byte[]> javaToPython ()  { throw new RuntimeException(); }
    int collectToPython ()  { throw new RuntimeException(); }
    int toPythonIterator ()  { throw new RuntimeException(); }
  /**
   * Wrap a Dataset action to track all Spark jobs in the body so that we can connect them with
   * an execution.
   * @param body (undocumented)
   * @return (undocumented)
   */
   <U extends java.lang.Object> U withNewExecutionId (scala.Function0<U> body)  { throw new RuntimeException(); }
  /**
   * Wrap a Dataset action to track the QueryExecution and time cost, then report to the
   * user-registered callback functions.
   * @param name (undocumented)
   * @param df (undocumented)
   * @param action (undocumented)
   * @return (undocumented)
   */
  private <U extends java.lang.Object> U withCallback (java.lang.String name, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.Function1<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, U> action)  { throw new RuntimeException(); }
  private <A extends java.lang.Object, B extends java.lang.Object> B withTypedCallback (java.lang.String name, org.apache.spark.sql.Dataset<A> ds, scala.Function1<org.apache.spark.sql.Dataset<A>, B> action)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<T> sortInternal (boolean global, scala.collection.Seq<org.apache.spark.sql.Column> sortExprs)  { throw new RuntimeException(); }
  /** A convenient function to wrap a logical plan and produce a DataFrame. */
  private  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> withPlan (scala.Function0<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> logicalPlan)  { throw new RuntimeException(); }
  /** A convenient function to wrap a logical plan and produce a Dataset. */
  private <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> withTypedPlan (scala.Function0<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> logicalPlan, org.apache.spark.sql.Encoder<U> evidence$9)  { throw new RuntimeException(); }
  /** A convenient function to wrap a set based logical plan and produce a Dataset. */
  private <U extends java.lang.Object> org.apache.spark.sql.Dataset<U> withSetOperator (scala.Function0<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> logicalPlan, org.apache.spark.sql.Encoder<U> evidence$10)  { throw new RuntimeException(); }
}
