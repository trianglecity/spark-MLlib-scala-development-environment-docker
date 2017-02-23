package org.apache.spark.streaming.scheduler;
/**
 * Class representing a Spark computation. It may contain multiple Spark jobs.
 */
  class Job {
  public  org.apache.spark.streaming.Time time ()  { throw new RuntimeException(); }
  // not preceding
  public   Job (org.apache.spark.streaming.Time time, scala.Function0<?> func)  { throw new RuntimeException(); }
  private  java.lang.String _id ()  { throw new RuntimeException(); }
  private  int _outputOpId ()  { throw new RuntimeException(); }
  private  boolean isSet ()  { throw new RuntimeException(); }
  private  scala.util.Try<?> _result ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.CallSite _callSite ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> _startTime ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> _endTime ()  { throw new RuntimeException(); }
  public  void run ()  { throw new RuntimeException(); }
  public  scala.util.Try<?> result ()  { throw new RuntimeException(); }
  /**
   * @return the global unique id of this Job.
   */
  public  java.lang.String id ()  { throw new RuntimeException(); }
  /**
   * @return the output op id of this Job. Each Job has a unique output op id in the same JobSet.
   */
  public  int outputOpId ()  { throw new RuntimeException(); }
  public  void setOutputOpId (int outputOpId)  { throw new RuntimeException(); }
  public  void setCallSite (org.apache.spark.util.CallSite callSite)  { throw new RuntimeException(); }
  public  org.apache.spark.util.CallSite callSite ()  { throw new RuntimeException(); }
  public  void setStartTime (long startTime)  { throw new RuntimeException(); }
  public  void setEndTime (long endTime)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.OutputOperationInfo toOutputOperationInfo ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
