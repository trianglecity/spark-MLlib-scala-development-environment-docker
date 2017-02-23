package org.apache.spark.serializer;
public  class SerializationDebugger {
  /** An implicit class that allows us to call private methods of ObjectStreamClass. */
  static public  class ObjectStreamClassMethods extends scala.AnyVal {
    public  java.io.ObjectStreamClass desc ()  { throw new RuntimeException(); }
    // not preceding
    public   ObjectStreamClassMethods (java.io.ObjectStreamClass desc)  { throw new RuntimeException(); }
    public  java.io.ObjectStreamClass[] getSlotDescs ()  { throw new RuntimeException(); }
    public  boolean hasWriteObjectMethod ()  { throw new RuntimeException(); }
    public  boolean hasWriteReplaceMethod ()  { throw new RuntimeException(); }
    public  java.lang.Object invokeWriteReplace (java.lang.Object obj)  { throw new RuntimeException(); }
    public  int getNumObjFields ()  { throw new RuntimeException(); }
    public  void getObjFieldValues (java.lang.Object obj, java.lang.Object[] out)  { throw new RuntimeException(); }
  }
  static public  class ObjectStreamClassMethods$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ObjectStreamClassMethods$ MODULE$ = null;
    public   ObjectStreamClassMethods$ ()  { throw new RuntimeException(); }
  }
  static private  class SerializationDebugger {
    public   SerializationDebugger ()  { throw new RuntimeException(); }
    /** A set to track the list of objects we have visited, to avoid cycles in the graph. */
    private  scala.collection.mutable.HashSet<java.lang.Object> visited ()  { throw new RuntimeException(); }
    /**
     * Visit the object and its fields and stop when we find an object that is not serializable.
     * Return the path as a list. If everything can be serialized, return an empty list.
     * @param o (undocumented)
     * @param stack (undocumented)
     * @return (undocumented)
     */
    public  scala.collection.immutable.List<java.lang.String> visit (Object o, scala.collection.immutable.List<java.lang.String> stack)  { throw new RuntimeException(); }
    private  scala.collection.immutable.List<java.lang.String> visitArray (java.lang.Object o, scala.collection.immutable.List<java.lang.String> stack)  { throw new RuntimeException(); }
    /**
     * Visit an externalizable object.
     * Since writeExternal() can choose to add arbitrary objects at the time of serialization,
     * the only way to capture all the objects it will serialize is by using a
     * dummy ObjectOutput that collects all the relevant objects for further testing.
     * @param o (undocumented)
     * @param stack (undocumented)
     * @return (undocumented)
     */
    private  scala.collection.immutable.List<java.lang.String> visitExternalizable (java.io.Externalizable o, scala.collection.immutable.List<java.lang.String> stack)  { throw new RuntimeException(); }
    private  scala.collection.immutable.List<java.lang.String> visitSerializable (java.lang.Object o, scala.collection.immutable.List<java.lang.String> stack)  { throw new RuntimeException(); }
    /**
     * Visit a serializable object which has the writeObject() defined.
     * Since writeObject() can choose to add arbitrary objects at the time of serialization,
     * the only way to capture all the objects it will serialize is by using a
     * dummy ObjectOutputStream that collects all the relevant fields for further testing.
     * This is similar to how externalizable objects are visited.
     * @param o (undocumented)
     * @param stack (undocumented)
     * @return (undocumented)
     */
    private  scala.collection.immutable.List<java.lang.String> visitSerializableWithWriteObjectMethod (java.lang.Object o, scala.collection.immutable.List<java.lang.String> stack)  { throw new RuntimeException(); }
  }
  /**
   * A dummy {@link ObjectOutput} that simply saves the list of objects written by a writeExternal
   * call, and returns them through <code>outputArray</code>.
   */
  static private  class ListObjectOutput implements java.io.ObjectOutput {
    public   ListObjectOutput ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuffer<java.lang.Object> output ()  { throw new RuntimeException(); }
    public  java.lang.Object[] outputArray ()  { throw new RuntimeException(); }
    public  void writeObject (Object o)  { throw new RuntimeException(); }
    public  void flush ()  { throw new RuntimeException(); }
    public  void write (int i)  { throw new RuntimeException(); }
    public  void write (byte[] bytes)  { throw new RuntimeException(); }
    public  void write (byte[] bytes, int i, int i1)  { throw new RuntimeException(); }
    public  void close ()  { throw new RuntimeException(); }
    public  void writeFloat (float v)  { throw new RuntimeException(); }
    public  void writeChars (java.lang.String s)  { throw new RuntimeException(); }
    public  void writeDouble (double v)  { throw new RuntimeException(); }
    public  void writeUTF (java.lang.String s)  { throw new RuntimeException(); }
    public  void writeShort (int i)  { throw new RuntimeException(); }
    public  void writeInt (int i)  { throw new RuntimeException(); }
    public  void writeBoolean (boolean b)  { throw new RuntimeException(); }
    public  void writeBytes (java.lang.String s)  { throw new RuntimeException(); }
    public  void writeChar (int i)  { throw new RuntimeException(); }
    public  void writeLong (long l)  { throw new RuntimeException(); }
    public  void writeByte (int i)  { throw new RuntimeException(); }
  }
  /** An output stream that emulates /dev/null */
  static private  class NullOutputStream extends java.io.OutputStream {
    public   NullOutputStream ()  { throw new RuntimeException(); }
    public  void write (int b)  { throw new RuntimeException(); }
  }
  /**
   * A dummy {@link ObjectOutputStream} that saves the list of objects written to it and returns
   * them through <code>outputArray</code>. This works by using the {@link ObjectOutputStream}'s <code>replaceObject()</code>
   * method which gets called on every object, only if replacing is enabled. So this subclass
   * of {@link ObjectOutputStream} enabled replacing, and uses replaceObject to get the objects that
   * are being serializabled. The serialized bytes are ignored by sending them to a
   * {@link NullOutputStream}, which acts like a /dev/null.
   */
  static private  class ListObjectOutputStream extends java.io.ObjectOutputStream {
    public   ListObjectOutputStream ()  { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuffer<java.lang.Object> output ()  { throw new RuntimeException(); }
    public  java.lang.Object[] outputArray ()  { throw new RuntimeException(); }
    public  java.lang.Object replaceObject (java.lang.Object obj)  { throw new RuntimeException(); }
  }
  static private  class ObjectStreamClassReflection {
    public   ObjectStreamClassReflection ()  { throw new RuntimeException(); }
    /** ObjectStreamClass.getClassDataLayout */
    public  java.lang.reflect.Method GetClassDataLayout ()  { throw new RuntimeException(); }
    /** ObjectStreamClass.hasWriteObjectMethod */
    public  java.lang.reflect.Method HasWriteObjectMethod ()  { throw new RuntimeException(); }
    /** ObjectStreamClass.hasWriteReplaceMethod */
    public  java.lang.reflect.Method HasWriteReplaceMethod ()  { throw new RuntimeException(); }
    /** ObjectStreamClass.invokeWriteReplace */
    public  java.lang.reflect.Method InvokeWriteReplace ()  { throw new RuntimeException(); }
    /** ObjectStreamClass.getNumObjFields */
    public  java.lang.reflect.Method GetNumObjFields ()  { throw new RuntimeException(); }
    /** ObjectStreamClass.getObjFieldValues */
    public  java.lang.reflect.Method GetObjFieldValues ()  { throw new RuntimeException(); }
    /** ObjectStreamClass$ClassDataSlot.desc field */
    public  java.lang.reflect.Field DescField ()  { throw new RuntimeException(); }
  }
  /**
   * Improve the given NotSerializableException with the serialization path leading from the given
   * object to the problematic object. This is turned off automatically if
   * <code>sun.io.serialization.extendedDebugInfo</code> flag is turned on for the JVM.
   * @param obj (undocumented)
   * @param e (undocumented)
   * @return (undocumented)
   */
  static public  java.io.NotSerializableException improveException (Object obj, java.io.NotSerializableException e)  { throw new RuntimeException(); }
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
  static   scala.collection.immutable.List<java.lang.String> find (Object obj)  { throw new RuntimeException(); }
  static   boolean enableDebugging ()  { throw new RuntimeException(); }
  /**
   * Find the object to serialize and the associated {@link ObjectStreamClass}. This method handles
   * writeReplace in Serializable. It starts with the object itself, and keeps calling the
   * writeReplace method until there is no more.
   * @param o (undocumented)
   * @return (undocumented)
   */
  static private  scala.Tuple2<java.lang.Object, java.io.ObjectStreamClass> findObjectAndDescriptor (java.lang.Object o)  { throw new RuntimeException(); }
  /**
   * Object to hold all the reflection objects. If we run on a JVM that we cannot understand,
   * this field will be null and this the debug helper should be disabled.
   * @return (undocumented)
   */
  static private  org.apache.spark.serializer.SerializationDebugger.ObjectStreamClassReflection reflect ()  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
}
