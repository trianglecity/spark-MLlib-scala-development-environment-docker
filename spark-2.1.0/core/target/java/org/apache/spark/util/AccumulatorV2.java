package org.apache.spark.util;
/**
 * The base class for accumulators, that can accumulate inputs of type <code>IN</code>, and produce output of
 * type <code>OUT</code>.
 * <p>
 * <code>OUT</code> should be a type that can be read atomically (e.g., Int, Long), or thread-safely
 * (e.g., synchronized collections) because it will be read from other threads.
 */
public abstract class AccumulatorV2<IN extends java.lang.Object, OUT extends java.lang.Object> implements scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   AccumulatorV2 ()  { throw new RuntimeException(); }
    org.apache.spark.util.AccumulatorMetadata metadata ()  { throw new RuntimeException(); }
    void register (org.apache.spark.SparkContext sc, scala.Option<java.lang.String> name, boolean countFailedValues)  { throw new RuntimeException(); }
  /**
   * Returns true if this accumulator has been registered.
   * <p>
   * @note All accumulators must be registered before use, or it will throw exception.
   * @return (undocumented)
   */
  public final  boolean isRegistered ()  { throw new RuntimeException(); }
  private  void assertMetadataNotNull ()  { throw new RuntimeException(); }
  /**
   * Returns the id of this accumulator, can only be called after registration.
   * @return (undocumented)
   */
  public final  long id ()  { throw new RuntimeException(); }
  /**
   * Returns the name of this accumulator, can only be called after registration.
   * @return (undocumented)
   */
  public final  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
  /**
   * Whether to accumulate values from failed tasks. This is set to true for system and time
   * metrics like serialization time or bytes spilled, and false for things with absolute values
   * like number of input rows.  This should be used for internal metrics only.
   * @return (undocumented)
   */
   final  boolean countFailedValues ()  { throw new RuntimeException(); }
  /**
   * Creates an {@link AccumulableInfo} representation of this {@link AccumulatorV2} with the provided
   * values.
   * @param update (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.scheduler.AccumulableInfo toInfo (scala.Option<java.lang.Object> update, scala.Option<java.lang.Object> value)  { throw new RuntimeException(); }
   final  boolean isAtDriverSide ()  { throw new RuntimeException(); }
  /**
   * Returns if this accumulator is zero value or not. e.g. for a counter accumulator, 0 is zero
   * value; for a list accumulator, Nil is zero value.
   * @return (undocumented)
   */
  public abstract  boolean isZero ()  ;
  /**
   * Creates a new copy of this accumulator, which is zero value. i.e. call <code>isZero</code> on the copy
   * must return true.
   * @return (undocumented)
   */
  public  org.apache.spark.util.AccumulatorV2<IN, OUT> copyAndReset ()  { throw new RuntimeException(); }
  /**
   * Creates a new copy of this accumulator.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.util.AccumulatorV2<IN, OUT> copy ()  ;
  /**
   * Resets this accumulator, which is zero value. i.e. call <code>isZero</code> must
   * return true.
   */
  public abstract  void reset ()  ;
  /**
   * Takes the inputs and accumulates.
   * @param v (undocumented)
   */
  public abstract  void add (IN v)  ;
  /**
   * Merges another same-type accumulator into this one and update its state, i.e. this should be
   * merge-in-place.
   * @param other (undocumented)
   */
  public abstract  void merge (org.apache.spark.util.AccumulatorV2<IN, OUT> other)  ;
  /**
   * Defines the current value of this accumulator
   * @return (undocumented)
   */
  public abstract  OUT value ()  ;
  protected final  Object writeReplace ()  { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream in)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
