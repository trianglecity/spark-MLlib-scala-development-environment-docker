package org.apache.spark.serializer;
/**
 * A Spark serializer that uses the <a href="https://code.google.com/p/kryo/">
 * Kryo serialization library</a>.
 * <p>
 * @note This serializer is not guaranteed to be wire-compatible across different versions of
 * Spark. It is intended to be used to serialize/de-serialize data within a single
 * Spark application.
 */
public  class KryoSerializer extends org.apache.spark.serializer.Serializer implements org.apache.spark.internal.Logging, java.io.Serializable {
  static private  scala.collection.Seq<java.lang.Class<?>> toRegister ()  { throw new RuntimeException(); }
  static private  scala.collection.immutable.Map<java.lang.Class<?>, com.esotericsoftware.kryo.Serializer<?>> toRegisterSerializer ()  { throw new RuntimeException(); }
  static protected  scala.Option<java.lang.ClassLoader> defaultClassLoader ()  { throw new RuntimeException(); }
  static protected  void defaultClassLoader_$eq (scala.Option<java.lang.ClassLoader> x$1)  { throw new RuntimeException(); }
  static public  org.apache.spark.serializer.Serializer setDefaultClassLoader (java.lang.ClassLoader classLoader)  { throw new RuntimeException(); }
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
  public   KryoSerializer (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  long bufferSizeKb ()  { throw new RuntimeException(); }
  private  int bufferSize ()  { throw new RuntimeException(); }
  public  int maxBufferSizeMb ()  { throw new RuntimeException(); }
  private  int maxBufferSize ()  { throw new RuntimeException(); }
  private  boolean referenceTracking ()  { throw new RuntimeException(); }
  private  boolean registrationRequired ()  { throw new RuntimeException(); }
  private  java.lang.String[] userRegistrators ()  { throw new RuntimeException(); }
  private  java.lang.String[] classesToRegister ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.Object, java.lang.String> avroSchemas ()  { throw new RuntimeException(); }
  private  boolean useUnsafe ()  { throw new RuntimeException(); }
  public  com.esotericsoftware.kryo.io.Output newKryoOutput ()  { throw new RuntimeException(); }
  public  com.esotericsoftware.kryo.Kryo newKryo ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerInstance newInstance ()  { throw new RuntimeException(); }
    boolean supportsRelocationOfSerializedObjects ()  { throw new RuntimeException(); }
}
