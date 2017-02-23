package org.apache.spark;
/**
 * A data type that can be accumulated, i.e. has a commutative and associative "add" operation,
 * but where the result type, <code>R</code>, may be different from the element type being added, <code>T</code>.
 * <p>
 * You must define how to add data, and how to merge two of these together.  For some data types,
 * such as a counter, these might be the same operation. In that case, you can use the simpler
 * {@link org.apache.spark.Accumulator}. They won't always be the same, though -- e.g., imagine you are
 * accumulating a set. You will add items to the set, and you will union two sets together.
 * <p>
 * Operations are not thread-safe.
 * <p>
 * param:  id ID of this accumulator; for internal use only.
 * param:  initialValue initial value of accumulator
 * param:  param helper object defining how to add elements of type <code>R</code> and <code>T</code>
 * param:  name human-readable name for use in Spark's web UI
 * param:  countFailedValues whether to accumulate values from failed tasks. This is set to true
 *                          for system and time metrics like serialization time or bytes spilled,
 *                          and false for things with absolute values like number of input rows.
 *                          This should be used for internal metrics only.
 * @tparam R the full accumulated data (result type)
 * @tparam T partial data that can be added in
 *
 * @deprecated use AccumulatorV2. Since 2.0.0. 
*/
public  class Accumulable<R extends java.lang.Object, T extends java.lang.Object> implements java.io.Serializable {
  public  long id ()  { throw new RuntimeException(); }
  private  R initialValue ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
    boolean countFailedValues ()  { throw new RuntimeException(); }
  // not preceding
  private   Accumulable (long id, R initialValue, org.apache.spark.AccumulableParam<R, T> param, scala.Option<java.lang.String> name, boolean countFailedValues)  { throw new RuntimeException(); }
     Accumulable (R initialValue, org.apache.spark.AccumulableParam<R, T> param, scala.Option<java.lang.String> name, boolean countFailedValues)  { throw new RuntimeException(); }
     Accumulable (R initialValue, org.apache.spark.AccumulableParam<R, T> param, scala.Option<java.lang.String> name)  { throw new RuntimeException(); }
  public   Accumulable (R initialValue, org.apache.spark.AccumulableParam<R, T> param)  { throw new RuntimeException(); }
  public  R zero ()  { throw new RuntimeException(); }
    org.apache.spark.util.LegacyAccumulatorWrapper<R, T> newAcc ()  { throw new RuntimeException(); }
  /**
   * Add more data to this accumulator / accumulable
   * @param term the data to add
   */
  public  void add (T term)  { throw new RuntimeException(); }
  /**
   * Merge two accumulable objects together
   * <p>
   * Normally, a user will not want to use this version, but will instead call <code>add</code>.
   * @param term the other <code>R</code> that will get merged with this
   */
  public  void merge (R term)  { throw new RuntimeException(); }
  /**
   * Access the accumulator's current value; only allowed on driver.
   * @return (undocumented)
   */
  public  R value ()  { throw new RuntimeException(); }
  /**
   * Get the current value of this accumulator from within a task.
   * <p>
   * This is NOT the global value of the accumulator.  To get the global value after a
   * completed operation on the dataset, call <code>value</code>.
   * <p>
   * The typical use of this method is to directly mutate the local value, eg., to add
   * an element to a Set.
   * @return (undocumented)
   */
  public  R localValue ()  { throw new RuntimeException(); }
  /**
   * Set the accumulator's value. For internal use only.
   * @param newValue (undocumented)
   */
  public  void setValue (R newValue)  { throw new RuntimeException(); }
  /**
   * Set the accumulator's value. For internal use only.
   * @param newValue (undocumented)
   */
    void setValueAny (Object newValue)  { throw new RuntimeException(); }
  /**
   * Create an {@link AccumulableInfo} representation of this {@link Accumulable} with the provided values.
   * @param update (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.scheduler.AccumulableInfo toInfo (scala.Option<java.lang.Object> update, scala.Option<java.lang.Object> value)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
