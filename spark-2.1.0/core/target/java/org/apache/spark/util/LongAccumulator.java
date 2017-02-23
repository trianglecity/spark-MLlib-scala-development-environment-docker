package org.apache.spark.util;
/**
 * An {@link AccumulatorV2 accumulator} for computing sum, count, and averages for 64-bit integers.
 * <p>
 * @since 2.0.0
 */
public  class LongAccumulator extends org.apache.spark.util.AccumulatorV2<java.lang.Long, java.lang.Long> {
  public   LongAccumulator ()  { throw new RuntimeException(); }
  private  long _sum ()  { throw new RuntimeException(); }
  private  long _count ()  { throw new RuntimeException(); }
  /**
   * Adds v to the accumulator, i.e. increment sum by v and count by 1.
   * @since 2.0.0
   * @return (undocumented)
   */
  public  boolean isZero ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.LongAccumulator copy ()  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  /**
   * Adds v to the accumulator, i.e. increment sum by v and count by 1.
   * @since 2.0.0
   * @param v (undocumented)
   */
  public  void add (java.lang.Long v)  { throw new RuntimeException(); }
  /**
   * Adds v to the accumulator, i.e. increment sum by v and count by 1.
   * @since 2.0.0
   * @param v (undocumented)
   */
  public  void add (long v)  { throw new RuntimeException(); }
  /**
   * Returns the number of elements added to the accumulator.
   * @since 2.0.0
   * @return (undocumented)
   */
  public  long count ()  { throw new RuntimeException(); }
  /**
   * Returns the sum of elements added to the accumulator.
   * @since 2.0.0
   * @return (undocumented)
   */
  public  long sum ()  { throw new RuntimeException(); }
  /**
   * Returns the average of elements added to the accumulator.
   * @since 2.0.0
   * @return (undocumented)
   */
  public  double avg ()  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.util.AccumulatorV2<java.lang.Long, java.lang.Long> other)  { throw new RuntimeException(); }
    void setValue (long newValue)  { throw new RuntimeException(); }
  public  java.lang.Long value ()  { throw new RuntimeException(); }
}
