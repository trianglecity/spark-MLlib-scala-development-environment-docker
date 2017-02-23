package org.apache.spark.streaming.dstream;
public  class SocketReceiver$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SocketReceiver$ MODULE$ = null;
  public   SocketReceiver$ ()  { throw new RuntimeException(); }
  /**
   * This methods translates the data from an inputstream (say, from a socket)
   * to '\n' delimited strings and returns an iterator to access the strings.
   * @param inputStream (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<java.lang.String> bytesToLines (java.io.InputStream inputStream)  { throw new RuntimeException(); }
}
