package org.apache.spark.util;
/**
 * An {@link AccumulatorV2 accumulator} for computing sum, count, and averages for double precision
 * floating numbers.
 * <p>
 * @since 2.0.0
 */
public  class DoubleAccumulator extends org.apache.spark.util.AccumulatorV2<java.lang.Double, java.lang.Double> {
  public   DoubleAccumulator ()  { throw new RuntimeException(); }
  private  double _sum ()  { throw new RuntimeException(); }
  private  long _count ()  { throw new RuntimeException(); }
  public  boolean isZero ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.DoubleAccumulator copy ()  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  /**
   * Adds v to the accumulator, i.e. increment sum by v and count by 1.
   * @since 2.0.0
   * @param v (undocumented)
   */
  public  void add (java.lang.Double v)  { throw new RuntimeException(); }
  /**
   * Adds v to the accumulator, i.e. increment sum by v and count by 1.
   * @since 2.0.0
   * @param v (undocumented)
   */
  public  void add (double v)  { throw new RuntimeException(); }
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
  public  double sum ()  { throw new RuntimeException(); }
  /**
   * Returns the average of elements added to the accumulator.
   * @since 2.0.0
   * @return (undocumented)
   */
  public  double avg ()  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.util.AccumulatorV2<java.lang.Double, java.lang.Double> other)  { throw new RuntimeException(); }
    void setValue (double newValue)  { throw new RuntimeException(); }
  public  java.lang.Double value ()  { throw new RuntimeException(); }
}
