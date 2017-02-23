package org.apache.spark.sql.catalyst.expressions;
/** A specified Window Frame. */
public  class SpecifiedWindowFrame implements org.apache.spark.sql.catalyst.expressions.WindowFrame, scala.Product, scala.Serializable {
  /**
   * @param hasOrderSpecification If the window spec has order by expressions.
   * @param acceptWindowFrame If the window function accepts user-specified frame.
   * @return
   */
  static public  org.apache.spark.sql.catalyst.expressions.SpecifiedWindowFrame defaultWindowFrame (boolean hasOrderSpecification, boolean acceptWindowFrame)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.FrameType frameType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.FrameBoundary frameStart ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.FrameBoundary frameEnd ()  { throw new RuntimeException(); }
  // not preceding
  public   SpecifiedWindowFrame (org.apache.spark.sql.catalyst.expressions.FrameType frameType, org.apache.spark.sql.catalyst.expressions.FrameBoundary frameStart, org.apache.spark.sql.catalyst.expressions.FrameBoundary frameEnd)  { throw new RuntimeException(); }
  /** If this WindowFrame is valid or not. */
  public  scala.Option<java.lang.String> validate ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
