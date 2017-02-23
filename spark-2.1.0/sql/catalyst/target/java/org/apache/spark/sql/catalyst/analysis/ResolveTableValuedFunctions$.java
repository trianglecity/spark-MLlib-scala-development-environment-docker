package org.apache.spark.sql.catalyst.analysis;
/**
 * Rule that resolves table-valued function references.
 */
public  class ResolveTableValuedFunctions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ResolveTableValuedFunctions$ MODULE$ = null;
  public   ResolveTableValuedFunctions$ ()  { throw new RuntimeException(); }
  /**
   * TVF builder.
   * @param args (undocumented)
   * @param pf (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<org.apache.spark.sql.catalyst.analysis.ResolveTableValuedFunctions.ArgumentList, scala.Function1<scala.collection.Seq<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> tvf (scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.spark.sql.types.DataType>> args, scala.PartialFunction<scala.collection.Seq<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> pf)  { throw new RuntimeException(); }
  /**
   * Internal registry of table-valued functions.
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.analysis.ResolveTableValuedFunctions.ArgumentList, scala.Function1<scala.collection.Seq<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>>> builtinFunctions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
