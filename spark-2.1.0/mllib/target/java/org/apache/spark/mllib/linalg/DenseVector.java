package org.apache.spark.mllib.linalg;
/**
 * A dense vector represented by a value array.
 */
public  class DenseVector implements org.apache.spark.mllib.linalg.Vector {
  /** Extracts the value array from a dense vector. */
  static public  scala.Option<double[]> unapply (org.apache.spark.mllib.linalg.DenseVector dv)  { throw new RuntimeException(); }
  /**
   * Convert new linalg type to spark.mllib type.  Light copy; only copies references
   * @param v (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.linalg.DenseVector fromML (org.apache.spark.ml.linalg.DenseVector v)  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.linalg.DenseVector toDense ()  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.linalg.Vector compressed ()  { throw new RuntimeException(); }
  public  double[] values ()  { throw new RuntimeException(); }
  // not preceding
  public   DenseVector (double[] values)  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  double[] toArray ()  { throw new RuntimeException(); }
    breeze.linalg.Vector<java.lang.Object> asBreeze ()  { throw new RuntimeException(); }
  public  double apply (int i)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseVector copy ()  { throw new RuntimeException(); }
  public  void foreachActive (scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  int numActives ()  { throw new RuntimeException(); }
  public  int numNonzeros ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.SparseVector toSparse ()  { throw new RuntimeException(); }
  public  int argmax ()  { throw new RuntimeException(); }
  public  java.lang.String toJson ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.DenseVector asML ()  { throw new RuntimeException(); }
}
