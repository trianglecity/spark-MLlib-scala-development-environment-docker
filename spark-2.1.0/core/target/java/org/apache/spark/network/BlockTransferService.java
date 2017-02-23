package org.apache.spark.network;
 abstract class BlockTransferService extends org.apache.spark.network.shuffle.ShuffleClient implements java.io.Closeable, org.apache.spark.internal.Logging {
  public   BlockTransferService ()  { throw new RuntimeException(); }
  /**
   * Initialize the transfer service by giving it the BlockDataManager that can be used to fetch
   * local blocks or put local blocks.
   * @param blockDataManager (undocumented)
   */
  public abstract  void init (org.apache.spark.network.BlockDataManager blockDataManager)  ;
  /**
   * Tear down the transfer service.
   */
  public abstract  void close ()  ;
  /**
   * Port number the service is listening on, available only after {@link init} is invoked.
   * @return (undocumented)
   */
  public abstract  int port ()  ;
  /**
   * Host name the service is listening on, available only after {@link init} is invoked.
   * @return (undocumented)
   */
  public abstract  java.lang.String hostName ()  ;
  /**
   * Fetch a sequence of blocks from a remote node asynchronously,
   * available only after {@link init} is invoked.
   * <p>
   * Note that this API takes a sequence so the implementation can batch requests, and does not
   * return a future so the underlying implementation can invoke onBlockFetchSuccess as soon as
   * the data of a block is fetched, rather than waiting for all blocks to be fetched.
   * @param host (undocumented)
   * @param port (undocumented)
   * @param execId (undocumented)
   * @param blockIds (undocumented)
   * @param listener (undocumented)
   */
  public abstract  void fetchBlocks (java.lang.String host, int port, java.lang.String execId, java.lang.String[] blockIds, org.apache.spark.network.shuffle.BlockFetchingListener listener)  ;
  /**
   * Upload a single block to a remote node, available only after {@link init} is invoked.
   * @param hostname (undocumented)
   * @param port (undocumented)
   * @param execId (undocumented)
   * @param blockId (undocumented)
   * @param blockData (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   * @return (undocumented)
   */
  public abstract  scala.concurrent.Future<scala.runtime.BoxedUnit> uploadBlock (java.lang.String hostname, int port, java.lang.String execId, org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer blockData, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag)  ;
  /**
   * A special case of {@link fetchBlocks}, as it fetches only one block and is blocking.
   * <p>
   * It is also only available after {@link init} is invoked.
   * @param host (undocumented)
   * @param port (undocumented)
   * @param execId (undocumented)
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer fetchBlockSync (java.lang.String host, int port, java.lang.String execId, java.lang.String blockId)  { throw new RuntimeException(); }
  /**
   * Upload a single block to a remote node, available only after {@link init} is invoked.
   * <p>
   * This method is similar to {@link uploadBlock}, except this one blocks the thread
   * until the upload finishes.
   * @param hostname (undocumented)
   * @param port (undocumented)
   * @param execId (undocumented)
   * @param blockId (undocumented)
   * @param blockData (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   */
  public  void uploadBlockSync (java.lang.String hostname, int port, java.lang.String execId, org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer blockData, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag)  { throw new RuntimeException(); }
}
