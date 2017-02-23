package org.apache.spark.storage;
public  class RandomBlockReplicationPolicy implements org.apache.spark.storage.BlockReplicationPolicy, org.apache.spark.internal.Logging {
  public   RandomBlockReplicationPolicy ()  { throw new RuntimeException(); }
  /**
   * Method to prioritize a bunch of candidate peers of a block. This is a basic implementation,
   * that just makes sure we put blocks on different hosts, if possible
   * <p>
   * @param blockManagerId Id of the current BlockManager for self identification
   * @param peers A list of peers of a BlockManager
   * @param peersReplicatedTo Set of peers already replicated to
   * @param blockId BlockId of the block being replicated. This can be used as a source of
   *                randomness if needed.
   * @return A prioritized list of peers. Lower the index of a peer, higher its priority
   * @param numReplicas (undocumented)
   */
  public  scala.collection.immutable.List<org.apache.spark.storage.BlockManagerId> prioritize (org.apache.spark.storage.BlockManagerId blockManagerId, scala.collection.Seq<org.apache.spark.storage.BlockManagerId> peers, scala.collection.mutable.HashSet<org.apache.spark.storage.BlockManagerId> peersReplicatedTo, org.apache.spark.storage.BlockId blockId, int numReplicas)  { throw new RuntimeException(); }
  /**
   * Uses sampling algorithm by Robert Floyd. Finds a random sample in O(n) while
   * minimizing space usage. Please see <a href="http://math.stackexchange.com/questions/178690/whats-the-proof-of-correctness-for-robert-floyds-algorithm-for-selecting-a-sin">
   * here</a>.
   * <p>
   * @param n total number of indices
   * @param m number of samples needed
   * @param r random number generator
   * @return list of m random unique indices
   */
  private  scala.collection.immutable.List<java.lang.Object> getSampleIds (int n, int m, scala.util.Random r)  { throw new RuntimeException(); }
}
