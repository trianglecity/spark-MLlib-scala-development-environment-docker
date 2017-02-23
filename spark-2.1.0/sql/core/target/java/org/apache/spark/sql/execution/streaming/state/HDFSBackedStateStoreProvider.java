package org.apache.spark.sql.execution.streaming.state;
/**
 * An implementation of {@link StateStoreProvider} and {@link StateStore} in which all the data is backed
 * by files in a HDFS-compatible file system. All updates to the store has to be done in sets
 * transactionally, and each set of updates increments the store's version. These versions can
 * be used to re-execute the updates (by retries in RDD operations) on the correct version of
 * the store, and regenerate the store version.
 * <p>
 * Usage:
 * To update the data in the state store, the following order of operations are needed.
 * <p>
 * // get the right store
 * - val store = StateStore.get(
 *      StateStoreId(checkpointLocation, operatorId, partitionId), ..., version, ...)
 * - store.put(...)
 * - store.remove(...)
 * - store.commit()    // commits all the updates to made; the new version will be returned
 * - store.iterator()  // key-value data after last commit as an iterator
 * - store.updates()   // updates made in the last commit as an iterator
 * <p>
 * Fault-tolerance model:
 * - Every set of updates is written to a delta file before committing.
 * - The state store is responsible for managing, collapsing and cleaning up of delta files.
 * - Multiple attempts to commit the same version of updates may overwrite each other.
 *   Consistency guarantees depend on whether multiple attempts have the same updates and
 *   the overwrite semantics of underlying file system.
 * - Background maintenance of files ensures that last versions of the store is always recoverable
 * to ensure re-executed RDD operations re-apply updates on the correct past version of the
 * store.
 */
  class HDFSBackedStateStoreProvider implements org.apache.spark.sql.execution.streaming.state.StateStoreProvider, org.apache.spark.internal.Logging {
  public  org.apache.spark.sql.execution.streaming.state.StateStoreId id ()  { throw new RuntimeException(); }
  // not preceding
  public   HDFSBackedStateStoreProvider (org.apache.spark.sql.execution.streaming.state.StateStoreId id, org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /** Implementation of {@link StateStore} API which is backed by a HDFS-compatible file system */
  public  class HDFSBackedStateStore implements org.apache.spark.sql.execution.streaming.state.StateStore {
    public  long version ()  { throw new RuntimeException(); }
    // not preceding
    public   HDFSBackedStateStore (long version, java.util.HashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> mapToUpdate)  { throw new RuntimeException(); }
    /** Trait and classes representing the internal state of the store */
    public  interface STATE {
    }
    public  class UPDATING implements org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.STATE, scala.Product, scala.Serializable {
      public   UPDATING ()  { throw new RuntimeException(); }
    }
    public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.UPDATING$ UPDATING ()  { throw new RuntimeException(); }
    public  class COMMITTED implements org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.STATE, scala.Product, scala.Serializable {
      public   COMMITTED ()  { throw new RuntimeException(); }
    }
    public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.COMMITTED$ COMMITTED ()  { throw new RuntimeException(); }
    public  class ABORTED implements org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.STATE, scala.Product, scala.Serializable {
      public   ABORTED ()  { throw new RuntimeException(); }
    }
    public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.ABORTED$ ABORTED ()  { throw new RuntimeException(); }
    private  long newVersion ()  { throw new RuntimeException(); }
    private  org.apache.hadoop.fs.Path tempDeltaFile ()  { throw new RuntimeException(); }
    private  java.io.DataOutputStream tempDeltaFileStream ()  { throw new RuntimeException(); }
    private  java.util.HashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.execution.streaming.state.StoreUpdate> allUpdates ()  { throw new RuntimeException(); }
    private  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.STATE state ()  { throw new RuntimeException(); }
    private  org.apache.hadoop.fs.Path finalDeltaFile ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.StateStoreId id ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.catalyst.expressions.UnsafeRow> get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
    public  void put (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
    /** Remove keys that match the following condition */
    public  void remove (scala.Function1<org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object> condition)  { throw new RuntimeException(); }
    /** Commit all the updates that have been made to the store, and return the new version. */
    public  long commit ()  { throw new RuntimeException(); }
    /** Abort all the updates made on this store. This store will not be usable any more. */
    public  void abort ()  { throw new RuntimeException(); }
    /**
     * Get an iterator of all the store data.
     * This can be called only after committing all the updates made in the current thread.
     * @return (undocumented)
     */
    public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> iterator ()  { throw new RuntimeException(); }
    /**
     * Get an iterator of all the updates made to the store in the current version.
     * This can be called only after committing all the updates made in the current thread.
     * @return (undocumented)
     */
    public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.StoreUpdate> updates ()  { throw new RuntimeException(); }
    public  long numKeys ()  { throw new RuntimeException(); }
    /**
     * Whether all updates have been committed
     * @return (undocumented)
     */
      boolean hasCommitted ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  /** Get the state store for making updates to create a new `version` of the store. */
  public  org.apache.spark.sql.execution.streaming.state.StateStore getStore (long version)  { throw new RuntimeException(); }
  /** Do maintenance backing data files, including creating snapshots and cleaning up old files */
  public  void doMaintenance ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, java.util.HashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> loadedMaps ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path baseDir ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  private  class StoreFile implements scala.Product, scala.Serializable {
    public  long version ()  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.Path path ()  { throw new RuntimeException(); }
    public  boolean isSnapshot ()  { throw new RuntimeException(); }
    // not preceding
    public   StoreFile (long version, org.apache.hadoop.fs.Path path, boolean isSnapshot)  { throw new RuntimeException(); }
  }
  private  class StoreFile extends scala.runtime.AbstractFunction3<java.lang.Object, org.apache.hadoop.fs.Path, java.lang.Object, org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.StoreFile> implements scala.Serializable {
    public   StoreFile ()  { throw new RuntimeException(); }
  }
  /** Commit a set of updates to the store with the given new version */
  private  org.apache.hadoop.fs.Path commitUpdates (long newVersion, java.util.HashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> map, org.apache.hadoop.fs.Path tempDeltaFile)  { throw new RuntimeException(); }
  /**
   * Get iterator of all the data of the latest version of the store.
   * Note that this will look up the files to determined the latest known version.
   * @return (undocumented)
   */
    scala.collection.Iterator<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> latestIterator ()  { throw new RuntimeException(); }
  /** Get iterator of a specific version of the store */
    scala.collection.Iterator<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> iterator (long version)  { throw new RuntimeException(); }
  /** Initialize the store provider */
  private  void initialize ()  { throw new RuntimeException(); }
  /** Load the required version of the map data from the backing files */
  private  java.util.HashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> loadMap (long version)  { throw new RuntimeException(); }
  private  void writeToDeltaFile (java.io.DataOutputStream output, org.apache.spark.sql.execution.streaming.state.StoreUpdate update)  { throw new RuntimeException(); }
  private  void finalizeDeltaFile (java.io.DataOutputStream output)  { throw new RuntimeException(); }
  private  void updateFromDeltaFile (long version, java.util.HashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> map)  { throw new RuntimeException(); }
  private  void writeSnapshotFile (long version, java.util.HashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> map)  { throw new RuntimeException(); }
  private  scala.Option<java.util.HashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> readSnapshotFile (long version)  { throw new RuntimeException(); }
  /** Perform a snapshot of the store to allow delta files to be consolidated */
  private  void doSnapshot ()  { throw new RuntimeException(); }
  /**
   * Clean up old snapshots and delta files that are not needed any more. It ensures that last
   * few versions of the store can be recovered from the files, so re-executed RDD operations
   * can re-apply updates on the past versions of the store.
   */
    void cleanup ()  { throw new RuntimeException(); }
  /** Files needed to recover the given version of the store */
  private  scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.StoreFile> filesForVersion (scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.StoreFile> allFiles, long version)  { throw new RuntimeException(); }
  /** Fetch all the files that back the store */
  private  scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.StoreFile> fetchFiles ()  { throw new RuntimeException(); }
  private  java.io.DataOutputStream compressStream (java.io.DataOutputStream outputStream)  { throw new RuntimeException(); }
  private  java.io.DataInputStream decompressStream (java.io.DataInputStream inputStream)  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path deltaFile (long version)  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path snapshotFile (long version)  { throw new RuntimeException(); }
  private  void verify (scala.Function0<java.lang.Object> condition, java.lang.String msg)  { throw new RuntimeException(); }
}
