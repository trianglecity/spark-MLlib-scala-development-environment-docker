package org.apache.spark.sql.catalyst.expressions;
/**
 * Base class for interpreted hash functions.
 */
public abstract class InterpretedHashFunction {
  public   InterpretedHashFunction ()  { throw new RuntimeException(); }
  protected abstract  long hashInt (int i, long seed)  ;
  protected abstract  long hashLong (long l, long seed)  ;
  protected abstract  long hashUnsafeBytes (java.lang.Object base, long offset, int length, long seed)  ;
  public  long hash (Object value, org.apache.spark.sql.types.DataType dataType, long seed)  { throw new RuntimeException(); }
}
