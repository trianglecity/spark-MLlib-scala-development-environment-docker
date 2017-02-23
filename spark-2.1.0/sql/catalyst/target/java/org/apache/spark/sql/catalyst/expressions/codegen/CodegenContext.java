package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * A context for codegen, tracking a list of objects that could be passed into generated Java
 * function.
 */
public  class CodegenContext {
  public   CodegenContext ()  { throw new RuntimeException(); }
  /**
   * Holding a list of objects that could be used passed into generated class.
   * @return (undocumented)
   */
  public  scala.collection.mutable.ArrayBuffer<java.lang.Object> references ()  { throw new RuntimeException(); }
  /**
   * Add an object to <code>references</code>.
   * <p>
   * Returns the code to access it.
   * <p>
   * This is for minor objects not to store the object into field but refer it from the references
   * field at the time of use because number of fields in class is limited so we should reduce it.
   * @param obj (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String addReferenceObj (Object obj)  { throw new RuntimeException(); }
  /**
   * Add an object to <code>references</code>, create a class member to access it.
   * <p>
   * Returns the name of class member.
   * @param name (undocumented)
   * @param obj (undocumented)
   * @param className (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String addReferenceObj (java.lang.String name, Object obj, java.lang.String className)  { throw new RuntimeException(); }
  /**
   * Holding a list of generated columns as input of current operator, will be used by
   * BoundReference to generate code.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> currentVars ()  { throw new RuntimeException(); }
  /**
   * Whether should we copy the result rows or not.
   * <p>
   * If any operator inside WholeStageCodegen generate multiple rows from a single row (for
   * example, Join), this should be true.
   * <p>
   * If an operator starts a new pipeline, this should be reset to false before calling <code>consume()</code>.
   * @return (undocumented)
   */
  public  boolean copyResult ()  { throw new RuntimeException(); }
  /**
   * Holding expressions' mutable states like <code>MonotonicallyIncreasingID.count</code> as a
   * 3-tuple: java type, variable name, code to init it.
   * As an example, ("int", "count", "count = 0;") will produce code:
   * <pre><code>
   *   private int count;
   * </code></pre>
   * as a member variable, and add
   * <pre><code>
   *   count = 0;
   * </code></pre>
   * to the constructor.
   * <p>
   * They will be kept as member variables in generated classes like <code>SpecificProjection</code>.
   * @return (undocumented)
   */
  public  scala.collection.mutable.ArrayBuffer<scala.Tuple3<java.lang.String, java.lang.String, java.lang.String>> mutableStates ()  { throw new RuntimeException(); }
  public  void addMutableState (java.lang.String javaType, java.lang.String variableName, java.lang.String initCode)  { throw new RuntimeException(); }
  /**
   * Add buffer variable which stores data coming from an {@link InternalRow}. This methods guarantees
   * that the variable is safely stored, which is important for (potentially) byte array backed
   * data types like: UTF8String, ArrayData, MapData &amp; InternalRow.
   * @param dataType (undocumented)
   * @param variableName (undocumented)
   * @param initCode (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode addBufferedState (org.apache.spark.sql.types.DataType dataType, java.lang.String variableName, java.lang.String initCode)  { throw new RuntimeException(); }
  public  java.lang.String declareMutableStates ()  { throw new RuntimeException(); }
  public  java.lang.String initMutableStates ()  { throw new RuntimeException(); }
  /**
   * Code statements to initialize states that depend on the partition index.
   * An integer <code>partitionIndex</code> will be made available within the scope.
   * @return (undocumented)
   */
  public  scala.collection.mutable.ArrayBuffer<java.lang.String> partitionInitializationStatements ()  { throw new RuntimeException(); }
  public  void addPartitionInitializationStatement (java.lang.String statement)  { throw new RuntimeException(); }
  public  java.lang.String initPartition ()  { throw new RuntimeException(); }
  /**
   * Holding all the functions those will be added into generated class.
   * @return (undocumented)
   */
  public  scala.collection.mutable.Map<java.lang.String, java.lang.String> addedFunctions ()  { throw new RuntimeException(); }
  public  void addNewFunction (java.lang.String funcName, java.lang.String funcCode)  { throw new RuntimeException(); }
  /**
   * Holds expressions that are equivalent. Used to perform subexpression elimination
   * during codegen.
   * <p>
   * For expressions that appear more than once, generate additional code to prevent
   * recomputing the value.
   * <p>
   * For example, consider two expression generated from this SQL statement:
   *  SELECT (col1 + col2), (col1 + col2) / col3.
   * <p>
   *  equivalentExpressions will match the tree containing <code>col1 + col2</code> and it will only
   *  be evaluated once.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.EquivalentExpressions equivalentExpressions ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState> subExprEliminationExprs ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<java.lang.String> subexprFunctions ()  { throw new RuntimeException(); }
  public  java.lang.String declareAddedFunctions ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_BOOLEAN ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_BYTE ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_SHORT ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_INT ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_LONG ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_FLOAT ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_DOUBLE ()  { throw new RuntimeException(); }
  /** The variable name of the input row in generated code. */
  public final  java.lang.String INPUT_ROW ()  { throw new RuntimeException(); }
  /**
   * The map from a variable name to it's next ID.
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> freshNameIds ()  { throw new RuntimeException(); }
  /**
   * A prefix used to generate fresh name.
   * @return (undocumented)
   */
  public  java.lang.String freshNamePrefix ()  { throw new RuntimeException(); }
  /**
   * The map from a place holder to a corresponding comment
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> placeHolderToComments ()  { throw new RuntimeException(); }
  /**
   * Returns a term name that is unique within this instance of a <code>CodegenContext</code>.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String freshName (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Returns the specialized code to access a value from <code>inputRow</code> at <code>ordinal</code>.
   * @param input (undocumented)
   * @param dataType (undocumented)
   * @param ordinal (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getValue (java.lang.String input, org.apache.spark.sql.types.DataType dataType, java.lang.String ordinal)  { throw new RuntimeException(); }
  /**
   * Returns the code to update a column in Row for a given DataType.
   * @param row (undocumented)
   * @param dataType (undocumented)
   * @param ordinal (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String setColumn (java.lang.String row, org.apache.spark.sql.types.DataType dataType, int ordinal, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Update a column in MutableRow from ExprCode.
   * <p>
   * @param isVectorized True if the underlying row is of type <code>ColumnarBatch.Row</code>, false otherwise
   * @param row (undocumented)
   * @param dataType (undocumented)
   * @param ordinal (undocumented)
   * @param ev (undocumented)
   * @param nullable (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String updateColumn (java.lang.String row, org.apache.spark.sql.types.DataType dataType, int ordinal, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev, boolean nullable, boolean isVectorized)  { throw new RuntimeException(); }
  /**
   * Returns the specialized code to set a given value in a column vector for a given <code>DataType</code>.
   * @param batch (undocumented)
   * @param row (undocumented)
   * @param dataType (undocumented)
   * @param ordinal (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String setValue (java.lang.String batch, java.lang.String row, org.apache.spark.sql.types.DataType dataType, int ordinal, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Returns the specialized code to set a given value in a column vector for a given <code>DataType</code>
   * that could potentially be nullable.
   * @param batch (undocumented)
   * @param row (undocumented)
   * @param dataType (undocumented)
   * @param ordinal (undocumented)
   * @param ev (undocumented)
   * @param nullable (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String updateColumn (java.lang.String batch, java.lang.String row, org.apache.spark.sql.types.DataType dataType, int ordinal, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev, boolean nullable)  { throw new RuntimeException(); }
  /**
   * Returns the specialized code to access a value from a column vector for a given <code>DataType</code>.
   * @param batch (undocumented)
   * @param row (undocumented)
   * @param dataType (undocumented)
   * @param ordinal (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getValue (java.lang.String batch, java.lang.String row, org.apache.spark.sql.types.DataType dataType, int ordinal)  { throw new RuntimeException(); }
  /**
   * Returns the name used in accessor and setter for a Java primitive type.
   * @param jt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String primitiveTypeName (java.lang.String jt)  { throw new RuntimeException(); }
  public  java.lang.String primitiveTypeName (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Returns the Java type for a DataType.
   * @param dt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String javaType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Returns the boxed type in Java.
   * @param jt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String boxedType (java.lang.String jt)  { throw new RuntimeException(); }
  public  java.lang.String boxedType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Returns the representation of default value for a given Java Type.
   * @param jt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String defaultValue (java.lang.String jt)  { throw new RuntimeException(); }
  public  java.lang.String defaultValue (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Generates code for equal expression in Java.
   * @param dataType (undocumented)
   * @param c1 (undocumented)
   * @param c2 (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String genEqual (org.apache.spark.sql.types.DataType dataType, java.lang.String c1, java.lang.String c2)  { throw new RuntimeException(); }
  /**
   * Generates code for comparing two expressions.
   * <p>
   * @param dataType data type of the expressions
   * @param c1 name of the variable of expression 1's output
   * @param c2 name of the variable of expression 2's output
   * @return (undocumented)
   */
  public  java.lang.String genComp (org.apache.spark.sql.types.DataType dataType, java.lang.String c1, java.lang.String c2)  { throw new RuntimeException(); }
  /**
   * Generates code for greater of two expressions.
   * <p>
   * @param dataType data type of the expressions
   * @param c1 name of the variable of expression 1's output
   * @param c2 name of the variable of expression 2's output
   * @return (undocumented)
   */
  public  java.lang.String genGreater (org.apache.spark.sql.types.DataType dataType, java.lang.String c1, java.lang.String c2)  { throw new RuntimeException(); }
  /**
   * Generates code to do null safe execution, i.e. only execute the code when the input is not
   * null by adding null check if necessary.
   * <p>
   * @param nullable used to decide whether we should add null check or not.
   * @param isNull the code to check if the input is null.
   * @param execute the code that should only be executed when the input is not null.
   * @return (undocumented)
   */
  public  java.lang.String nullSafeExec (boolean nullable, java.lang.String isNull, java.lang.String execute)  { throw new RuntimeException(); }
  /**
   * List of java data types that have special accessors and setters in {@link InternalRow}.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> primitiveTypes ()  { throw new RuntimeException(); }
  /**
   * Returns true if the Java type has a special accessor and setter in {@link InternalRow}.
   * @param jt (undocumented)
   * @return (undocumented)
   */
  public  boolean isPrimitiveType (java.lang.String jt)  { throw new RuntimeException(); }
  public  boolean isPrimitiveType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Splits the generated code of expressions into multiple functions, because function has
   * 64kb code size limit in JVM
   * <p>
   * @param row the variable name of row that is used by expressions
   * @param expressions the codes to evaluate expressions.
   * @return (undocumented)
   */
  public  java.lang.String splitExpressions (java.lang.String row, scala.collection.Seq<java.lang.String> expressions)  { throw new RuntimeException(); }
  private  java.lang.String splitExpressions (scala.collection.Seq<java.lang.String> expressions, java.lang.String funcName, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> arguments)  { throw new RuntimeException(); }
  /**
   * Perform a function which generates a sequence of ExprCodes with a given mapping between
   * expressions and common expressions, instead of using the mapping in current context.
   * @param newSubExprEliminationExprs (undocumented)
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> withSubExprEliminationExprs (scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState> newSubExprEliminationExprs, scala.Function0<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode>> f)  { throw new RuntimeException(); }
  /**
   * Checks and sets up the state and codegen for subexpression elimination. This finds the
   * common subexpressions, generates the code snippets that evaluate those expressions and
   * populates the mapping of common subexpressions to the generated code snippets. The generated
   * code snippets will be returned and should be inserted into generated codes before these
   * common subexpressions actually are used first time.
   * @param expressions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.codegen.SubExprCodes subexpressionEliminationForWholeStageCodegen (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  { throw new RuntimeException(); }
  /**
   * Checks and sets up the state and codegen for subexpression elimination. This finds the
   * common subexpressions, generates the functions that evaluate those expressions and populates
   * the mapping of common subexpressions to the generated functions.
   * @param expressions (undocumented)
   */
  private  void subexpressionElimination (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  { throw new RuntimeException(); }
  /**
   * Generates code for expressions. If doSubexpressionElimination is true, subexpression
   * elimination will be performed. Subexpression elimination assumes that the code will for each
   * expression will be combined in the <code>expressions</code> order.
   * @param expressions (undocumented)
   * @param doSubexpressionElimination (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> generateExpressions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, boolean doSubexpressionElimination)  { throw new RuntimeException(); }
  /**
   * get a map of the pair of a place holder and a corresponding comment
   * @return (undocumented)
   */
  public  scala.collection.Map<java.lang.String, java.lang.String> getPlaceHolderToComments ()  { throw new RuntimeException(); }
  /**
   * Register a comment and return the corresponding place holder
   * @param text (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String registerComment (scala.Function0<java.lang.String> text)  { throw new RuntimeException(); }
}
