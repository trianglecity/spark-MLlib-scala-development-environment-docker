package org.apache.spark.rdd;
/**
 * Class representing partitions of PartitionerAwareUnionRDD, which maintains the list of
 * corresponding partitions of parent RDDs.
 */
  class PartitionerAwareUnionRDDPartition implements org.apache.spark.Partition {
  public  scala.collection.Seq<org.apache.spark.rdd.RDD<?>> rdds ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  // not preceding
  public   PartitionerAwareUnionRDDPartition (scala.collection.Seq<org.apache.spark.rdd.RDD<?>> rdds, int index)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] parents ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream oos) throws java.io.IOException { throw new RuntimeException(); }
}
