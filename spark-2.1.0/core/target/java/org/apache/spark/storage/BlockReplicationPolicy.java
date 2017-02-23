package org.apache.spark.storage;
/**
 * ::DeveloperApi::
 * BlockReplicationPrioritization provides logic for prioritizing a sequence of peers for
 * replicating blocks. BlockManager will replicate to each peer returned in order until the
 * desired replication order is reached. If a replication fails, prioritize() will be called
 * again to get a fresh prioritization.
 */
public  interface BlockReplicationPolicy {
  /**
   * Method to prioritize a bunch of candidate peers of a block
   * <p>
   * @param blockManagerId Id of the current BlockManager for self identification
   * @param peers A list of peers of a BlockManager
   * @param peersReplicatedTo Set of peers already replicated to
   * @param blockId BlockId of the block being replicated. This can be used as a source of
   *                randomness if needed.
   * @param numReplicas Number of peers we need to replicate to
   * @return A prioritized list of peers. Lower the index of a peer, higher its priority.
   *         This returns a list of size at most <code>numPeersToReplicateTo</code>.
   */
  public  scala.collection.immutable.List<org.apache.spark.storage.BlockManagerId> prioritize (org.apache.spark.storage.BlockManagerId blockManagerId, scala.collection.Seq<org.apache.spark.storage.BlockManagerId> peers, scala.collection.mutable.HashSet<org.apache.spark.storage.BlockManagerId> peersReplicatedTo, org.apache.spark.storage.BlockId blockId, int numReplicas)  ;
}
