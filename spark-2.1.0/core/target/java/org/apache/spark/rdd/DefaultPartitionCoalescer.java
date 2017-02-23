package org.apache.spark.rdd;
/**
 * Coalesce the partitions of a parent RDD (<code>prev</code>) into fewer partitions, so that each partition of
 * this RDD computes one or more of the parent ones. It will produce exactly <code>maxPartitions</code> if the
 * parent had more than maxPartitions, or fewer if the parent had fewer.
 * <p>
 * This transformation is useful when an RDD with many partitions gets filtered into a smaller one,
 * or to avoid having a large number of small tasks when processing a directory with many files.
 * <p>
 * If there is no locality information (no preferredLocations) in the parent, then the coalescing
 * is very simple: chunk parents that are close in the Array in chunks.
 * If there is locality information, it proceeds to pack them with the following four goals:
 * <p>
 * (1) Balance the groups so they roughly have the same number of parent partitions
 * (2) Achieve locality per partition, i.e. find one machine which most parent partitions prefer
 * (3) Be efficient, i.e. O(n) algorithm for n parent partitions (problem is likely NP-hard)
 * (4) Balance preferred machines, i.e. avoid as much as possible picking the same preferred machine
 * <p>
 * Furthermore, it is assumed that the parent RDD may have many partitions, e.g. 100 000.
 * We assume the final number of desired partitions is small, e.g. less than 1000.
 * <p>
 * The algorithm tries to assign unique preferred machines to each partition. If the number of
 * desired partitions is greater than the number of preferred machines (can happen), it needs to
 * start picking duplicate preferred machines. This is determined using coupon collector estimation
 * (2n log(n)). The load balancing is done using power-of-two randomized bins-balls with one twist:
 * it tries to also achieve locality. This is done by allowing a slack (balanceSlack, where
 * 1.0 is all locality, 0 is all balance) between two bins. If two bins are within the slack
 * in terms of balance, the algorithm will assign partitions according to locality.
 * (contact alig for questions)
 */
public  class DefaultPartitionCoalescer implements org.apache.spark.rdd.PartitionCoalescer {
  public  class PartitionLocations {
    public   PartitionLocations (org.apache.spark.rdd.RDD<?> prev)  { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<org.apache.spark.Partition> partsWithoutLocs ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<scala.Tuple2<java.lang.String, org.apache.spark.Partition>> partsWithLocs ()  { throw new RuntimeException(); }
    public  void getAllPrefLocs (org.apache.spark.rdd.RDD<?> prev)  { throw new RuntimeException(); }
  }
  public  double balanceSlack ()  { throw new RuntimeException(); }
  // not preceding
  public   DefaultPartitionCoalescer (double balanceSlack)  { throw new RuntimeException(); }
  public  boolean compare (org.apache.spark.rdd.PartitionGroup o1, org.apache.spark.rdd.PartitionGroup o2)  { throw new RuntimeException(); }
  public  boolean compare (scala.Option<org.apache.spark.rdd.PartitionGroup> o1, scala.Option<org.apache.spark.rdd.PartitionGroup> o2)  { throw new RuntimeException(); }
  public  scala.util.Random rnd ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.rdd.PartitionGroup> groupArr ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.String, scala.collection.mutable.ArrayBuffer<org.apache.spark.rdd.PartitionGroup>> groupHash ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Set<org.apache.spark.Partition> initialHash ()  { throw new RuntimeException(); }
  public  boolean noLocality ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> currPrefLocs (org.apache.spark.Partition part, org.apache.spark.rdd.RDD<?> prev)  { throw new RuntimeException(); }
  /**
   * Sorts and gets the least element of the list associated with key in groupHash
   * The returned PartitionGroup is the least loaded of all groups that represent the machine "key"
   * <p>
   * @param key string representing a partitioned group on preferred machine key
   * @return Option of {@link PartitionGroup} that has least elements for key
   */
  public  scala.Option<org.apache.spark.rdd.PartitionGroup> getLeastGroupHash (java.lang.String key)  { throw new RuntimeException(); }
  public  boolean addPartToPGroup (org.apache.spark.Partition part, org.apache.spark.rdd.PartitionGroup pgroup)  { throw new RuntimeException(); }
  /**
   * Initializes targetLen partition groups. If there are preferred locations, each group
   * is assigned a preferredLocation. This uses coupon collector to estimate how many
   * preferredLocations it must rotate through until it has seen most of the preferred
   * locations (2 * n log(n))
   * @param targetLen
   * @param partitionLocs (undocumented)
   */
  public  void setupGroups (int targetLen, org.apache.spark.rdd.DefaultPartitionCoalescer.PartitionLocations partitionLocs)  { throw new RuntimeException(); }
  /**
   * Takes a parent RDD partition and decides which of the partition groups to put it in
   * Takes locality into account, but also uses power of 2 choices to load balance
   * It strikes a balance between the two using the balanceSlack variable
   * @param p partition (ball to be thrown)
   * @param balanceSlack determines the trade-off between load-balancing the partitions sizes and
   *                     their locality. e.g., balanceSlack=0.10 means that it allows up to 10%
   *                     imbalance in favor of locality
   * @return partition group (bin to be put in)
   * @param prev (undocumented)
   * @param partitionLocs (undocumented)
   */
  public  org.apache.spark.rdd.PartitionGroup pickBin (org.apache.spark.Partition p, org.apache.spark.rdd.RDD<?> prev, double balanceSlack, org.apache.spark.rdd.DefaultPartitionCoalescer.PartitionLocations partitionLocs)  { throw new RuntimeException(); }
  public  void throwBalls (int maxPartitions, org.apache.spark.rdd.RDD<?> prev, double balanceSlack, org.apache.spark.rdd.DefaultPartitionCoalescer.PartitionLocations partitionLocs)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.PartitionGroup[] getPartitions ()  { throw new RuntimeException(); }
  /**
   * Runs the packing algorithm and returns an array of PartitionGroups that if possible are
   * load balanced and grouped by locality
   * <p>
   * @return array of partition groups
   * @param maxPartitions (undocumented)
   * @param prev (undocumented)
   */
  public  org.apache.spark.rdd.PartitionGroup[] coalesce (int maxPartitions, org.apache.spark.rdd.RDD<?> prev)  { throw new RuntimeException(); }
}
