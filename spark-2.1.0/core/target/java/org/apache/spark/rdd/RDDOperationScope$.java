package org.apache.spark.rdd;
/**
 * A collection of utility methods to construct a hierarchical representation of RDD scopes.
 * An RDD scope tracks the series of operations that created a given RDD.
 */
public  class RDDOperationScope$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RDDOperationScope$ MODULE$ = null;
  public   RDDOperationScope$ ()  { throw new RuntimeException(); }
  private  com.fasterxml.jackson.databind.ObjectMapper jsonMapper ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger scopeCounter ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDDOperationScope fromJson (java.lang.String s)  { throw new RuntimeException(); }
  /** Return a globally unique operation scope ID. */
  public  int nextScopeId ()  { throw new RuntimeException(); }
  /**
   * Execute the given body such that all RDDs created in this body will have the same scope.
   * The name of the scope will be the first method name in the stack trace that is not the
   * same as this method's.
   * <p>
   * Note: Return statements are NOT allowed in body.
   * @param sc (undocumented)
   * @param allowNesting (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
   <T extends java.lang.Object> T withScope (org.apache.spark.SparkContext sc, boolean allowNesting, scala.Function0<T> body)  { throw new RuntimeException(); }
  /**
   * Execute the given body such that all RDDs created in this body will have the same scope.
   * <p>
   * If nesting is allowed, any subsequent calls to this method in the given body will instantiate
   * child scopes that are nested within our scope. Otherwise, these calls will take no effect.
   * <p>
   * Additionally, the caller of this method may optionally ignore the configurations and scopes
   * set by the higher level caller. In this case, this method will ignore the parent caller's
   * intention to disallow nesting, and the new scope instantiated will not have a parent. This
   * is useful for scoping physical operations in Spark SQL, for instance.
   * <p>
   * Note: Return statements are NOT allowed in body.
   * @param sc (undocumented)
   * @param name (undocumented)
   * @param allowNesting (undocumented)
   * @param ignoreParent (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
   <T extends java.lang.Object> T withScope (org.apache.spark.SparkContext sc, java.lang.String name, boolean allowNesting, boolean ignoreParent, scala.Function0<T> body)  { throw new RuntimeException(); }
}
