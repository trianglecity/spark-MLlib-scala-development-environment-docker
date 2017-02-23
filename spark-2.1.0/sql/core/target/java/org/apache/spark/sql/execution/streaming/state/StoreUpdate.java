package org.apache.spark.sql.execution.streaming.state;
/** Trait representing updates made to a {@link StateStore}. */
public  interface StoreUpdate {
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow key ()  ;
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow value ()  ;
}
