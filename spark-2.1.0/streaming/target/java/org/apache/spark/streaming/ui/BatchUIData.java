package org.apache.spark.streaming.ui;
  class BatchUIData implements scala.Product, scala.Serializable {
  static public  org.apache.spark.streaming.ui.BatchUIData apply (org.apache.spark.streaming.scheduler.BatchInfo batchInfo)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time batchTime ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.streaming.scheduler.StreamInputInfo> streamIdToInputInfo ()  { throw new RuntimeException(); }
  public  long submissionTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> processingStartTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> processingEndTime ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.streaming.ui.OutputOperationUIData> outputOperations ()  { throw new RuntimeException(); }
  public  scala.collection.Iterable<org.apache.spark.streaming.ui.OutputOpIdAndSparkJobId> outputOpIdSparkJobIdPairs ()  { throw new RuntimeException(); }
  // not preceding
  public   BatchUIData (org.apache.spark.streaming.Time batchTime, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.streaming.scheduler.StreamInputInfo> streamIdToInputInfo, long submissionTime, scala.Option<java.lang.Object> processingStartTime, scala.Option<java.lang.Object> processingEndTime, scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.streaming.ui.OutputOperationUIData> outputOperations, scala.collection.Iterable<org.apache.spark.streaming.ui.OutputOpIdAndSparkJobId> outputOpIdSparkJobIdPairs)  { throw new RuntimeException(); }
  /**
   * Time taken for the first job of this batch to start processing from the time this batch
   * was submitted to the streaming scheduler. Essentially, it is
   * <code>processingStartTime</code> - <code>submissionTime</code>.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> schedulingDelay ()  { throw new RuntimeException(); }
  /**
   * Time taken for the all jobs of this batch to finish processing from the time they started
   * processing. Essentially, it is <code>processingEndTime</code> - <code>processingStartTime</code>.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> processingDelay ()  { throw new RuntimeException(); }
  /**
   * Time taken for all the jobs of this batch to finish processing from the time they
   * were submitted.  Essentially, it is <code>processingDelay</code> + <code>schedulingDelay</code>.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> totalDelay ()  { throw new RuntimeException(); }
  /**
   * The number of recorders received by the receivers in this batch.
   * @return (undocumented)
   */
  public  long numRecords ()  { throw new RuntimeException(); }
  /**
   * Update an output operation information of this batch.
   * @param outputOperationInfo (undocumented)
   */
  public  void updateOutputOperationInfo (org.apache.spark.streaming.scheduler.OutputOperationInfo outputOperationInfo)  { throw new RuntimeException(); }
  /**
   * Return the number of failed output operations.
   * @return (undocumented)
   */
  public  int numFailedOutputOp ()  { throw new RuntimeException(); }
  /**
   * Return the number of running output operations.
   * @return (undocumented)
   */
  public  int numActiveOutputOp ()  { throw new RuntimeException(); }
  /**
   * Return the number of completed output operations.
   * @return (undocumented)
   */
  public  int numCompletedOutputOp ()  { throw new RuntimeException(); }
  /**
   * Return if this batch has any output operations
   * @return (undocumented)
   */
  public  boolean isFailed ()  { throw new RuntimeException(); }
}
