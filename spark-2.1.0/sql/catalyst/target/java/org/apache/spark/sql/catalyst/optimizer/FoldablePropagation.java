package org.apache.spark.sql.catalyst.optimizer;
/**
 * Propagate foldable expressions:
 * Replace attributes with aliases of the original foldable expressions if possible.
 * Other optimizations will take advantage of the propagated foldable expressions.
 * <p>
 * <pre><code>
 *   SELECT 1.0 x, 'abc' y, Now() z ORDER BY x, y, 3
 *   ==&gt;  SELECT 1.0 x, 'abc' y, Now() z ORDER BY 1.0, 'abc', Now()
 * </code></pre>
 */
public  class FoldablePropagation {
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Whitelist of all {@link UnaryNode}s for which allow foldable propagation.
   * @param u (undocumented)
   * @return (undocumented)
   */
  static private  boolean canPropagateFoldables (org.apache.spark.sql.catalyst.plans.logical.UnaryNode u)  { throw new RuntimeException(); }
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
