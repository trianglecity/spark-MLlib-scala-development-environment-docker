package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Java can not access Projection (in package object)
 */
public abstract class BaseProjection extends org.apache.spark.sql.catalyst.expressions.Projection {
  public   BaseProjection ()  { throw new RuntimeException(); }
}
