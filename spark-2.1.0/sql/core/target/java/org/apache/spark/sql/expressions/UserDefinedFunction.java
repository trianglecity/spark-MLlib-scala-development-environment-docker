package org.apache.spark.sql.expressions;
/**
 * A user-defined function. To create one, use the <code>udf</code> functions in <code>functions</code>.
 * <p>
 * As an example:
 * <pre><code>
 *   // Defined a UDF that returns true or false based on some numeric score.
 *   val predict = udf((score: Double) =&gt; if (score &gt; 0.5) true else false)
 *
 *   // Projects a column that adds a prediction column based on the score column.
 *   df.select( predict(df("score")) )
 * </code></pre>
 * <p>
 * @note The user-defined functions must be deterministic. Due to optimization,
 * duplicate invocations may be eliminated or the function may even be invoked more times than
 * it is present in the query.
 * <p>
 * @since 1.3.0
 */
public  class UserDefinedFunction implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.Object f ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<org.apache.spark.sql.types.DataType>> inputTypes ()  { throw new RuntimeException(); }
  // not preceding
  protected   UserDefinedFunction (java.lang.Object f, org.apache.spark.sql.types.DataType dataType, scala.Option<scala.collection.Seq<org.apache.spark.sql.types.DataType>> inputTypes)  { throw new RuntimeException(); }
  /**
   * Returns an expression that invokes the UDF, using the given arguments.
   * <p>
   * @since 1.3.0
   * @param exprs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Column apply (scala.collection.Seq<org.apache.spark.sql.Column> exprs)  { throw new RuntimeException(); }
}
