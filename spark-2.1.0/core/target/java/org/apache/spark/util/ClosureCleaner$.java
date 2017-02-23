package org.apache.spark.util;
/**
 * A cleaner that renders closures serializable if they can be done so safely.
 */
public  class ClosureCleaner$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ClosureCleaner$ MODULE$ = null;
  public   ClosureCleaner$ ()  { throw new RuntimeException(); }
    org.apache.xbean.asm5.ClassReader getClassReader (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  private  boolean isClosure (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  private  scala.Tuple2<scala.collection.immutable.List<java.lang.Class<?>>, scala.collection.immutable.List<java.lang.Object>> getOuterClassesAndObjects (java.lang.Object obj)  { throw new RuntimeException(); }
  /**
   * Return a list of classes that represent closures enclosed in the given closure object.
   * @param obj (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.List<java.lang.Class<?>> getInnerClosureClasses (java.lang.Object obj)  { throw new RuntimeException(); }
  /**
   * Clean the given closure in place.
   * <p>
   * More specifically, this renders the given closure serializable as long as it does not
   * explicitly reference unserializable objects.
   * <p>
   * @param closure the closure to clean
   * @param checkSerializable whether to verify that the closure is serializable after cleaning
   * @param cleanTransitively whether to clean enclosing closures transitively
   */
  public  void clean (java.lang.Object closure, boolean checkSerializable, boolean cleanTransitively)  { throw new RuntimeException(); }
  /**
   * Helper method to clean the given closure in place.
   * <p>
   * The mechanism is to traverse the hierarchy of enclosing closures and null out any
   * references along the way that are not actually used by the starting closure, but are
   * nevertheless included in the compiled anonymous classes. Note that it is unsafe to
   * simply mutate the enclosing closures in place, as other code paths may depend on them.
   * Instead, we clone each enclosing closure and set the parent pointers accordingly.
   * <p>
   * By default, closures are cleaned transitively. This means we detect whether enclosing
   * objects are actually referenced by the starting one, either directly or transitively,
   * and, if not, sever these closures from the hierarchy. In other words, in addition to
   * nulling out unused field references, we also null out any parent pointers that refer
   * to enclosing objects not actually needed by the starting closure. We determine
   * transitivity by tracing through the tree of all methods ultimately invoked by the
   * inner closure and record all the fields referenced in the process.
   * <p>
   * For instance, transitive cleaning is necessary in the following scenario:
   * <p>
   *   class SomethingNotSerializable {
   *     def someValue = 1
   *     def scope(name: String)(body: =&gt; Unit) = body
   *     def someMethod(): Unit = scope("one") {
   *       def x = someValue
   *       def y = 2
   *       scope("two") { println(y + 1) }
   *     }
   *   }
   * <p>
   * In this example, scope "two" is not serializable because it references scope "one", which
   * references SomethingNotSerializable. Note that, however, the body of scope "two" does not
   * actually depend on SomethingNotSerializable. This means we can safely null out the parent
   * pointer of a cloned scope "one" and set it the parent of scope "two", such that scope "two"
   * no longer references SomethingNotSerializable transitively.
   * <p>
   * @param func the starting closure to clean
   * @param checkSerializable whether to verify that the closure is serializable after cleaning
   * @param cleanTransitively whether to clean enclosing closures transitively
   * @param accessedFields a map from a class to a set of its fields that are accessed by
   *                       the starting closure
   */
  private  void clean (java.lang.Object func, boolean checkSerializable, boolean cleanTransitively, scala.collection.mutable.Map<java.lang.Class<?>, scala.collection.mutable.Set<java.lang.String>> accessedFields)  { throw new RuntimeException(); }
  /**
   * Helper method to clean the given closure in place.
   * <p>
   * The mechanism is to traverse the hierarchy of enclosing closures and null out any
   * references along the way that are not actually used by the starting closure, but are
   * nevertheless included in the compiled anonymous classes. Note that it is unsafe to
   * simply mutate the enclosing closures in place, as other code paths may depend on them.
   * Instead, we clone each enclosing closure and set the parent pointers accordingly.
   * <p>
   * By default, closures are cleaned transitively. This means we detect whether enclosing
   * objects are actually referenced by the starting one, either directly or transitively,
   * and, if not, sever these closures from the hierarchy. In other words, in addition to
   * nulling out unused field references, we also null out any parent pointers that refer
   * to enclosing objects not actually needed by the starting closure. We determine
   * transitivity by tracing through the tree of all methods ultimately invoked by the
   * inner closure and record all the fields referenced in the process.
   * <p>
   * For instance, transitive cleaning is necessary in the following scenario:
   * <p>
   *   class SomethingNotSerializable {
   *     def someValue = 1
   *     def scope(name: String)(body: =&gt; Unit) = body
   *     def someMethod(): Unit = scope("one") {
   *       def x = someValue
   *       def y = 2
   *       scope("two") { println(y + 1) }
   *     }
   *   }
   * <p>
   * In this example, scope "two" is not serializable because it references scope "one", which
   * references SomethingNotSerializable. Note that, however, the body of scope "two" does not
   * actually depend on SomethingNotSerializable. This means we can safely null out the parent
   * pointer of a cloned scope "one" and set it the parent of scope "two", such that scope "two"
   * no longer references SomethingNotSerializable transitively.
   * <p>
   * @param func the starting closure to clean
   * @param checkSerializable whether to verify that the closure is serializable after cleaning
   * @param cleanTransitively whether to clean enclosing closures transitively
   * @param accessedFields a map from a class to a set of its fields that are accessed by
   *                       the starting closure
   */
  private  void ensureSerializable (java.lang.Object func)  { throw new RuntimeException(); }
  private  java.lang.Object instantiateClass (java.lang.Class<?> cls, java.lang.Object enclosingObject)  { throw new RuntimeException(); }
}
