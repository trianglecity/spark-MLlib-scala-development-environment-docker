package org.apache.spark.sql.catalyst.analysis;
/**
 * Analyzes the presence of unsupported operations in a logical plan.
 */
public  class UnsupportedOperationChecker {
  static public  void checkForBatch (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static public  void checkForStreaming (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  static private  void throwErrorIf (boolean condition, java.lang.String msg, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan operator)  { throw new RuntimeException(); }
  static private  scala.runtime.Nothing$ throwError (java.lang.String msg, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan operator)  { throw new RuntimeException(); }
}
