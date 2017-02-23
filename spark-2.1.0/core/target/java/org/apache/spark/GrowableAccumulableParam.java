package org.apache.spark;
/**
 * @deprecated use AccumulatorV2. Since 2.0.0. 
*/
  class GrowableAccumulableParam<R extends java.lang.Object, T extends java.lang.Object> implements org.apache.spark.AccumulableParam<R, T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   GrowableAccumulableParam (scala.Function1<R, scala.collection.generic.Growable<T>> evidence$1, scala.reflect.ClassTag<R> evidence$2)  { throw new RuntimeException(); }
  public  R addAccumulator (R growable, T elem)  { throw new RuntimeException(); }
  public  R addInPlace (R t1, R t2)  { throw new RuntimeException(); }
  public  R zero (R initialValue)  { throw new RuntimeException(); }
}
