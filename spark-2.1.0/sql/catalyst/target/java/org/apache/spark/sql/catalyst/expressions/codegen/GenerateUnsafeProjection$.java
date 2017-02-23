package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Generates a {@link Projection} that returns an {@link UnsafeRow}.
 * <p>
 * It generates the code for all the expressions, compute the total length for all the columns
 * (can be accessed via variables), and then copy the data into a scratch buffer space in the
 * form of UnsafeRow (the scratch buffer will grow as needed).
 * <p>
 * Note: The returned UnsafeRow will be pointed to a scratch buffer inside the projection.
 */
public  class GenerateUnsafeProjection$ extends org.apache.spark.sql.catalyst.expressions.codegen.CodeGenerator<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.UnsafeProjection> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GenerateUnsafeProjection$ MODULE$ = null;
  public   GenerateUnsafeProjection$ ()  { throw new RuntimeException(); }
  /** Returns true iff we support this data type. */
  public  boolean canSupport (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  private  java.lang.String writeStructToBuffer (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, scala.collection.Seq<org.apache.spark.sql.types.DataType> fieldTypes, java.lang.String bufferHolder)  { throw new RuntimeException(); }
  private  java.lang.String writeExpressionsToBuffer (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String row, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> inputs, scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes, java.lang.String bufferHolder, boolean isTopLevel)  { throw new RuntimeException(); }
  private  java.lang.String writeArrayToBuffer (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, org.apache.spark.sql.types.DataType elementType, java.lang.String bufferHolder)  { throw new RuntimeException(); }
  private  java.lang.String writeMapToBuffer (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, org.apache.spark.sql.types.DataType keyType, org.apache.spark.sql.types.DataType valueType, java.lang.String bufferHolder)  { throw new RuntimeException(); }
  /**
   * If the input is already in unsafe format, we don't need to go through all elements/fields,
   * we can directly write it.
   * @param ctx (undocumented)
   * @param input (undocumented)
   * @param bufferHolder (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String writeUnsafeData (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, java.lang.String bufferHolder)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode createCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, boolean useSubexprElimination)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> canonicalize (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> bind (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection generate (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, boolean subexpressionEliminationEnabled)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> references)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, boolean subexpressionEliminationEnabled)  { throw new RuntimeException(); }
}
