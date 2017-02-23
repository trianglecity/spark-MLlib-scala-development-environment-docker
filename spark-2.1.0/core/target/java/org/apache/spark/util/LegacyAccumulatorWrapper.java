package org.apache.spark.util;
public  class LegacyAccumulatorWrapper<R extends java.lang.Object, T extends java.lang.Object> extends org.apache.spark.util.AccumulatorV2<T, R> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   LegacyAccumulatorWrapper (R initialValue, org.apache.spark.AccumulableParam<R, T> param)  { throw new RuntimeException(); }
    R _value ()  { throw new RuntimeException(); }
  public  boolean isZero ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.LegacyAccumulatorWrapper<R, T> copy ()  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  public  void add (T v)  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.util.AccumulatorV2<T, R> other)  { throw new RuntimeException(); }
  public  R value ()  { throw new RuntimeException(); }
}
