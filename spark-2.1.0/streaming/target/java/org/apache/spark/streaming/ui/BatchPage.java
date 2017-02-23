package org.apache.spark.streaming.ui;
  class BatchPage extends org.apache.spark.ui.WebUIPage {
  public   BatchPage (org.apache.spark.streaming.ui.StreamingTab parent)  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.ui.StreamingJobProgressListener streamingListener ()  { throw new RuntimeException(); }
  private  org.apache.spark.ui.jobs.JobProgressListener sparkListener ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> columns ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> generateJobRow (org.apache.spark.streaming.ui.OutputOperationUIData outputOpData, scala.collection.Seq<scala.xml.Node> outputOpDescription, java.lang.String formattedOutputOpDuration, int numSparkJobRowsInOutputOp, boolean isFirstRow, org.apache.spark.streaming.ui.SparkJobIdWithUIData sparkJob)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> generateOutputOpRowWithoutSparkJobs (org.apache.spark.streaming.ui.OutputOperationUIData outputOpData, scala.collection.Seq<scala.xml.Node> outputOpDescription, java.lang.String formattedOutputOpDuration)  { throw new RuntimeException(); }
  /**
   * Generate a row for a Spark Job. Because duplicated output op infos needs to be collapsed into
   * one cell, we use "rowspan" for the first row of an output op.
   * @param outputOpData (undocumented)
   * @param outputOpDescription (undocumented)
   * @param formattedOutputOpDuration (undocumented)
   * @param numSparkJobRowsInOutputOp (undocumented)
   * @param isFirstRow (undocumented)
   * @param sparkJob (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<scala.xml.Node> generateNormalJobRow (org.apache.spark.streaming.ui.OutputOperationUIData outputOpData, scala.collection.Seq<scala.xml.Node> outputOpDescription, java.lang.String formattedOutputOpDuration, int numSparkJobRowsInOutputOp, boolean isFirstRow, org.apache.spark.ui.jobs.UIData.JobUIData sparkJob)  { throw new RuntimeException(); }
  /**
   * If a job is dropped by sparkListener due to exceeding the limitation, we only show the job id
   * with "-" cells.
   * @param outputOpData (undocumented)
   * @param outputOpDescription (undocumented)
   * @param formattedOutputOpDuration (undocumented)
   * @param numSparkJobRowsInOutputOp (undocumented)
   * @param isFirstRow (undocumented)
   * @param jobId (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<scala.xml.Node> generateDroppedJobRow (org.apache.spark.streaming.ui.OutputOperationUIData outputOpData, scala.collection.Seq<scala.xml.Node> outputOpDescription, java.lang.String formattedOutputOpDuration, int numSparkJobRowsInOutputOp, boolean isFirstRow, int jobId)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> generateOutputOpIdRow (org.apache.spark.streaming.ui.OutputOperationUIData outputOpData, scala.collection.Seq<org.apache.spark.streaming.ui.SparkJobIdWithUIData> sparkJobs)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> generateOutputOpDescription (org.apache.spark.streaming.ui.OutputOperationUIData outputOp)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.ui.jobs.UIData.JobUIData> getJobData (int sparkJobId)  { throw new RuntimeException(); }
  private  java.lang.String generateOutputOperationStatusForUI (java.lang.String failure)  { throw new RuntimeException(); }
  /**
   * Generate the job table for the batch.
   * @param batchUIData (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<scala.xml.Node> generateJobTable (org.apache.spark.streaming.ui.BatchUIData batchUIData)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> generateInputMetadataTable (scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.String>> inputMetadatas)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> generateInputMetadataRow (scala.Tuple2<java.lang.Object, java.lang.String> inputMetadata)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> metadataDescriptionToHTML (java.lang.String metadataDescription)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> outputOpStatusCell (org.apache.spark.streaming.ui.OutputOperationUIData outputOp, int rowspan)  { throw new RuntimeException(); }
}
