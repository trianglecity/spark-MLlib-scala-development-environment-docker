package org.apache.spark.sql;
/**
 * The entry point to programming Spark with the Dataset and DataFrame API.
 * <p>
 * In environments that this has been created upfront (e.g. REPL, notebooks), use the builder
 * to get an existing session:
 * <p>
 * <pre><code>
 *   SparkSession.builder().getOrCreate()
 * </code></pre>
 * <p>
 * The builder can also be used to create a new session:
 * <p>
 * <pre><code>
 *   SparkSession.builder()
 *     .master("local")
 *     .appName("Word Count")
 *     .config("spark.some.config.option", "some-value")
 *     .getOrCreate()
 * </code></pre>
 */
public  class SparkSession implements scala.Serializable, java.io.Closeable, org.apache.spark.internal.Logging {
  /**
   * :: Experimental ::
   * (Scala-specific) Implicit methods available in Scala for converting
   * common Scala objects into <code>DataFrame</code>s.
   * <p>
   * <pre><code>
   *   val sparkSession = SparkSession.builder.getOrCreate()
   *   import sparkSession.implicits._
   * </code></pre>
   * <p>
   * @since 2.0.0
   */
  public  class implicits$ extends org.apache.spark.sql.SQLImplicits implements scala.Serializable {
    public   implicits$ ()  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.SQLContext _sqlContext ()  { throw new RuntimeException(); }
  }
  /**
   * Builder for {@link SparkSession}.
   */
  static public  class Builder implements org.apache.spark.internal.Logging {
    public   Builder ()  { throw new RuntimeException(); }
      org.apache.spark.sql.SparkSession.Builder sparkContext (org.apache.spark.SparkContext sparkContext)  { throw new RuntimeException(); }
    /**
     * Sets a name for the application, which will be shown in the Spark web UI.
     * If no application name is set, a randomly generated name will be used.
     * <p>
     * @since 2.0.0
     * @param name (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.SparkSession.Builder appName (java.lang.String name)  { throw new RuntimeException(); }
    /**
     * Sets a config option. Options set using this method are automatically propagated to
     * both <code>SparkConf</code> and SparkSession's own configuration.
     * <p>
     * @since 2.0.0
     * @param key (undocumented)
     * @param value (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.SparkSession.Builder config (java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
    /**
     * Sets a config option. Options set using this method are automatically propagated to
     * both <code>SparkConf</code> and SparkSession's own configuration.
     * <p>
     * @since 2.0.0
     * @param key (undocumented)
     * @param value (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.SparkSession.Builder config (java.lang.String key, long value)  { throw new RuntimeException(); }
    /**
     * Sets a config option. Options set using this method are automatically propagated to
     * both <code>SparkConf</code> and SparkSession's own configuration.
     * <p>
     * @since 2.0.0
     * @param key (undocumented)
     * @param value (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.SparkSession.Builder config (java.lang.String key, double value)  { throw new RuntimeException(); }
    /**
     * Sets a config option. Options set using this method are automatically propagated to
     * both <code>SparkConf</code> and SparkSession's own configuration.
     * <p>
     * @since 2.0.0
     * @param key (undocumented)
     * @param value (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.SparkSession.Builder config (java.lang.String key, boolean value)  { throw new RuntimeException(); }
    /**
     * Sets a list of config options based on the given <code>SparkConf</code>.
     * <p>
     * @since 2.0.0
     * @param conf (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.SparkSession.Builder config (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    /**
     * Sets the Spark master URL to connect to, such as "local" to run locally, "local[4]" to
     * run locally with 4 cores, or "spark://master:7077" to run on a Spark standalone cluster.
     * <p>
     * @since 2.0.0
     * @param master (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.SparkSession.Builder master (java.lang.String master)  { throw new RuntimeException(); }
    /**
     * Enables Hive support, including connectivity to a persistent Hive metastore, support for
     * Hive serdes, and Hive user-defined functions.
     * <p>
     * @since 2.0.0
     * @return (undocumented)
     */
    public  org.apache.spark.sql.SparkSession.Builder enableHiveSupport ()  { throw new RuntimeException(); }
    /**
     * Gets an existing {@link SparkSession} or, if there is no existing one, creates a new
     * one based on the options set in this builder.
     * <p>
     * This method first checks whether there is a valid thread-local SparkSession,
     * and if yes, return that one. It then checks whether there is a valid global
     * default SparkSession, and if yes, return that one. If no valid global default
     * SparkSession exists, the method creates a new SparkSession and assigns the
     * newly created SparkSession as the global default.
     * <p>
     * In case an existing SparkSession is returned, the config options specified in
     * this builder will be applied to the existing SparkSession.
     * <p>
     * @since 2.0.0
     * @return (undocumented)
     */
    public  org.apache.spark.sql.SparkSession getOrCreate ()  { throw new RuntimeException(); }
  }
  /**
   * Creates a {@link SparkSession.Builder} for constructing a {@link SparkSession}.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.SparkSession.Builder builder ()  { throw new RuntimeException(); }
  /**
   * Changes the SparkSession that will be returned in this thread and its children when
   * SparkSession.getOrCreate() is called. This can be used to ensure that a given thread receives
   * a SparkSession with an isolated session, instead of the global (first created) context.
   * <p>
   * @since 2.0.0
   * @param session (undocumented)
   */
  static public  void setActiveSession (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  /**
   * Clears the active SparkSession for current thread. Subsequent calls to getOrCreate will
   * return the first created context instead of a thread-local override.
   * <p>
   * @since 2.0.0
   */
  static public  void clearActiveSession ()  { throw new RuntimeException(); }
  /**
   * Sets the default SparkSession that is returned by the builder.
   * <p>
   * @since 2.0.0
   * @param session (undocumented)
   */
  static public  void setDefaultSession (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  /**
   * Clears the default SparkSession that is returned by the builder.
   * <p>
   * @since 2.0.0
   */
  static public  void clearDefaultSession ()  { throw new RuntimeException(); }
  static   scala.Option<org.apache.spark.sql.SparkSession> getActiveSession ()  { throw new RuntimeException(); }
  static   scala.Option<org.apache.spark.sql.SparkSession> getDefaultSession ()  { throw new RuntimeException(); }
  /** A global SQL listener used for the SQL UI. */
  static   java.util.concurrent.atomic.AtomicReference<org.apache.spark.sql.execution.ui.SQLListener> sqlListener ()  { throw new RuntimeException(); }
  /** The active SparkSession for the current thread. */
  static private  java.lang.InheritableThreadLocal<org.apache.spark.sql.SparkSession> activeThreadSession ()  { throw new RuntimeException(); }
  /** Reference to the root SparkSession. */
  static private  java.util.concurrent.atomic.AtomicReference<org.apache.spark.sql.SparkSession> defaultSession ()  { throw new RuntimeException(); }
  static private  java.lang.String HIVE_SESSION_STATE_CLASS_NAME ()  { throw new RuntimeException(); }
  static private  java.lang.String sessionStateClassName (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Helper method to create an instance of {@link T} using a single-arg constructor that
   * accepts an {@link Arg}.
   * @param className (undocumented)
   * @param ctorArg (undocumented)
   * @param ctorArgTag (undocumented)
   * @return (undocumented)
   */
  static private <T extends java.lang.Object, Arg extends java.lang.Object> T reflect (java.lang.String className, Arg ctorArg, scala.reflect.ClassTag<Arg> ctorArgTag)  { throw new RuntimeException(); }
  /**
   * @return true if Hive classes can be loaded, otherwise false.
   */
  static   boolean hiveClassesArePresent ()  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.internal.SharedState> existingSharedState ()  { throw new RuntimeException(); }
  // not preceding
  private   SparkSession (org.apache.spark.SparkContext sparkContext, scala.Option<org.apache.spark.sql.internal.SharedState> existingSharedState)  { throw new RuntimeException(); }
     SparkSession (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * The version of Spark on which this application is running.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  java.lang.String version ()  { throw new RuntimeException(); }
  /**
   * State shared across sessions, including the <code>SparkContext</code>, cached data, listener,
   * and a catalog that interacts with external systems.
   * @return (undocumented)
   */
    org.apache.spark.sql.internal.SharedState sharedState ()  { throw new RuntimeException(); }
  /**
   * State isolated across sessions, including SQL configurations, temporary tables, registered
   * functions, and everything else that accepts a {@link org.apache.spark.sql.internal.SQLConf}.
   * @return (undocumented)
   */
    org.apache.spark.sql.internal.SessionState sessionState ()  { throw new RuntimeException(); }
  /**
   * A wrapped version of this session in the form of a {@link SQLContext}, for backward compatibility.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  /**
   * Runtime configuration interface for Spark.
   * <p>
   * This is the interface through which the user can get and set all Spark and Hadoop
   * configurations that are relevant to Spark SQL. When getting the value of a config,
   * this defaults to the value set in the underlying <code>SparkContext</code>, if any.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.RuntimeConfig conf ()  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * An interface to register custom {@link org.apache.spark.sql.util.QueryExecutionListener}s
   * that listen for execution metrics.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.util.ExecutionListenerManager listenerManager ()  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * A collection of methods that are considered experimental, but can be used to hook into
   * the query planner for advanced functionality.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.ExperimentalMethods experimental ()  { throw new RuntimeException(); }
  /**
   * A collection of methods for registering user-defined functions (UDF).
   * <p>
   * The following example registers a Scala closure as UDF:
   * <pre><code>
   *   sparkSession.udf.register("myUDF", (arg1: Int, arg2: String) =&gt; arg2 + arg1)
   * </code></pre>
   * <p>
   * The following example registers a UDF in Java:
   * <pre><code>
   *   sparkSession.udf().register("myUDF",
   *       new UDF2&lt;Integer, String, String&gt;() {
   *           &#64;Override
   *           public String call(Integer arg1, String arg2) {
   *               return arg2 + arg1;
   *           }
   *      }, DataTypes.StringType);
   * </code></pre>
   * <p>
   * Or, to use Java 8 lambda syntax:
   * <pre><code>
   *   sparkSession.udf().register("myUDF",
   *       (Integer arg1, String arg2) -&gt; arg2 + arg1,
   *       DataTypes.StringType);
   * </code></pre>
   * <p>
   * @note The user-defined functions must be deterministic. Due to optimization,
   * duplicate invocations may be eliminated or the function may even be invoked more times than
   * it is present in the query.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.UDFRegistration udf ()  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Returns a <code>StreamingQueryManager</code> that allows managing all the
   * <code>StreamingQuery</code>s active on <code>this</code>.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.StreamingQueryManager streams ()  { throw new RuntimeException(); }
  /**
   * Start a new session with isolated SQL configurations, temporary tables, registered
   * functions are isolated, but sharing the underlying <code>SparkContext</code> and cached data.
   * <p>
   * @note Other than the <code>SparkContext</code>, all shared state is initialized lazily.
   * This method will force the initialization of the shared state to ensure that parent
   * and child sessions are set up with the same shared state. If the underlying catalog
   * implementation is Hive, this will initialize the metastore, which may take some time.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SparkSession newSession ()  { throw new RuntimeException(); }
  /**
   * Returns a <code>DataFrame</code> with no rows or columns.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyDataFrame ()  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates a new {@link Dataset} of type T containing zero elements.
   * <p>
   * @return 2.0.0
   * @param evidence$1 (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.Dataset<T> emptyDataset (org.apache.spark.sql.Encoder<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates a <code>DataFrame</code> from an RDD of Product (e.g. case classes, tuples).
   * <p>
   * @since 2.0.0
   * @param rdd (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <A extends scala.Product> org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (org.apache.spark.rdd.RDD<A> rdd, scala.reflect.api.TypeTags.TypeTag<A> evidence$2)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates a <code>DataFrame</code> from a local Seq of Product.
   * <p>
   * @since 2.0.0
   * @param data (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <A extends scala.Product> org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (scala.collection.Seq<A> data, scala.reflect.api.TypeTags.TypeTag<A> evidence$3)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Creates a <code>DataFrame</code> from an <code>RDD</code> containing {@link Row}s using the given schema.
   * It is important to make sure that the structure of every {@link Row} of the provided RDD matches
   * the provided schema. Otherwise, there will be runtime exception.
   * Example:
   * <pre><code>
   *  import org.apache.spark.sql._
   *  import org.apache.spark.sql.types._
   *  val sparkSession = new org.apache.spark.sql.SparkSession(sc)
   *
   *  val schema =
   *    StructType(
   *      StructField("name", StringType, false) ::
   *      StructField("age", IntegerType, true) :: Nil)
   *
   *  val people =
   *    sc.textFile("examples/src/main/resources/people.txt").map(
   *      _.split(",")).map(p =&gt; Row(p(0), p(1).trim.toInt))
   *  val dataFrame = sparkSession.createDataFrame(people, schema)
   *  dataFrame.printSchema
   *  // root
   *  // |-- name: string (nullable = false)
   *  // |-- age: integer (nullable = true)
   *
   *  dataFrame.createOrReplaceTempView("people")
   *  sparkSession.sql("select name from people").collect.foreach(println)
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @param rowRDD (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> rowRDD, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Creates a <code>DataFrame</code> from a <code>JavaRDD</code> containing {@link Row}s using the given schema.
   * It is important to make sure that the structure of every {@link Row} of the provided RDD matches
   * the provided schema. Otherwise, there will be runtime exception.
   * <p>
   * @since 2.0.0
   * @param rowRDD (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (org.apache.spark.api.java.JavaRDD<org.apache.spark.sql.Row> rowRDD, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Creates a <code>DataFrame</code> from a {@link java.util.List} containing {@link Row}s using the given schema.
   * It is important to make sure that the structure of every {@link Row} of the provided List matches
   * the provided schema. Otherwise, there will be runtime exception.
   * <p>
   * @since 2.0.0
   * @param rows (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (java.util.List<org.apache.spark.sql.Row> rows, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Applies a schema to an RDD of Java Beans.
   * <p>
   * WARNING: Since there is no guaranteed ordering for fields in a Java Bean,
   * SELECT * queries will return the columns in an undefined order.
   * <p>
   * @since 2.0.0
   * @param rdd (undocumented)
   * @param beanClass (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (org.apache.spark.rdd.RDD<?> rdd, java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
  /**
   * Applies a schema to an RDD of Java Beans.
   * <p>
   * WARNING: Since there is no guaranteed ordering for fields in a Java Bean,
   * SELECT * queries will return the columns in an undefined order.
   * <p>
   * @since 2.0.0
   * @param rdd (undocumented)
   * @param beanClass (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (org.apache.spark.api.java.JavaRDD<?> rdd, java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
  /**
   * Applies a schema to a List of Java Beans.
   * <p>
   * WARNING: Since there is no guaranteed ordering for fields in a Java Bean,
   *          SELECT * queries will return the columns in an undefined order.
   * @since 1.6.0
   * @param data (undocumented)
   * @param beanClass (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (java.util.List<?> data, java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
  /**
   * Convert a <code>BaseRelation</code> created for external data sources into a <code>DataFrame</code>.
   * <p>
   * @since 2.0.0
   * @param baseRelation (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> baseRelationToDataFrame (org.apache.spark.sql.sources.BaseRelation baseRelation)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates a {@link Dataset} from a local Seq of data of a given type. This method requires an
   * encoder (to convert a JVM object of type <code>T</code> to and from the internal Spark SQL representation)
   * that is generally created automatically through implicits from a <code>SparkSession</code>, or can be
   * created explicitly by calling static methods on {@link Encoders}.
   * <p>
   * == Example ==
   * <p>
   * <pre><code>
   *
   *   import spark.implicits._
   *   case class Person(name: String, age: Long)
   *   val data = Seq(Person("Michael", 29), Person("Andy", 30), Person("Justin", 19))
   *   val ds = spark.createDataset(data)
   *
   *   ds.show()
   *   // +-------+---+
   *   // |   name|age|
   *   // +-------+---+
   *   // |Michael| 29|
   *   // |   Andy| 30|
   *   // | Justin| 19|
   *   // +-------+---+
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @param data (undocumented)
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.Dataset<T> createDataset (scala.collection.Seq<T> data, org.apache.spark.sql.Encoder<T> evidence$4)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates a {@link Dataset} from an RDD of a given type. This method requires an
   * encoder (to convert a JVM object of type <code>T</code> to and from the internal Spark SQL representation)
   * that is generally created automatically through implicits from a <code>SparkSession</code>, or can be
   * created explicitly by calling static methods on {@link Encoders}.
   * <p>
   * @since 2.0.0
   * @param data (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.Dataset<T> createDataset (org.apache.spark.rdd.RDD<T> data, org.apache.spark.sql.Encoder<T> evidence$5)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates a {@link Dataset} from a {@link java.util.List} of a given type. This method requires an
   * encoder (to convert a JVM object of type <code>T</code> to and from the internal Spark SQL representation)
   * that is generally created automatically through implicits from a <code>SparkSession</code>, or can be
   * created explicitly by calling static methods on {@link Encoders}.
   * <p>
   * == Java Example ==
   * <p>
   * <pre><code>
   *     List&lt;String&gt; data = Arrays.asList("hello", "world");
   *     Dataset&lt;String&gt; ds = spark.createDataset(data, Encoders.STRING());
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @param data (undocumented)
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.Dataset<T> createDataset (java.util.List<T> data, org.apache.spark.sql.Encoder<T> evidence$6)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates a {@link Dataset} with a single <code>LongType</code> column named <code>id</code>, containing elements
   * in a range from 0 to <code>end</code> (exclusive) with step value 1.
   * <p>
   * @since 2.0.0
   * @param end (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<java.lang.Long> range (long end)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates a {@link Dataset} with a single <code>LongType</code> column named <code>id</code>, containing elements
   * in a range from <code>start</code> to <code>end</code> (exclusive) with step value 1.
   * <p>
   * @since 2.0.0
   * @param start (undocumented)
   * @param end (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<java.lang.Long> range (long start, long end)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates a {@link Dataset} with a single <code>LongType</code> column named <code>id</code>, containing elements
   * in a range from <code>start</code> to <code>end</code> (exclusive) with a step value.
   * <p>
   * @since 2.0.0
   * @param start (undocumented)
   * @param end (undocumented)
   * @param step (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<java.lang.Long> range (long start, long end, long step)  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Creates a {@link Dataset} with a single <code>LongType</code> column named <code>id</code>, containing elements
   * in a range from <code>start</code> to <code>end</code> (exclusive) with a step value, with partition number
   * specified.
   * <p>
   * @since 2.0.0
   * @param start (undocumented)
   * @param end (undocumented)
   * @param step (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<java.lang.Long> range (long start, long end, long step, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Creates a <code>DataFrame</code> from an RDD[Row].
   * User can specify whether the input rows should be converted to Catalyst rows.
   * @param catalystRows (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> internalCreateDataFrame (org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> catalystRows, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Creates a <code>DataFrame</code> from an RDD[Row].
   * User can specify whether the input rows should be converted to Catalyst rows.
   * @param rowRDD (undocumented)
   * @param schema (undocumented)
   * @param needsConversion (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> rowRDD, org.apache.spark.sql.types.StructType schema, boolean needsConversion)  { throw new RuntimeException(); }
  /**
   * Interface through which the user may create, drop, alter or query underlying
   * databases, tables, functions etc.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalog.Catalog catalog ()  { throw new RuntimeException(); }
  /**
   * Returns the specified table as a <code>DataFrame</code>.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> table (java.lang.String tableName)  { throw new RuntimeException(); }
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> table (org.apache.spark.sql.catalyst.TableIdentifier tableIdent)  { throw new RuntimeException(); }
  /**
   * Executes a SQL query using Spark, returning the result as a <code>DataFrame</code>.
   * The dialect that is used for SQL parsing can be configured with 'spark.sql.dialect'.
   * <p>
   * @since 2.0.0
   * @param sqlText (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> sql (java.lang.String sqlText)  { throw new RuntimeException(); }
  /**
   * Returns a {@link DataFrameReader} that can be used to read non-streaming data in as a
   * <code>DataFrame</code>.
   * <pre><code>
   *   sparkSession.read.parquet("/path/to/file.parquet")
   *   sparkSession.read.schema(schema).json("/path/to/file.json")
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameReader read ()  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Returns a <code>DataStreamReader</code> that can be used to read streaming data in as a <code>DataFrame</code>.
   * <pre><code>
   *   sparkSession.readStream.parquet("/path/to/directory/of/parquet/files")
   *   sparkSession.readStream.schema(schema).json("/path/to/directory/of/json/files")
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader readStream ()  { throw new RuntimeException(); }
  /**
   * Executes some code block and prints to stdout the time taken to execute the block. This is
   * available in Scala only and is used primarily for interactive testing and debugging.
   * <p>
   * @since 2.1.0
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T time (scala.Function0<T> f)  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SparkSession.implicits$ implicits ()  { throw new RuntimeException(); }
  /**
   * Stop the underlying <code>SparkContext</code>.
   * <p>
   * @since 2.0.0
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Synonym for <code>stop()</code>.
   * <p>
   * @since 2.1.0
   */
  public  void close ()  { throw new RuntimeException(); }
  /**
   * Parses the data type in our internal string representation. The data type string should
   * have the same format as the one generated by <code>toString</code> in scala.
   * It is only used by PySpark.
   * @param dataTypeString (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.types.DataType parseDataType (java.lang.String dataTypeString)  { throw new RuntimeException(); }
  /**
   * Apply a schema defined by the schemaString to an RDD. It is only used by PySpark.
   * @param rdd (undocumented)
   * @param schemaString (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> applySchemaToPythonRDD (org.apache.spark.rdd.RDD<java.lang.Object[]> rdd, java.lang.String schemaString)  { throw new RuntimeException(); }
  /**
   * Apply a schema defined by the schema to an RDD. It is only used by PySpark.
   * @param rdd (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> applySchemaToPythonRDD (org.apache.spark.rdd.RDD<java.lang.Object[]> rdd, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Returns a Catalyst Schema for the given java bean class.
   * @param beanClass (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> getSchema (java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
}
