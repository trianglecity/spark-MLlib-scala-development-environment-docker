package org.apache.spark.rdd;
/**
 * This class contains all the information related to RDD checkpointing. Each instance of this
 * class is associated with an RDD. It manages process of checkpointing of the associated RDD,
 * as well as, manages the post-checkpoint state by providing the updated partitions,
 * iterator and preferred locations of the checkpointed RDD.
 */
 abstract class RDDCheckpointData<T extends java.lang.Object> implements scala.Serializable {
  private  org.apache.spark.rdd.RDD<T> rdd ()  { throw new RuntimeException(); }
  // not preceding
  public   RDDCheckpointData (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  protected  scala.Enumeration.Value cpState ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.rdd.CheckpointRDD<T>> cpRDD ()  { throw new RuntimeException(); }
  /**
   * Return whether the checkpoint data for this RDD is already persisted.
   * @return (undocumented)
   */
  public  boolean isCheckpointed ()  { throw new RuntimeException(); }
  /**
   * Materialize this RDD and persist its content.
   * This is called immediately after the first action invoked on this RDD has completed.
   */
  public final  void checkpoint ()  { throw new RuntimeException(); }
  /**
   * Materialize this RDD and persist its content.
   * <p>
   * Subclasses should override this method to define custom checkpointing behavior.
   * @return the checkpoint RDD created in the process.
   */
  protected abstract  org.apache.spark.rdd.CheckpointRDD<T> doCheckpoint ()  ;
  /**
   * Return the RDD that contains our checkpointed data.
   * This is only defined if the checkpoint state is <code>Checkpointed</code>.
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.rdd.CheckpointRDD<T>> checkpointRDD ()  { throw new RuntimeException(); }
  /**
   * Return the partitions of the resulting checkpoint RDD.
   * For tests only.
   * @return (undocumented)
   */
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
}
