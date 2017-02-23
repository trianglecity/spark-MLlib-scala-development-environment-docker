package org.apache.spark.sql.catalyst;
/**
 * Support for generating catalyst schemas for scala objects.  Note that unlike its companion
 * object, this trait able to work in both the runtime and the compile time (macro) universe.
 */
public  interface ScalaReflection {
  static public  class Schema implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
    public  boolean nullable ()  { throw new RuntimeException(); }
    // not preceding
    public   Schema (org.apache.spark.sql.types.DataType dataType, boolean nullable)  { throw new RuntimeException(); }
  }
  static public  class Schema$ extends scala.runtime.AbstractFunction2<org.apache.spark.sql.types.DataType, java.lang.Object, org.apache.spark.sql.catalyst.ScalaReflection.Schema> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Schema$ MODULE$ = null;
    public   Schema$ ()  { throw new RuntimeException(); }
  }
  /** The universe we work in (runtime or macro) */
  public  scala.reflect.api.Universe universe ()  ;
  /** The mirror used to access types in the universe */
  public  org.apache.spark.sql.catalyst.ScalaReflection.universe mirror ()  ;
  /**
   * Return the Scala Type for <code>T</code> in the current classloader mirror.
   * <p>
   * Use this method instead of the convenience method <code>universe.typeOf</code>, which
   * assumes that all types can be found in the classloader that loaded scala-reflect classes.
   * That's not necessarily the case when running using Eclipse launchers or even
   * Sbt console or test (without <code>fork := true</code>).
   * <p>
   * @see SPARK-5281
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.catalyst.ScalaReflection.universe localTypeOf (scala.reflect.api.TypeTags.TypeTag<T> evidence$6)  ;
  /**
   * Returns the full class name for a type. The returned name is the canonical
   * Scala name, where each component is separated by a period. It is NOT the
   * Java-equivalent runtime name (no dollar signs).
   * <p>
   * In simple cases, both the Scala and Java names are the same, however when Scala
   * generates constructs that do not map to a Java equivalent, such as singleton objects
   * or nested classes in package objects, it uses the dollar sign ($) to create
   * synthetic classes, emulating behaviour in Java bytecode.
   * @param tpe (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getClassNameFromType (org.apache.spark.sql.catalyst.ScalaReflection.universe tpe)  ;
  /**
   * Returns classes of input parameters of scala function object.
   * @param func (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Class<?>> getParameterTypes (java.lang.Object func)  ;
  /**
   * Returns the parameter names and types for the primary constructor of this type.
   * <p>
   * Note that it only works for scala classes with primary constructor, and currently doesn't
   * support inner class.
   * @param tpe (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, scala.reflect.api.Types.TypeApi>> getConstructorParameters (org.apache.spark.sql.catalyst.ScalaReflection.universe tpe)  ;
  public  scala.collection.Seq<scala.reflect.api.Symbols.SymbolApi> constructParams (org.apache.spark.sql.catalyst.ScalaReflection.universe tpe)  ;
}
