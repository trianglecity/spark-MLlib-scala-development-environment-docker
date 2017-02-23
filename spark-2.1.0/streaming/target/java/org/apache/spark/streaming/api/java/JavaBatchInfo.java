package org.apache.spark.streaming.api.java;
/**
 * Class having information on batches.
 * <p>
 * param:  batchTime Time of the batch
 * param:  streamIdToInputInfo A map of input stream id to its input info
 * param:  submissionTime Clock time of when jobs of this batch was submitted to the streaming
 *                       scheduler queue
 * param:  processingStartTime Clock time of when the first job of this batch started processing.
 *                            <code>-1</code> means the batch has not yet started
 * param:  processingEndTime Clock time of when the last job of this batch finished processing. <code>-1</code>
 *                          means the batch has not yet completed.
 * param:  schedulingDelay Time taken for the first job of this batch to start processing from the
 *                        time this batch was submitted to the streaming scheduler. Essentially, it
 *                        is <code>processingStartTime</code> - <code>submissionTime</code>. <code>-1</code> means the batch has not
 *                        yet started
 * param:  processingDelay Time taken for the all jobs of this batch to finish processing from the
 *                        time they started processing. Essentially, it is
 *                        <code>processingEndTime</code> - <code>processingStartTime</code>. <code>-1</code> means the batch has not
 *                        yet completed.
 * param:  totalDelay Time taken for all the jobs of this batch to finish processing from the time
 *                   they were submitted.  Essentially, it is <code>processingDelay</code> + <code>schedulingDelay</code>.
 *                   <code>-1</code> means the batch has not yet completed.
 * param:  numRecords The number of recorders received by the receivers in this batch
 * param:  outputOperationInfos The output operations in this batch
 */
  class JavaBatchInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time batchTime ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.Object, org.apache.spark.streaming.api.java.JavaStreamInputInfo> streamIdToInputInfo ()  { throw new RuntimeException(); }
  public  long submissionTime ()  { throw new RuntimeException(); }
  public  long processingStartTime ()  { throw new RuntimeException(); }
  public  long processingEndTime ()  { throw new RuntimeException(); }
  public  long schedulingDelay ()  { throw new RuntimeException(); }
  public  long processingDelay ()  { throw new RuntimeException(); }
  public  long totalDelay ()  { throw new RuntimeException(); }
  public  long numRecords ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.Object, org.apache.spark.streaming.api.java.JavaOutputOperationInfo> outputOperationInfos ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaBatchInfo (org.apache.spark.streaming.Time batchTime, java.util.Map<java.lang.Object, org.apache.spark.streaming.api.java.JavaStreamInputInfo> streamIdToInputInfo, long submissionTime, long processingStartTime, long processingEndTime, long schedulingDelay, long processingDelay, long totalDelay, long numRecords, java.util.Map<java.lang.Object, org.apache.spark.streaming.api.java.JavaOutputOperationInfo> outputOperationInfos)  { throw new RuntimeException(); }
}
