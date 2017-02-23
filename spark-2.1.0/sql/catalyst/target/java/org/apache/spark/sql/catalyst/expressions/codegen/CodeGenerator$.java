package org.apache.spark.sql.catalyst.expressions.codegen;
public  class CodeGenerator$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CodeGenerator$ MODULE$ = null;
  public   CodeGenerator$ ()  { throw new RuntimeException(); }
  /**
   * Compile the Java source code into a Java class, using Janino.
   * @param code (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.codegen.GeneratedClass compile (org.apache.spark.sql.catalyst.expressions.codegen.CodeAndComment code)  { throw new RuntimeException(); }
  /**
   * Compile the Java source code into a Java class, using Janino.
   * @param code (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.expressions.codegen.GeneratedClass doCompile (org.apache.spark.sql.catalyst.expressions.codegen.CodeAndComment code)  { throw new RuntimeException(); }
  /**
   * Records the generated class and method bytecode sizes by inspecting janino private fields.
   * @param evaluator (undocumented)
   */
  private  void recordCompilationStats (org.codehaus.janino.ClassBodyEvaluator evaluator)  { throw new RuntimeException(); }
  /**
   * A cache of generated classes.
   * <p>
   * From the Guava Docs: A Cache is similar to ConcurrentMap, but not quite the same. The most
   * fundamental difference is that a ConcurrentMap persists all elements that are added to it until
   * they are explicitly removed. A Cache on the other hand is generally configured to evict entries
   * automatically, in order to constrain its memory footprint.  Note that this cache does not use
   * weak keys/values and thus does not respond to memory pressure.
   * @return (undocumented)
   */
  private  com.google.common.cache.LoadingCache<org.apache.spark.sql.catalyst.expressions.codegen.CodeAndComment, org.apache.spark.sql.catalyst.expressions.codegen.GeneratedClass> cache ()  { throw new RuntimeException(); }
}
