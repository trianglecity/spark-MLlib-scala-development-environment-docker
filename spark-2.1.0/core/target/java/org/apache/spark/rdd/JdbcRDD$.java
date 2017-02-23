package org.apache.spark.rdd;
public  class JdbcRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JdbcRDD$ MODULE$ = null;
  public   JdbcRDD$ ()  { throw new RuntimeException(); }
  public  java.lang.Object[] resultSetToObjectArray (java.sql.ResultSet rs)  { throw new RuntimeException(); }
  /**
   * Create an RDD that executes a SQL query on a JDBC connection and reads results.
   * For usage example, see test case JavaAPISuite.testJavaJdbcRDD.
   * <p>
   * @param connectionFactory a factory that returns an open Connection.
   *   The RDD takes care of closing the connection.
   * @param sql the text of the query.
   *   The query must contain two ? placeholders for parameters used to partition the results.
   *   For example,
   *   <pre><code>
   *   select title, author from books where ? &lt;= id and id &lt;= ?
   *   </code></pre>
   * @param lowerBound the minimum value of the first placeholder
   * @param upperBound the maximum value of the second placeholder
   *   The lower and upper bounds are inclusive.
   * @param numPartitions the number of partitions.
   *   Given a lowerBound of 1, an upperBound of 20, and a numPartitions of 2,
   *   the query would be executed twice, once with (1, 10) and once with (11, 20)
   * @param mapRow a function from a ResultSet to a single row of the desired result type(s).
   *   This should only call getInt, getString, etc; the RDD takes care of calling next.
   *   The default maps a ResultSet to an array of Object.
   * @param sc (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.api.java.JavaRDD<T> create (org.apache.spark.api.java.JavaSparkContext sc, org.apache.spark.rdd.JdbcRDD.ConnectionFactory connectionFactory, java.lang.String sql, long lowerBound, long upperBound, int numPartitions, org.apache.spark.api.java.function.Function<java.sql.ResultSet, T> mapRow)  { throw new RuntimeException(); }
  /**
   * Create an RDD that executes a SQL query on a JDBC connection and reads results. Each row is
   * converted into a <code>Object</code> array. For usage example, see test case JavaAPISuite.testJavaJdbcRDD.
   * <p>
   * @param connectionFactory a factory that returns an open Connection.
   *   The RDD takes care of closing the connection.
   * @param sql the text of the query.
   *   The query must contain two ? placeholders for parameters used to partition the results.
   *   For example,
   *   <pre><code>
   *   select title, author from books where ? &lt;= id and id &lt;= ?
   *   </code></pre>
   * @param lowerBound the minimum value of the first placeholder
   * @param upperBound the maximum value of the second placeholder
   *   The lower and upper bounds are inclusive.
   * @param numPartitions the number of partitions.
   *   Given a lowerBound of 1, an upperBound of 20, and a numPartitions of 2,
   *   the query would be executed twice, once with (1, 10) and once with (11, 20)
   * @param sc (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object[]> create (org.apache.spark.api.java.JavaSparkContext sc, org.apache.spark.rdd.JdbcRDD.ConnectionFactory connectionFactory, java.lang.String sql, long lowerBound, long upperBound, int numPartitions)  { throw new RuntimeException(); }
}
