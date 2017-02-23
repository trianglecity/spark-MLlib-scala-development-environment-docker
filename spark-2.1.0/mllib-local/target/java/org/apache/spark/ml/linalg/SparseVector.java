package org.apache.spark.ml.linalg;
/**
 * A sparse vector represented by an index array and a value array.
 * <p>
 * param:  size size of the vector.
 * param:  indices index array, assume to be strictly increasing.
 * param:  values value array, must have the same length as the index array.
 */
public  class SparseVector implements org.apache.spark.ml.linalg.Vector {
  static public  scala.Option<scala.Tuple3<java.lang.Object, int[], double[]>> unapply (org.apache.spark.ml.linalg.SparseVector sv)  { throw new RuntimeException(); }
  static public  double apply (int i)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.linalg.DenseVector toDense ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.linalg.Vector compressed ()  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  public  int[] indices ()  { throw new RuntimeException(); }
  public  double[] values ()  { throw new RuntimeException(); }
  // not preceding
  public   SparseVector (int size, int[] indices, double[] values)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  double[] toArray ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.SparseVector copy ()  { throw new RuntimeException(); }
    breeze.linalg.Vector<java.lang.Object> asBreeze ()  { throw new RuntimeException(); }
  public  void foreachActive (scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  int numActives ()  { throw new RuntimeException(); }
  public  int numNonzeros ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.SparseVector toSparse ()  { throw new RuntimeException(); }
  public  int argmax ()  { throw new RuntimeException(); }
  /**
   * Create a slice of this vector based on the given indices.
   * @param selectedIndices Unsorted list of indices into the vector.
   *                        This does NOT do bound checking.
   * @return  New SparseVector with values in the order specified by the given indices.
   * <p>
   * NOTE: The API needs to be discussed before making this public.
   *       Also, if we have a version assuming indices are sorted, we should optimize it.
   */
    org.apache.spark.ml.linalg.SparseVector slice (int[] selectedIndices)  { throw new RuntimeException(); }
}
