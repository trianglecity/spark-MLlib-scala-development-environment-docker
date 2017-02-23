package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Interface for generated predicate
 */
public abstract class Predicate {
  public   Predicate ()  { throw new RuntimeException(); }
  public abstract  boolean eval (org.apache.spark.sql.catalyst.InternalRow r)  ;
  /**
   * Initializes internal states given the current partition index.
   * This is used by nondeterministic expressions to set initial states.
   * The default implementation does nothing.
   * @param partitionIndex (undocumented)
   */
  public  void initialize (int partitionIndex)  { throw new RuntimeException(); }
}
