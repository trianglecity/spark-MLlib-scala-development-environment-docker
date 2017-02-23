package org.apache.spark.rdd;
/**
 * Stores information about the narrow dependencies used by a CoGroupedRdd.
 * <p>
 * param:  narrowDeps maps to the dependencies variable in the parent RDD: for each one to one
 *                   dependency in dependencies, narrowDeps has a NarrowCoGroupSplitDep (describing
 *                   the partition for that dependency) at the corresponding index. The size of
 *                   narrowDeps should always be equal to the number of parents.
 */
  class CoGroupPartition implements org.apache.spark.Partition, scala.Serializable {
  public  int index ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.NarrowCoGroupSplitDep>[] narrowDeps ()  { throw new RuntimeException(); }
  // not preceding
  public   CoGroupPartition (int index, scala.Option<org.apache.spark.rdd.NarrowCoGroupSplitDep>[] narrowDeps)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
}
