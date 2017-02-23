package org.apache.spark.streaming.util;
public  class FileBasedWriteAheadLog$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FileBasedWriteAheadLog$ MODULE$ = null;
  public   FileBasedWriteAheadLog$ ()  { throw new RuntimeException(); }
  public  scala.util.matching.Regex logFileRegex ()  { throw new RuntimeException(); }
  public  java.lang.String timeToLogFile (long startTime, long stopTime)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> getCallerName ()  { throw new RuntimeException(); }
  /** Convert a sequence of files to a sequence of sorted LogInfo objects */
  public  scala.collection.Seq<org.apache.spark.streaming.util.FileBasedWriteAheadLog.LogInfo> logFilesTologInfo (scala.collection.Seq<org.apache.hadoop.fs.Path> files)  { throw new RuntimeException(); }
  /**
   * This creates an iterator from a parallel collection, by keeping at most <code>n</code> objects in memory
   * at any given time, where <code>n</code> is at most the max of the size of the thread pool or 8. This is
   * crucial for use cases where we create <code>FileBasedWriteAheadLogReader</code>s during parallel recovery.
   * We don't want to open up <code>k</code> streams altogether where <code>k</code> is the size of the Seq that we want
   * to parallelize.
   * @param executionContext (undocumented)
   * @param source (undocumented)
   * @param handler (undocumented)
   * @return (undocumented)
   */
  public <I extends java.lang.Object, O extends java.lang.Object> scala.collection.Iterator<O> seqToParIterator (scala.concurrent.ExecutionContext executionContext, scala.collection.Seq<I> source, scala.Function1<I, scala.collection.Iterator<O>> handler)  { throw new RuntimeException(); }
}
