package org.apache.spark.serializer;
public  class SerializationDebugger$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SerializationDebugger$ MODULE$ = null;
  public   SerializationDebugger$ ()  { throw new RuntimeException(); }
  /**
   * Improve the given NotSerializableException with the serialization path leading from the given
   * object to the problematic object. This is turned off automatically if
   * <code>sun.io.serialization.extendedDebugInfo</code> flag is turned on for the JVM.
   * @param obj (undocumented)
   * @param e (undocumented)
   * @return (undocumented)
   */
  public  java.io.NotSerializableException improveException (Object obj, java.io.NotSerializableException e)  { throw new RuntimeException(); }
  /**
   * Find the path leading to a not serializable object. This method is modeled after OpenJDK's
   * serialization mechanism, and handles the following cases:
   * <p>
   *  - primitives
   *  - arrays of primitives
   *  - arrays of non-primitive objects
   *  - Serializable objects
   *  - Externalizable objects
   *  - writeReplace
   * <p>
   * It does not yet handle writeObject override, but that shouldn't be too hard to do either.
   * @param obj (undocumented)
   * @return (undocumented)
   */
    scala.collection.immutable.List<java.lang.String> find (Object obj)  { throw new RuntimeException(); }
    boolean enableDebugging ()  { throw new RuntimeException(); }
  /**
   * Find the object to serialize and the associated {@link ObjectStreamClass}. This method handles
   * writeReplace in Serializable. It starts with the object itself, and keeps calling the
   * writeReplace method until there is no more.
   * @param o (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<java.lang.Object, java.io.ObjectStreamClass> findObjectAndDescriptor (java.lang.Object o)  { throw new RuntimeException(); }
  /**
   * Object to hold all the reflection objects. If we run on a JVM that we cannot understand,
   * this field will be null and this the debug helper should be disabled.
   * @return (undocumented)
   */
  private  org.apache.spark.serializer.SerializationDebugger.ObjectStreamClassReflection reflect ()  { throw new RuntimeException(); }
}
