package org.apache.spark.rdd;
/**
 * A general, named code block representing an operation that instantiates RDDs.
 * <p>
 * All RDDs instantiated in the corresponding code block will store a pointer to this object.
 * Examples include, but will not be limited to, existing RDD operations, such as textFile,
 * reduceByKey, and treeAggregate.
 * <p>
 * An operation scope may be nested in other scopes. For instance, a SQL query may enclose
 * scopes associated with the public RDD APIs it uses under the hood.
 * <p>
 * There is no particular relationship between an operation scope and a stage or a job.
 * A scope may live inside one stage (e.g. map) or span across multiple jobs (e.g. take).
 */
  class RDDOperationScope {
  static private  com.fasterxml.jackson.databind.ObjectMapper jsonMapper ()  { throw new RuntimeException(); }
  static private  java.util.concurrent.atomic.AtomicInteger scopeCounter ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDDOperationScope fromJson (java.lang.String s)  { throw new RuntimeException(); }
  /** Return a globally unique operation scope ID. */
  static public  int nextScopeId ()  { throw new RuntimeException(); }
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
  static  <T extends java.lang.Object> T withScope (org.apache.spark.SparkContext sc, boolean allowNesting, scala.Function0<T> body)  { throw new RuntimeException(); }
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
  static  <T extends java.lang.Object> T withScope (org.apache.spark.SparkContext sc, java.lang.String name, boolean allowNesting, boolean ignoreParent, scala.Function0<T> body)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDDOperationScope> parent ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  // not preceding
  public   RDDOperationScope (java.lang.String name, scala.Option<org.apache.spark.rdd.RDDOperationScope> parent, java.lang.String id)  { throw new RuntimeException(); }
  public  java.lang.String toJson ()  { throw new RuntimeException(); }
  /**
   * Return a list of scopes that this scope is a part of, including this scope itself.
   * The result is ordered from the outermost scope (eldest ancestor) to this scope.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.rdd.RDDOperationScope> getAllScopes ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
