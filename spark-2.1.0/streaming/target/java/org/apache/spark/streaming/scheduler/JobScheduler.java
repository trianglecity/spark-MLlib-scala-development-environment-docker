package org.apache.spark.streaming.scheduler;
/**
 * This class schedules jobs to be run on Spark. It uses the JobGenerator to generate
 * the jobs and runs them using a thread pool.
 */
  class JobScheduler implements org.apache.spark.internal.Logging {
  private  class JobHandler implements java.lang.Runnable, org.apache.spark.internal.Logging {
    public   JobHandler (org.apache.spark.streaming.scheduler.Job job)  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  static public  java.lang.String BATCH_TIME_PROPERTY_KEY ()  { throw new RuntimeException(); }
  static public  java.lang.String OUTPUT_OP_ID_PROPERTY_KEY ()  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  // not preceding
  public   JobScheduler (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  private  java.util.Map<org.apache.spark.streaming.Time, org.apache.spark.streaming.scheduler.JobSet> jobSets ()  { throw new RuntimeException(); }
  private  int numConcurrentJobs ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ThreadPoolExecutor jobExecutor ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.scheduler.JobGenerator jobGenerator ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.StreamingListenerBus listenerBus ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.ReceiverTracker receiverTracker ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.InputInfoTracker inputInfoTracker ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.streaming.scheduler.ExecutorAllocationManager> executorAllocationManager ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.EventLoop<org.apache.spark.streaming.scheduler.JobSchedulerEvent> eventLoop ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop (boolean processAllReceivedData)  { throw new RuntimeException(); }
  public  void submitJobSet (org.apache.spark.streaming.scheduler.JobSet jobSet)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.Time> getPendingTimes ()  { throw new RuntimeException(); }
  public  void reportError (java.lang.String msg, java.lang.Throwable e)  { throw new RuntimeException(); }
  public  boolean isStarted ()  { throw new RuntimeException(); }
  private  void processEvent (org.apache.spark.streaming.scheduler.JobSchedulerEvent event)  { throw new RuntimeException(); }
  private  void handleJobStart (org.apache.spark.streaming.scheduler.Job job, long startTime)  { throw new RuntimeException(); }
  private  void handleJobCompletion (org.apache.spark.streaming.scheduler.Job job, long completedTime)  { throw new RuntimeException(); }
  private  void handleError (java.lang.String msg, java.lang.Throwable e)  { throw new RuntimeException(); }
}
