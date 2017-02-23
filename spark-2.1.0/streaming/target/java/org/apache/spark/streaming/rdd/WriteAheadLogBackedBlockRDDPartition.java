package org.apache.spark.streaming.rdd;
/**
 * Partition class for {@link org.apache.spark.streaming.rdd.WriteAheadLogBackedBlockRDD}.
 * It contains information about the id of the blocks having this partition's data and
 * the corresponding record handle in the write ahead log that backs the partition.
 * <p>
 * param:  index index of the partition
 * param:  blockId id of the block having the partition data
 * param:  isBlockIdValid Whether the block Ids are valid (i.e., the blocks are present in the Spark
 *                         executors). If not, then block lookups by the block ids will be skipped.
 *                         By default, this is an empty array signifying true for all the blocks.
 * param:  walRecordHandle Handle of the record in a write ahead log having the partition data
 */
  class WriteAheadLogBackedBlockRDDPartition implements org.apache.spark.Partition {
  public  int index ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
  public  boolean isBlockIdValid ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.util.WriteAheadLogRecordHandle walRecordHandle ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteAheadLogBackedBlockRDDPartition (int index, org.apache.spark.storage.BlockId blockId, boolean isBlockIdValid, org.apache.spark.streaming.util.WriteAheadLogRecordHandle walRecordHandle)  { throw new RuntimeException(); }
}
