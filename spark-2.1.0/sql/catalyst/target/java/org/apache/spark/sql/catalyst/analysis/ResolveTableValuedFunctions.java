package org.apache.spark.sql.catalyst.analysis;
/**
 * Rule that resolves table-valued function references.
 */
public  class ResolveTableValuedFunctions {
  /**
   * List of argument names and their types, used to declare a function.
   */
  static private  class ArgumentList implements scala.Product, scala.Serializable {
    public  scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.spark.sql.types.DataType>> args ()  { throw new RuntimeException(); }
    // not preceding
    public   ArgumentList (scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.spark.sql.types.DataType>> args)  { throw new RuntimeException(); }
    /**
     * Try to cast the expressions to satisfy the expected types of this argument list. If there
     * are any types that cannot be casted, then None is returned.
     * @param values (undocumented)
     * @return (undocumented)
     */
    public  scala.Option<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> implicitCast (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> values)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static private  class ArgumentList$ extends scala.runtime.AbstractFunction1<scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.spark.sql.types.DataType>>, org.apache.spark.sql.catalyst.analysis.ResolveTableValuedFunctions.ArgumentList> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ArgumentList$ MODULE$ = null;
    public   ArgumentList$ ()  { throw new RuntimeException(); }
  }
  /**
   * TVF builder.
   * @param args (undocumented)
   * @param pf (undocumented)
   * @return (undocumented)
   */
  static private  scala.Tuple2<org.apache.spark.sql.catalyst.analysis.ResolveTableValuedFunctions.ArgumentList, scala.Function1<scala.collection.Seq<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> tvf (scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.spark.sql.types.DataType>> args, scala.PartialFunction<scala.collection.Seq<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> pf)  { throw new RuntimeException(); }
  /**
   * Internal registry of table-valued functions.
   * @return (undocumented)
   */
  static private  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.analysis.ResolveTableValuedFunctions.ArgumentList, scala.Function1<scala.collection.Seq<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>>> builtinFunctions ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
}
