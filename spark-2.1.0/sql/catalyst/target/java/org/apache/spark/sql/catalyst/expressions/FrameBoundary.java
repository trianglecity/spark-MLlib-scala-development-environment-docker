package org.apache.spark.sql.catalyst.expressions;
/**
 * The trait used to represent the type of a Window Frame Boundary.
 */
public  interface FrameBoundary {
  public  boolean notFollows (org.apache.spark.sql.catalyst.expressions.FrameBoundary other)  ;
}
