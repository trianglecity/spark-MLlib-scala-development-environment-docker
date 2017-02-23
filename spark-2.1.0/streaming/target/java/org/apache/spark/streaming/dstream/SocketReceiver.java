package org.apache.spark.streaming.dstream;
  class SocketReceiver<T extends java.lang.Object> extends org.apache.spark.streaming.receiver.Receiver<T> implements org.apache.spark.internal.Logging {
  /**
   * This methods translates the data from an inputstream (say, from a socket)
   * to '\n' delimited strings and returns an iterator to access the strings.
   * @param inputStream (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Iterator<java.lang.String> bytesToLines (java.io.InputStream inputStream)  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> preferredLocation ()  { throw new RuntimeException(); }
  static public  void store (T dataItem)  { throw new RuntimeException(); }
  static public  void store (scala.collection.mutable.ArrayBuffer<T> dataBuffer)  { throw new RuntimeException(); }
  static public  void store (scala.collection.mutable.ArrayBuffer<T> dataBuffer, Object metadata)  { throw new RuntimeException(); }
  static public  void store (scala.collection.Iterator<T> dataIterator)  { throw new RuntimeException(); }
  static public  void store (java.util.Iterator<T> dataIterator, Object metadata)  { throw new RuntimeException(); }
  static public  void store (java.util.Iterator<T> dataIterator)  { throw new RuntimeException(); }
  static public  void store (scala.collection.Iterator<T> dataIterator, Object metadata)  { throw new RuntimeException(); }
  static public  void store (java.nio.ByteBuffer bytes)  { throw new RuntimeException(); }
  static public  void store (java.nio.ByteBuffer bytes, Object metadata)  { throw new RuntimeException(); }
  static public  void reportError (java.lang.String message, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static public  void restart (java.lang.String message)  { throw new RuntimeException(); }
  static public  void restart (java.lang.String message, java.lang.Throwable error)  { throw new RuntimeException(); }
  static public  void restart (java.lang.String message, java.lang.Throwable error, int millisecond)  { throw new RuntimeException(); }
  static public  void stop (java.lang.String message)  { throw new RuntimeException(); }
  static public  void stop (java.lang.String message, java.lang.Throwable error)  { throw new RuntimeException(); }
  static public  boolean isStarted ()  { throw new RuntimeException(); }
  static public  boolean isStopped ()  { throw new RuntimeException(); }
  static public  int streamId ()  { throw new RuntimeException(); }
  static   void setReceiverId (int _id)  { throw new RuntimeException(); }
  static   void attachSupervisor (org.apache.spark.streaming.receiver.ReceiverSupervisor exec)  { throw new RuntimeException(); }
  static   org.apache.spark.streaming.receiver.ReceiverSupervisor supervisor ()  { throw new RuntimeException(); }
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
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   SocketReceiver (java.lang.String host, int port, scala.Function1<java.io.InputStream, scala.collection.Iterator<T>> bytesToObjects, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  private  java.net.Socket socket ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  /** Create a socket connection and receive data until receiver is stopped */
  public  void receive ()  { throw new RuntimeException(); }
}
