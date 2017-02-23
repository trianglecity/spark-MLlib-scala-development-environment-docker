package org.apache.spark.graphx.util;
/**
 * Includes an utility function to test whether a function accesses a specific attribute
 * of an object.
 */
public  class BytecodeUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BytecodeUtils$ MODULE$ = null;
  public   BytecodeUtils$ ()  { throw new RuntimeException(); }
  /**
   * Test whether the given closure invokes the specified method in the specified class.
   * @param closure (undocumented)
   * @param targetClass (undocumented)
   * @param targetMethod (undocumented)
   * @return (undocumented)
   */
  public  boolean invokedMethod (java.lang.Object closure, java.lang.Class<?> targetClass, java.lang.String targetMethod)  { throw new RuntimeException(); }
  private  boolean _invokedMethod (java.lang.Class<?> cls, java.lang.String method, java.lang.Class<?> targetClass, java.lang.String targetMethod)  { throw new RuntimeException(); }
  /**
   * Get an ASM class reader for a given class from the JAR that loaded it.
   * @param cls (undocumented)
   * @return (undocumented)
   */
  private  org.apache.xbean.asm5.ClassReader getClassReader (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  /**
   * Given the class name, return whether we should look into the class or not. This is used to
   * skip examining a large quantity of Java or Scala classes that we know for sure wouldn't access
   * the closures. Note that the class name is expected in ASM style (i.e. use "/" instead of ".").
   * @param className (undocumented)
   * @return (undocumented)
   */
  private  boolean skipClass (java.lang.String className)  { throw new RuntimeException(); }
}
