package org.apache.spark.shuffle;
/**
 * Create and maintain the shuffle blocks' mapping between logic block and physical file location.
 * Data of shuffle blocks from the same map task are stored in a single consolidated data file.
 * The offsets of the data blocks in the data file are stored in a separate index file.
 * <p>
 * We use the name of the shuffle data's shuffleBlockId with reduce ID set to 0 and add ".data"
 * as the filename postfix for data file, and ".index" as the filename postfix for index file.
 * <p>
 */
  class IndexShuffleBlockResolver implements org.apache.spark.shuffle.ShuffleBlockResolver, org.apache.spark.internal.Logging {
  static public  int NOOP_REDUCE_ID ()  { throw new RuntimeException(); }
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
  public   IndexShuffleBlockResolver (org.apache.spark.SparkConf conf, org.apache.spark.storage.BlockManager _blockManager)  { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockManager blockManager ()  { throw new RuntimeException(); }
  private  org.apache.spark.network.util.TransportConf transportConf ()  { throw new RuntimeException(); }
  public  java.io.File getDataFile (int shuffleId, int mapId)  { throw new RuntimeException(); }
  private  java.io.File getIndexFile (int shuffleId, int mapId)  { throw new RuntimeException(); }
  /**
   * Remove data file and index file that contain the output data from one map.
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * */
  public  void removeDataByMap (int shuffleId, int mapId)  { throw new RuntimeException(); }
  /**
   * Check whether the given index and data files match each other.
   * If so, return the partition lengths in the data file. Otherwise return null.
   * @param index (undocumented)
   * @param data (undocumented)
   * @param blocks (undocumented)
   * @return (undocumented)
   */
  private  long[] checkIndexAndDataFile (java.io.File index, java.io.File data, int blocks)  { throw new RuntimeException(); }
  /**
   * Write an index file with the offsets of each block, plus a final offset at the end for the
   * end of the output file. This will be used by getBlockData to figure out where each block
   * begins and ends.
   * <p>
   * It will commit the data and index file as an atomic operation, use the existing ones, or
   * replace them with new ones.
   * <p>
   * Note: the <code>lengths</code> will be updated to match the existing index file if use the existing ones.
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * @param lengths (undocumented)
   * @param dataTmp (undocumented)
   * */
  public  void writeIndexFileAndCommit (int shuffleId, int mapId, long[] lengths, java.io.File dataTmp)  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer getBlockData (org.apache.spark.storage.ShuffleBlockId blockId)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
