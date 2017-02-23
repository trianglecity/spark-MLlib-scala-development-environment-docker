package org.apache.spark.util;
/**
 * An {@link AccumulatorV2 accumulator} for collecting a list of elements.
 * <p>
 * @since 2.0.0
 */
public  class CollectionAccumulator<T extends java.lang.Object> extends org.apache.spark.util.AccumulatorV2<T, java.util.List<T>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   CollectionAccumulator ()  { throw new RuntimeException(); }
  private  java.util.List<T> _list ()  { throw new RuntimeException(); }
  public  boolean isZero ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.CollectionAccumulator<T> copyAndReset ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.CollectionAccumulator<T> copy ()  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  public  void add (T v)  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.util.AccumulatorV2<T, java.util.List<T>> other)  { throw new RuntimeException(); }
  public  java.util.List<T> value ()  { throw new RuntimeException(); }
    void setValue (java.util.List<T> newValue)  { throw new RuntimeException(); }
}
