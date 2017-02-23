package org.apache.spark;
/**
 * A class for recovering from exceptions when deserializing a Throwable that was
 * thrown in user task code. If the Throwable cannot be deserialized it will be null,
 * but the stacktrace and message will be preserved correctly in SparkException.
 */
  class ThrowableSerializationWrapper implements scala.Serializable, org.apache.spark.internal.Logging {
  public  java.lang.Throwable exception ()  { throw new RuntimeException(); }
  // not preceding
  public   ThrowableSerializationWrapper (java.lang.Throwable exception)  { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream out)  { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream in)  { throw new RuntimeException(); }
}
