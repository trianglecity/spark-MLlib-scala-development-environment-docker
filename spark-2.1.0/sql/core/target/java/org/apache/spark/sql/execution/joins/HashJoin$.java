package org.apache.spark.sql.execution.joins;
public  class HashJoin$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HashJoin$ MODULE$ = null;
  public   HashJoin$ ()  { throw new RuntimeException(); }
  /**
   * Try to rewrite the key as LongType so we can use getLong(), if they key can fit with a long.
   * <p>
   * If not, returns the original expressions.
   * @param keys (undocumented)
   * @return (undocumented)
   */
    scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rewriteKeyExpr (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> keys)  { throw new RuntimeException(); }
}
