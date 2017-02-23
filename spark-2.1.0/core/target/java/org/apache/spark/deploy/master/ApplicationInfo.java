package org.apache.spark.deploy.master;
  class ApplicationInfo implements scala.Serializable {
  public  long startTime ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.ApplicationDescription desc ()  { throw new RuntimeException(); }
  public  java.util.Date submitDate ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef driver ()  { throw new RuntimeException(); }
  // not preceding
  public   ApplicationInfo (long startTime, java.lang.String id, org.apache.spark.deploy.ApplicationDescription desc, java.util.Date submitDate, org.apache.spark.rpc.RpcEndpointRef driver, int defaultCores)  { throw new RuntimeException(); }
  public  scala.Enumeration.Value state ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.deploy.master.ExecutorDesc> executors ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.deploy.master.ExecutorDesc> removedExecutors ()  { throw new RuntimeException(); }
  public  int coresGranted ()  { throw new RuntimeException(); }
  public  long endTime ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.ApplicationSource appSource ()  { throw new RuntimeException(); }
    int executorLimit ()  { throw new RuntimeException(); }
  private  int nextExecutorId ()  { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream in)  { throw new RuntimeException(); }
  private  void init ()  { throw new RuntimeException(); }
  private  int newExecutorId (scala.Option<java.lang.Object> useID)  { throw new RuntimeException(); }
    org.apache.spark.deploy.master.ExecutorDesc addExecutor (org.apache.spark.deploy.master.WorkerInfo worker, int cores, scala.Option<java.lang.Object> useID)  { throw new RuntimeException(); }
    void removeExecutor (org.apache.spark.deploy.master.ExecutorDesc exec)  { throw new RuntimeException(); }
  private  int requestedCores ()  { throw new RuntimeException(); }
    int coresLeft ()  { throw new RuntimeException(); }
  private  int _retryCount ()  { throw new RuntimeException(); }
    int retryCount ()  { throw new RuntimeException(); }
    int incrementRetryCount ()  { throw new RuntimeException(); }
    void resetRetryCount ()  { throw new RuntimeException(); }
    void markFinished (scala.Enumeration.Value endState)  { throw new RuntimeException(); }
    boolean isFinished ()  { throw new RuntimeException(); }
  /**
   * Return the limit on the number of executors this application can have.
   * For testing only.
   * @return (undocumented)
   */
    int getExecutorLimit ()  { throw new RuntimeException(); }
  public  long duration ()  { throw new RuntimeException(); }
}
