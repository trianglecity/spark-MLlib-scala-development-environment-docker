package org.apache.spark.mllib.fpm;
/**
 * FP-Tree data structure used in FP-Growth.
 * @tparam T item type
 */
  class FPTree<T extends java.lang.Object> implements scala.Serializable {
  /** Representing a node in an FP-Tree. */
  static public  class Node<T extends java.lang.Object> implements scala.Serializable {
    public  org.apache.spark.mllib.fpm.FPTree.Node<T> parent ()  { throw new RuntimeException(); }
    // not preceding
    public   Node (org.apache.spark.mllib.fpm.FPTree.Node<T> parent)  { throw new RuntimeException(); }
    public  T item ()  { throw new RuntimeException(); }
    public  long count ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.Map<T, org.apache.spark.mllib.fpm.FPTree.Node<T>> children ()  { throw new RuntimeException(); }
    public  boolean isRoot ()  { throw new RuntimeException(); }
  }
  /** Summary of an item in an FP-Tree. */
  static private  class Summary<T extends java.lang.Object> implements scala.Serializable {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   Summary ()  { throw new RuntimeException(); }
    public  long count ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.ListBuffer<org.apache.spark.mllib.fpm.FPTree.Node<T>> nodes ()  { throw new RuntimeException(); }
  }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   FPTree ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.fpm.FPTree.Node<T> root ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.Map<T, org.apache.spark.mllib.fpm.FPTree.Summary<T>> summaries ()  { throw new RuntimeException(); }
  /** Adds a transaction with count. */
  public  org.apache.spark.mllib.fpm.FPTree<T> add (scala.collection.Iterable<T> t, long count)  { throw new RuntimeException(); }
  /** Merges another FP-Tree. */
  public  org.apache.spark.mllib.fpm.FPTree<T> merge (org.apache.spark.mllib.fpm.FPTree<T> other)  { throw new RuntimeException(); }
  /** Gets a subtree with the suffix. */
  private  org.apache.spark.mllib.fpm.FPTree<T> project (T suffix)  { throw new RuntimeException(); }
  /** Returns all transactions in an iterator. */
  public  scala.collection.Iterator<scala.Tuple2<scala.collection.immutable.List<T>, java.lang.Object>> transactions ()  { throw new RuntimeException(); }
  /** Returns all transactions under this node. */
  private  scala.collection.Iterator<scala.Tuple2<scala.collection.immutable.List<T>, java.lang.Object>> getTransactions (org.apache.spark.mllib.fpm.FPTree.Node<T> node)  { throw new RuntimeException(); }
  /** Extracts all patterns with valid suffix and minimum count. */
  public  scala.collection.Iterator<scala.Tuple2<scala.collection.immutable.List<T>, java.lang.Object>> extract (long minCount, scala.Function1<T, java.lang.Object> validateSuffix)  { throw new RuntimeException(); }
}
