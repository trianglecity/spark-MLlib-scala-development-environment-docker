package org.apache.spark.ml.feature;
/**
 * Represents a fully evaluated and simplified R formula.
 * param:  label the column name of the R formula label (response variable).
 * param:  terms the simplified terms of the R formula. Interactions terms are represented as Seqs
 *              of column names; non-interaction terms as length 1 Seqs.
 * param:  hasIntercept whether the formula specifies fitting with an intercept.
 */
  class ResolvedRFormula implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String label ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<java.lang.String>> terms ()  { throw new RuntimeException(); }
  public  boolean hasIntercept ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolvedRFormula (java.lang.String label, scala.collection.Seq<scala.collection.Seq<java.lang.String>> terms, boolean hasIntercept)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
